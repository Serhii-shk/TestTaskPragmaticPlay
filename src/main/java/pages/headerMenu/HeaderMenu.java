package pages.headerMenu;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import pages.base.BasePage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HeaderMenu extends BasePage {
    private final SelenideElement homeItem = $x("//li[@id='menu-item-1185']/a[text()='Home']");
    private final SelenideElement productsMenuItem = $x("//a[text()='Products']/div[@class='arrow-menu']");
    private final SelenideElement clientHubItem = $x("//li[@id='menu-item-23582']/a[@target='_blank']");
    private final SelenideElement companyItem = $x("//a[text()='Company']/div[@class='arrow-menu']");
    private final SelenideElement newsItem = $x("//li[@id='menu-item-9841']/a[text()='News']");
    private final SelenideElement contactItem = $x("//li[@id='menu-item-1820']/a[text()='Contact']");
    private final SelenideElement bingoItem = $x("//li[@id='menu-item-11081']/a[text()='Bingo']");
    private final SelenideElement liveCasinoItem = $x("//li[@id='menu-item-5230']/a[text()='Live Casino']");



     String getColorItem(SelenideElement element) {
        String colorItem = element.getCssValue("color");
        return colorItem;
    }

    public String getColorHomeItem() {
        return getColorItem(homeItem);
    }
    public HeaderMenu hoverHomeItem() {
        homeItem.shouldBe(Condition.visible).hover();
        return this;
    }

    public String getColorProductsMenuItem() {
        return getColorItem(productsMenuItem);
    }
    public HeaderMenu hoverProductsMenuItem() {
        productsMenuItem.shouldBe(Condition.visible).hover();
        return this;
    }

    public HeaderMenu hoverClientHubItem() {
        clientHubItem.shouldBe(Condition.visible).hover();
        return this;
    }
    public String getColorClientHubItem() {
        return getColorItem(clientHubItem);
    }

    public HeaderMenu hoverCompanyItem() {
        companyItem.shouldBe(Condition.visible).hover();
        return this;
    }
    public String getColorCompanyItem() {
        return getColorItem(companyItem);
    }

    public HeaderMenu hoverNewsItem() {
        newsItem.shouldBe(Condition.visible).hover();
        return this;
    }
    public String getColorNewsItem() {
        return getColorItem(newsItem);
    }

    public HeaderMenu hoverContactItem() {
        contactItem.shouldBe(Condition.visible).hover();
        return this;
    }
    public String getColorContactItem() {
        return getColorItem(contactItem);
    }

    /** Clicking a Product Menu item on header */
    public HeaderMenu clickProductsMenuItem() {
        productsMenuItem.shouldBe(Condition.visible).click();
        return this;
    }
    public HeaderMenu hoverBingoItem() {
//        actions().moveToElement(bingoItem).perform();
        bingoItem.shouldBe(Condition.visible).hover();
        return this;
    }
    public String getColorBingoItem() {
        return getColorItem(bingoItem);
    }
















}
