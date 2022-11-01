package org.example.emagpages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreateAccountPage extends BasePage{
    public final SelenideElement NO_ACCOUNT_MESSAGE = $(By.xpath("//div[@class=\"h2\"]"));

}
