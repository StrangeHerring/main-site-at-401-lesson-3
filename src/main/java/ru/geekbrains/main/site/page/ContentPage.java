package ru.geekbrains.main.site.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.main.site.BasePage;
import ru.geekbrains.main.site.block.HeaderBlock;
import ru.geekbrains.main.site.block.NavigationBlock;

public class ContentPage extends BasePage {

    private HeaderBlock headerBlock;
    private NavigationBlock navigationBlock;

    @FindBy(css = "[class=\"gb-empopup-close\"]")
    private WebElement popUp1;

    @FindBy(css = "button>[class=\"svg-icon icon-popup-close-button \"]")
    private WebElement popUp2;

    public ContentPage(WebDriver driver) {
        super(driver);
        this.headerBlock = new HeaderBlock(driver);
        this.navigationBlock = new NavigationBlock(driver);
    }

    public ContentPage checkPageName(String expectedNamePage) {
        headerBlock.checkNamePage(expectedNamePage);
        return this;
    }

    @Step("Закрытие PopUp-ов")
    public ContentPage closePopUp(){
        popUp1.click();
        popUp2.click();

        return this;
    }

    public HeaderBlock getHeaderBlock() {
        return headerBlock;
    }

    public NavigationBlock getNavigationBlock() {
        return navigationBlock;
    }
}
