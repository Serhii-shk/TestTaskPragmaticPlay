package pages.headerMenu;

import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class HeaderMenu extends BasePage {
    private final SelenideElement homeItem = $x("//li[@id='menu-item-1185']/a[text()='Home']");
    private final SelenideElement productsMenu = $x("//a[@title='Games']");
    private final SelenideElement clientHubItem = $x("//li[@id='menu-item-23582']/a[@target='_blank']");
    private final SelenideElement companyItem = $x("//li[@id='menu-item-57201']/a[text()='Company']");
    private final SelenideElement newsItem = $x("//li[@id='menu-item-9841']/a[text()='News']");
    private final SelenideElement contactItem = $x("//li[@id='menu-item-1820']/a[text()='Contact']");

    /** Clicking a Product Menu item on header */
    public HeaderMenu clickOnProductMenu() {
        productsMenu.click();
        return this;
    }

}
