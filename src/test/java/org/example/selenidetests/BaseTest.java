package org.example.selenidetests;

import org.example.emagpages.MainPage;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    @BeforeMethod
    public void openPage() {
        open("https://www.emag.ro/");
    }
}
