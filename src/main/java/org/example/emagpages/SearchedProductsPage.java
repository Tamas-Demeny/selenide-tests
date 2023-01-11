package org.example.emagpages;

import org.openqa.selenium.WebElement;

public class SearchedProductsPage extends BasePage{

    public String getGameTitle(WebElement locator) {
        return locator.getText();
    }

    public ProductPage clickOnProduct(WebElement locator) {
        locator.click();
        return new ProductPage();
    }
}
