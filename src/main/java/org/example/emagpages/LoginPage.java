package org.example.emagpages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.impl.Randomizer;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage{
    private final SelenideElement USERNAME_INPUT = $(By.xpath("//input[@id=\"user_login_email\"]")).shouldHave(Condition.appear);
    private final SelenideElement CONTINUE_BUTTON = $(By.xpath("//button[@id=\"user_login_continue\"]"));

    public void negativeUsernameInput() {
        USERNAME_INPUT.sendKeys(randomName() + "@yahoo.com");
    }

    public CreateAccountPage clickContinueButton() {
        CONTINUE_BUTTON.click();
        return new CreateAccountPage();
    }

    public String randomName() {
        String randomName = String.valueOf(new Randomizer());
        return randomName;
    }
}
