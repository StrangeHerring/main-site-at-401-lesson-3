package ru.geekbrains.main.site;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NavigationTest extends BaseSettingsTest {
    @Test
    public void checkEvents(){
        WebElement eventsButton = driver.findElement(By.cssSelector("aside nav [href=\"/events\"]"));
        eventsButton.click();

        WebElement eventsTitlePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Вебинары", eventsTitlePage.getText());

        WebElement eventsFooter = driver.findElement(By.cssSelector("[class=\"site-footer\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(eventsFooter));

        WebElement eventsHeader = driver.findElement(By.cssSelector("[class=\"gb-header js-main-top-menu\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(eventsHeader));
    }
    @Test
    public void checkTopics(){
        driver.findElement(By.cssSelector("aside nav [href=\"/topics\"]")).click();
        String textTopics = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]")).getText();
        Assertions.assertEquals("Форум", textTopics);

        WebElement topicsFooter = driver.findElement(By.cssSelector("[class=\"site-footer\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(topicsFooter));

        WebElement topicsHeader = driver.findElement(By.cssSelector("[class=\"gb-header js-main-top-menu\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(topicsHeader));
    }
    @Test
    public void checkPosts(){
        driver.findElement(By.cssSelector("aside nav [href=\"/posts\"]")).click();
        String textPosts = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]")).getText();
        Assertions.assertEquals("Блог", textPosts);

        WebElement postsFooter = driver.findElement(By.cssSelector("[class=\"site-footer\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(postsFooter));

        WebElement postsHeader = driver.findElement(By.cssSelector("[class=\"gb-header js-main-top-menu\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(postsHeader));
    }
    @Test
    public void checkTests(){
        driver.findElement(By.cssSelector("aside nav [href=\"/tests\"]")).click();
        String textTest = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]")).getText();
        Assertions.assertEquals("Тесты", textTest);

        WebElement testsFooter = driver.findElement(By.cssSelector("[class=\"site-footer\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(testsFooter));

        WebElement testsHeader = driver.findElement(By.cssSelector("[class=\"gb-header js-main-top-menu\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(testsHeader));
    }
    @Test
    public void checkCareer(){
        driver.findElement(By.cssSelector("aside nav [href=\"/career\"]")).click();
        String textCareer = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]")).getText();
        Assertions.assertEquals("Карьера", textCareer);

        WebElement careerFooter = driver.findElement(By.cssSelector("[class=\"site-footer\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(careerFooter));

        WebElement careerHeader = driver.findElement(By.cssSelector("[class=\"gb-header js-main-top-menu\"]"));
        wait30second.until(ExpectedConditions.visibilityOf(careerHeader));
    }
}
