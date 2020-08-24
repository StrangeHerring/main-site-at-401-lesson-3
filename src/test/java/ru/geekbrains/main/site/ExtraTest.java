package ru.geekbrains.main.site;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.base.BaseWebSettingsTest;
import ru.geekbrains.main.site.page.AuthorizationPage;
import ru.geekbrains.main.site.page.ContentPage;

public class ExtraTest extends BaseWebSettingsTest {
    @Test
    void name() {
        driver.get("https://geekbrains.ru/login");
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.getInputLogin().sendKeys("hks47018@eoopy.com");
        authorizationPage.getInputPassword().sendKeys("hks47018");
        authorizationPage.getButtonSingIn().click();

        ContentPage contentPage = new ContentPage(driver);
        contentPage.checkPageName("Главная");
    }
    @Test
    @MethodSource("Курсы")
    public void checkNavigationNotPopUp(String button) {
        driver.get("https://geekbrains.ru/");
        new ContentPage(driver)
                .getNavigationBlock().clickButton(button)
//                .closePopUp()
                .checkPageName(button);
    }
}
