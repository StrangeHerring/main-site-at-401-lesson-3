package ru.geekbrains.main.site;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchTest extends BaseSettingsTest {
    @Test
    public void searchTextJava(){
        WebElement buttonSearch = driver.findElement(By.cssSelector("a>[class=\"svg-icon icon-search \"]"));
        buttonSearch.click();

        WebElement inputSearch = driver.findElement(By.cssSelector("[class=\"search-panel__search-field\"]"));
        inputSearch.sendKeys("java");

        WebElement textProfessions = driver.findElement(By.cssSelector("[id=\"professions\"] h2"));
        String strProf = driver.findElement(By.xpath("//div[1]//ul [@class=\"search-page-block__helper\"]//span")).getText();
        int intProf = Integer.parseInt(strProf);
        if (intProf > 2){
            System.out.println("+");
        }else{
            System.out.println("-");
        }

        WebElement textCourses = driver.findElement(By.xpath("//header//h2[text()=\"Курсы\"]"));
        WebElement textWebinar = driver.findElement(By.xpath("//header//h2[text()=\"Вебинары\"]"));
        WebElement textBlog = driver.findElement(By.xpath("//header//h2[text()=\"Блоги\"]"));
        WebElement textForum = driver.findElement(By.xpath("//header//h2[text()=\"Форум\"]"));
        WebElement textTests = driver.findElement(By.xpath("//header//h2[text()=\"Тесты\"]"));
        WebElement textProject = driver.findElement(By.xpath("//header//h2[text()=\"Проекты и компании\"]"));

        wait30second.until(ExpectedConditions.visibilityOf(textProfessions));
        wait30second.until(ExpectedConditions.visibilityOf(textCourses));
        wait30second.until(ExpectedConditions.visibilityOf(textWebinar));
        wait30second.until(ExpectedConditions.visibilityOf(textBlog));
        wait30second.until(ExpectedConditions.visibilityOf(textForum));
        wait30second.until(ExpectedConditions.visibilityOf(textTests));
        wait30second.until(ExpectedConditions.visibilityOf(textProject));
    }
}
