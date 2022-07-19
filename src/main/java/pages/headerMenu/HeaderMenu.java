package pages.headerMenu;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class HeaderMenu extends BasePage {
    private static final SelenideElement homeItem = $x("//li[@id='menu-item-1185']/a[text()='Home']");
    private final SelenideElement productsMenuItem = $x("//a[@title='Games']");
    private final SelenideElement clientHubItem = $x("//li[@id='menu-item-23582']/a[@target='_blank']");
    private final SelenideElement companyItem = $x("//li[@id='menu-item-57201']/a[text()='Company']");
    private final SelenideElement newsItem = $x("//li[@id='menu-item-9841']/a[text()='News']");
    private final SelenideElement contactItem = $x("//li[@id='menu-item-1820']/a[text()='Contact']");
    private final SelenideElement liveCasinoItem = $x("//li[@id='menu-item-5230']/a[text()='Live Casino']");



    public static String itemOrangeColor = "rgb(255, 128, 14)";
    public static String itemWhiteColor = "rgb(255, 255, 255)";

    /** Clicking a Product Menu item on header */
    public HeaderMenu clickOnProductMenu() {
        productsMenuItem.click();
        return this;
    }

    public String getColorHomeItem() {
        String colorItem = homeItem.getCssValue("color");
        return colorItem;
    }

    public HeaderMenu hoverHomeItem() {
        homeItem.hover();
        return this;
    }

    public HeaderMenu clickProductsMenuItem() {
        productsMenuItem.shouldBe(Condition.visible).click();
        return this;
    }

    public String getColorProductsMenuItem() {
        String colorItem = productsMenuItem.getCssValue("color");
        return colorItem;
    }

    public HeaderMenu hoverProductsMenuItem() {
        productsMenuItem.hover();
        return this;
    }

    public HeaderMenu hoverClientHubItem() {
        clientHubItem.hover();
        return this;
    }








}
