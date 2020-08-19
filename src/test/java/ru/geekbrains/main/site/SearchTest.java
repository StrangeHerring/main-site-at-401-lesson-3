package ru.geekbrains.main.site;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchTest extends BaseSettingsTest {
    @Test
    public void searchTextJava() {
        WebElement buttonSearch = driver.findElement(By.cssSelector("a>[class=\"svg-icon icon-search \"]"));
        buttonSearch.click();

        WebElement inputSearch = driver.findElement(By.cssSelector("[class=\"search-panel__search-field\"]"));
        inputSearch.sendKeys("java");
    }

    @Test
    public void checkProf() {
        searchTextJava();
        WebElement textProfessions = driver.findElement(By.cssSelector("[id=\"professions\"] h2"));
        wait30second.until(ExpectedConditions.visibilityOf(textProfessions));
        String strProf = driver.findElement(By.xpath("//div[1]//ul [@class=\"search-page-block__helper\"]//span")).getText();
        int intProf = Integer.parseInt(strProf);
        int actual = 2;
        MatcherAssert.assertThat(
                intProf,
                Matchers.greaterThanOrEqualTo(actual)
        );
    }
    @Test
            public void checkCourses(){
        searchTextJava();
        WebElement textCourses = driver.findElement(By.xpath("//header//h2[text()=\"Курсы\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(textCourses));
        String strCourses = driver.findElement(By.xpath("/html/body/div[1]/div[10]/div/div[2]/div/div/div[2]/div[1]/header/ul/li/a/span")).getText();
        int intCourses = Integer.parseInt(strCourses);
        int actual = 15;
        MatcherAssert.assertThat(
                intCourses,
                Matchers.greaterThan(actual)
        );
    }

    @Test
            public void checkWebinar(){
        searchTextJava();
        WebElement textWebinar = driver.findElement(By.xpath("//header//h2[text()=\"Вебинары\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(textWebinar));
        String strWebinar = driver.findElement(By.xpath("//div[3]//ul [@class=\"search-page-block__helper\"]//span")).getText();
        int intWebinar = Integer.parseInt(strWebinar);
        int actual1 = 180;
        int actual2 = 300;
        MatcherAssert.assertThat(
                intWebinar,
                Matchers.allOf(
                        Matchers.greaterThan(actual1),
                        Matchers.lessThan(actual2)
                )
        );
    }

    @Test
            public void checkBlog(){
        searchTextJava();
        WebElement textBlog = driver.findElement(By.xpath("//header//h2[text()=\"Блоги\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(textBlog));
        String strBlog = driver.findElement(By.xpath("//div[4]//ul [@class=\"search-page-block__helper\"]//span")).getText();
        int intBlog = Integer.parseInt(strBlog);
        int actual = 300;
        MatcherAssert.assertThat(
                intBlog,
                Matchers.greaterThan(actual)
        );
    }
    @Test
            public void checkForum(){
        searchTextJava();
        WebElement textForum = driver.findElement(By.xpath("//header//h2[text()=\"Форум\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(textForum));
        String strForum = driver.findElement(By.xpath("//div[5]//ul [@class=\"search-page-block__helper\"]//span")).getText();
        int intForum = Integer.parseInt(strForum);
        int actual = 350;
        MatcherAssert.assertThat(
                intForum,
                Matchers.not(actual)
        );
    }
    @Test
            public void checkTest(){
        searchTextJava();
        WebElement textTests = driver.findElement(By.xpath("//header//h2[text()=\"Тесты\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(textTests));
        String strTests = driver.findElement(By.xpath("//div[6]//ul [@class=\"search-page-block__helper\"]//span")).getText();
        int intTests = Integer.parseInt(strTests);
        int actual = 0;
        MatcherAssert.assertThat(
                intTests,
                Matchers.not(actual)
        );
    }
    @Test
            public void checkProject(){
        searchTextJava();
        WebElement textProject = driver.findElement(By.xpath("//header//h2[text()=\"Проекты и компании\"]"));
        driver.findElement(By.xpath("//div [@class=\"company-item\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(textProject));
    }











    }

