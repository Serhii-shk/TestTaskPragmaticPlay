package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$x;

public class AgeCheckPopupAndCookie extends BasePage {

    private final SelenideElement ageConfirm = $x("//a[@data-age-check-confirm]");
    private final SelenideElement acceptAllButton = $x("//a[@id='wt-cli-accept-all-btn']");

    /** Confirmation age on the age check popup */
    public AgeCheckPopupAndCookie ageCheckConfirming() {
        ageConfirm.shouldBe(Condition.visible).click();
        return this;
    }

    /** Clicking a "Accept All" button on Cookie */
    public AgeCheckPopupAndCookie clickAcceptAllButton() {
        acceptAllButton
                .shouldBe(Condition.visible)
                .click();
        return this;
    }

}
