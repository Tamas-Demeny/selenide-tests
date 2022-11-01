package org.example.emagpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;

public class SearchedProductsPage extends BasePage{

    public String getGameTitle(WebElement locator) {
        return locator.getText();
    }

    public ProductPage clickOnProduct(WebElement locator) {
        locator.click();
        return new ProductPage();
    }
}
