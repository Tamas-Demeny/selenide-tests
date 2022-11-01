package org.example.emagpages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public abstract class BasePage {
    private final SelenideElement SEND_TO_SEARCH_BAR = $(By.xpath("//input[@type=\"search\"]"));
    private final SelenideElement SEARCH_BUTTON = $(By.xpath("//i[@class=\"em em-search\"]"));
    private final SelenideElement ACCOUNT_LOGIN = $(By.xpath("//a[@id=\"my_account\"]"));

    public void sendProductName(String searchedItem) {
        SEND_TO_SEARCH_BAR.setValue(searchedItem);
    }

    public SearchedProductsPage clickSearch() {
        SEARCH_BUTTON.click();
        return  new SearchedProductsPage();
    }

    public LoginPage clickAccountLoginButton() {
        ACCOUNT_LOGIN.click();
        return new LoginPage();
    }
}