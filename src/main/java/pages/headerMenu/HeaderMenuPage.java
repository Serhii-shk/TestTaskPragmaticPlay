package pages.headerMenu;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;
import static com.codeborne.selenide.Selenide.*;

public class HeaderMenuPage extends BasePage {
    private final SelenideElement homeItem = $x("//li[@id='menu-item-1185']/a[text()='Home']");
    private final SelenideElement productsMenuItem = $x("//li[@id='menu-item-200']/a[text()='Products']");
    private final SelenideElement clientHubItem = $x("//li[@id='menu-item-23582']/a[@target='_blank']");
    private final SelenideElement companyItem = $x("//li[@id='menu-item-57201']/a[text()='Company']");
    private final SelenideElement newsItem = $x("//li[@id='menu-item-9841']/a[text()='News']");
    private final SelenideElement contactItem = $x("//li[@id='menu-item-1820']/a[text()='Contact']");
    private final SelenideElement bingoItem = $x("//li[@id='menu-item-11081']/a[text()='Bingo']");

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
