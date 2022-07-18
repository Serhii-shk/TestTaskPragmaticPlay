package tests.headerMenu;

import common.Listener;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import tests.base.BaseTest;
import static constants.Constants.DOMAINS_URL.PRAGMATIC_PLAY_URL;

@Link(name = "check-list", url = "https://docs.google.com/spreadsheets/d/1Esfb7JScop6K5Mkvm2kOZ3ya-SeVQ7f8U8qByg4tstw/edit#gid=0")
@Feature("Changing color on mouseover to header menu")
@Story("A positive scenario")
@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)
public class HeaderMenuTest extends BaseTest {

    @Test
    @DisplayName("Checking if all header menu items is changing color on mouseover")
    void changingColorOnMouseover() {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopup
                .ageCheckConfirming();
        cookie
                .clickAcceptAllButton();
        headerMenu
                .clickOnProductMenu();


    }

}
