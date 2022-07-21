package pages.headerMenu;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;
import pages.bingo.BingoPage;

import static com.codeborne.selenide.Selenide.*;

public class HeaderMenuPage extends BasePage {
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
    public HeaderMenuPage hoverHomeItem() {
        homeItem.shouldBe(Condition.visible).hover();
        return this;
    }

    public String getColorProductsMenuItem() {
        return getColorItem(productsMenuItem);
    }
    public HeaderMenuPage hoverProductsMenuItem() {
        productsMenuItem.shouldBe(Condition.visible).hover();
        return this;
    }

    public HeaderMenuPage hoverClientHubItem() {
        clientHubItem.shouldBe(Condition.visible).hover();
        return this;
    }
    public String getColorClientHubItem() {
        return getColorItem(clientHubItem);
    }

    public HeaderMenuPage hoverCompanyItem() {
        companyItem.shouldBe(Condition.visible).hover();
        return this;
    }
    public String getColorCompanyItem() {
        return getColorItem(companyItem);
    }

    public HeaderMenuPage hoverNewsItem() {
        newsItem.shouldBe(Condition.visible).hover();
        return this;
    }
    public String getColorNewsItem() {
        return getColorItem(newsItem);
    }

    public HeaderMenuPage hoverContactItem() {
        contactItem.shouldBe(Condition.visible).hover();
        return this;
    }
    public String getColorContactItem() {
        return getColorItem(contactItem);
    }

    /** Clicking a Product Menu item on header */
    public HeaderMenuPage clickProductsMenuItem() {
        productsMenuItem.shouldBe(Condition.visible).click();
        return this;
    }
    public HeaderMenuPage hoverBingoItem() {
        bingoItem.shouldBe(Condition.visible).hover();
        return this;
    }
    public String getColorBingoItem() {
        return getColorItem(bingoItem);
    }

    public HeaderMenuPage clickBingoItem() {
        bingoItem.shouldBe(Condition.visible).click();
        return this;
    }

















}
