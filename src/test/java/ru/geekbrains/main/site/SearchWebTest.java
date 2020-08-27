package ru.geekbrains.main.site;

import io.qameta.allure.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.base.BaseWebSettingsTest;
import ru.geekbrains.main.site.page.AuthorizationPage;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.*;

@Epic("Web UI тесты")
@Feature("Поиск")
@Story("Проверка отображения всех блоков")
@DisplayName("Поиск")
public class SearchWebTest extends BaseWebSettingsTest {


    @BeforeEach
    void beforeSearchTest() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @DisplayName("Проверка количества контента")
    @Test
    @Description("Дополнительная информация по тесту")
    @Issue("Issue_LINK")
    @TmsLink("BUG_LINK")
    void searchTest() {
        driver.get("https://geekbrains.ru/login");
        new AuthorizationPage(driver)
                .singIn("hks47018@eoopy.com","hks47018")
                .checkPageName("Главная")
                .getHeaderBlock()
                .searchText("java")
                .getSearchTabsBlock()
                .checkCount("Профессии", greaterThanOrEqualTo(2))
                .checkCount("Курсы", greaterThan(15))
                .checkCount("Вебинары", allOf(greaterThan(180), lessThan(300)))
                .checkCount("Блоги", greaterThan(300))
                .checkCount("Форумы", not(350))
                .checkCount("Тесты", not(0));
    }
}
