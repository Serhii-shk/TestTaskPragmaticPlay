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

import static constants.Constants.COLOR_ITEM.ITEM_ORANGE_COLOR;
import static constants.Constants.COLOR_ITEM.ITEM_WHITE_COLOR;
import static constants.Constants.DOMAINS_URL.PRAGMATIC_PLAY_URL;

@Link(name = "check-list", url = "https://docs.google.com/spreadsheets/d/1Esfb7JScop6K5Mkvm2kOZ3ya-SeVQ7f8U8qByg4tstw/edit#gid=0")
@Feature("Changing color on mouseover to header menu")
@Story("A positive scenario")
@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)
public class HeaderMenuTest extends BaseTest {


    @Test
    @DisplayName("Checking if Home item on  header menu is changing color on mouseover")
    void changingColorHomeItemOnMouseover() {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopup
                .ageCheckConfirming();
        cookie
                .clickAcceptAllButton();

        thenItemAssert
                .checkingChangeColorElement(ITEM_ORANGE_COLOR, headerMenu.getColorHomeItem());
        headerMenu
                .hoverHomeItem()
                .getColorHomeItem();
        thenItemAssert
                .checkingChangeColorElement(ITEM_WHITE_COLOR ,headerMenu.getColorHomeItem());
    }


    @Test
    @DisplayName("Checking if Products item on  header menu is changing color on mouseover")
    void changingColorProductsItemOnMouseover() {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopup
                .ageCheckConfirming();
        cookie
                .clickAcceptAllButton();
        thenItemAssert
                .checkingChangeColorElement(ITEM_WHITE_COLOR ,headerMenu.getColorProductsMenuItem());
        headerMenu
                .hoverProductsMenuItem()
                .getColorProductsMenuItem();
        thenItemAssert
                .checkingChangeColorElement(ITEM_ORANGE_COLOR ,headerMenu.getColorProductsMenuItem());
    }

    @Test
    @DisplayName("Checking if Client Hub item on  header menu is changing color on mouseover")
    void changingColorClientHubItemOnMouseover() {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopup
                .ageCheckConfirming();
        cookie
                .clickAcceptAllButton();
        thenItemAssert
                .checkingChangeColorElement(ITEM_WHITE_COLOR ,headerMenu.getColorClientHubItem());
        headerMenu
                .hoverClientHubItem()
                .getColorClientHubItem();
        thenItemAssert
                .checkingChangeColorElement(ITEM_ORANGE_COLOR ,headerMenu.getColorClientHubItem());
    }

    @Test
    @DisplayName("Checking if Company item on  header menu is changing color on mouseover")
    void changingColorCompanyItemOnMouseover() {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopup
                .ageCheckConfirming();
        cookie
                .clickAcceptAllButton();
        thenItemAssert
                .checkingChangeColorElement(ITEM_WHITE_COLOR ,headerMenu.getColorCompanyItem());
        headerMenu
                .hoverCompanyItem()
                .getColorCompanyItem();
        thenItemAssert
                .checkingChangeColorElement(ITEM_ORANGE_COLOR ,headerMenu.getColorCompanyItem());
    }

    @Test
    @DisplayName("Checking if News item on  header menu is changing color on mouseover")
    void changingColorNewsItemOnMouseover() {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopup
                .ageCheckConfirming();
        cookie
                .clickAcceptAllButton();
        thenItemAssert
                .checkingChangeColorElement(ITEM_WHITE_COLOR ,headerMenu.getColorNewsItem());
        headerMenu
                .hoverNewsItem()
                .getColorNewsItem();
        thenItemAssert
                .checkingChangeColorElement(ITEM_ORANGE_COLOR ,headerMenu.getColorNewsItem());
    }

    @Test
    @DisplayName("Checking if Contact item on  header menu is changing color on mouseover")
    void changingColorContactItemOnMouseover() {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopup
                .ageCheckConfirming();
        cookie
                .clickAcceptAllButton();
        thenItemAssert
                .checkingChangeColorElement(ITEM_WHITE_COLOR ,headerMenu.getColorContactItem());
        headerMenu
                .hoverContactItem()
                .getColorContactItem();
        thenItemAssert
                .checkingChangeColorElement(ITEM_ORANGE_COLOR ,headerMenu.getColorContactItem());
    }

    @Test
    @DisplayName("Checking if Bingo option in Products menu is changing color on mouseover")
    void changingColorOnMouseover() {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopup
                .ageCheckConfirming();
        cookie
                .clickAcceptAllButton();
        headerMenu
                .hoverProductsMenuItem();
        thenItemAssert
                .checkingChangeColorElement(ITEM_WHITE_COLOR ,headerMenu.getColorBingoItem());
        headerMenu
                .hoverBingoItem();
        headerMenu
                .getColorBingoItem();
        thenItemAssert
                .checkingChangeColorElement(ITEM_ORANGE_COLOR ,headerMenu.getColorBingoItem());


    }
}
