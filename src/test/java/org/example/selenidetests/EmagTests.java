package org.example.selenidetests;

import com.codeborne.selenide.WebDriverRunner;
import org.example.emagpages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.*;
public class EmagTests extends BaseTest{

    @Test
    public void emagSearchTest() {
        MainPage mainPage = new MainPage();
        mainPage.sendProductName("Stellaris");
        SearchedProductsPage searchedProductsPage = mainPage.clickSearch();

        WebElement STELLARIS_PC = $(By.xpath("//a[contains(@class,\"card-v2-title\")][contains(text(),\"Joc Stellaris S\")]"))
                .shouldHave(appear);
        String gameTitle = searchedProductsPage.getGameTitle(STELLARIS_PC);
        Assert.assertEquals(gameTitle, "Joc Stellaris Steam Key Global PC (Cod Activare Instant)");

        ProductPage productPage = searchedProductsPage.clickOnProduct(STELLARIS_PC);
        String inStock = productPage.getInStockMessage();

        Assert.assertEquals(inStock, "În stoc".toLowerCase());
    }

    @Test
    public void emptySearchTest() {
        MainPage mainPage = new MainPage();
        mainPage.clickSearch();

        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(), "https://www.emag.ro/");
    }

    @Test
    public void loginWithNonExistingUser() {
        MainPage mainPage = new MainPage();
        LoginPage loginPage = mainPage.clickAccountLoginButton();
        loginPage.negativeUsernameInput();
        CreateAccountPage createAccountPage = loginPage.clickContinueButton();

        // Test result may vary based on eMags' "Not a robot" verification
                Assert.assertEquals(createAccountPage.NO_ACCOUNT_MESSAGE.getText(),
                "\n" + "            Se pare că nu ai un cont eMAG." +
                " Hai să iți creăm un cont nou!\n" +
                        "        ");
    }
}
