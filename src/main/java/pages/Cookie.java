package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class Cookie extends BasePage {

    private final SelenideElement acceptAllButton = $x("//a[@id='wt-cli-accept-all-btn']");

    /** Clicking a "Accept All" button on Cookie */
    public Cookie clickAcceptAllButton() {
        acceptAllButton
                .shouldBe(Condition.visible)
                .click();
        return this;
    }

}
