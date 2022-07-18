package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;
import static com.codeborne.selenide.Selenide.$x;

public class AgeCheckPopup extends BasePage {

    private final SelenideElement ageConfirm = $x("//a[@data-age-check-confirm]");

    /** Confirmation age on the age check popup */
    public AgeCheckPopup ageCheckConfirming() {
        ageConfirm.shouldBe(Condition.visible).click();
        return this;
    }
}
