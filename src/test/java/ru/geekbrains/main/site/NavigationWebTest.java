package ru.geekbrains.main.site;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.base.BaseWebSettingsTest;
import ru.geekbrains.main.site.page.ContentPage;

import java.util.stream.Stream;

@Epic("Web UI тесты")
@Feature("Навигация")
@Story("Переход по навигации")
@DisplayName("Навигация")
public class NavigationWebTest extends BaseWebSettingsTest {

    @ParameterizedTest(name = "{index} => Нажатие на: {0}")

    @MethodSource("stringProviderNotPopUp")
    public void checkNavigationNotPopUp(String button) {
        driver.get("https://geekbrains.ru/career");
        new ContentPage(driver)
                .getNavigationBlock().clickButton(button)
//                .closePopUp()
                .checkPageName(button);
    }

    public static Stream<String> stringProviderNotPopUp() {
        return Stream.of(
                "Вебинары",
                "Форум",
                "Блог",
                "Тесты"
        );
    }
    @DisplayName("Проверка страницы Блог с PopUP")
    @Test
    public void checkNavigationPopUp() {
        driver.get("https://geekbrains.ru/career");

        new ContentPage(driver)
                .getNavigationBlock().clickButton("Блог")
                .closePopUp()
                .checkPageName("Блог");
    }
}
