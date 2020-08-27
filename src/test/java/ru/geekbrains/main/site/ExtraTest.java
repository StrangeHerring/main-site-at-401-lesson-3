package ru.geekbrains.main.site;

//
//public class ExtraTest extends BaseWebSettingsTest {
//    @Test
//    void name() {
//        driver.get("https://geekbrains.ru/login");
//        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
//        authorizationPage.getInputLogin().sendKeys("hks47018@eoopy.com");
//        authorizationPage.getInputPassword().sendKeys("hks47018");
//        authorizationPage.getButtonSingIn().click();
//
//        ContentPage contentPage = new ContentPage(driver);
//        contentPage.checkPageName("Главная");
//    }
//    @Test
//    @MethodSource("Курсы")
//    public void checkNavigationNotPopUp(String button) {
//        driver.get("https://geekbrains.ru/");
//        new ContentPage(driver)
//                .getNavigationBlock().clickButton(button)
////                .closePopUp()
//                .checkPageName(button);
//    }
//}
