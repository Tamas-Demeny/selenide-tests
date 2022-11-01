package org.example.emagpages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage extends BasePage{
    private final SelenideElement IN_STOCK_MESSAGE = $(By.xpath("//span[@class=\"label label-in_stock\"]"));

    public String getInStockMessage(){
        return IN_STOCK_MESSAGE.getText();
    }
}
