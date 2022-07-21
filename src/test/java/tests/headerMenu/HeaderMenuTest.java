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

import static constants.Constants.COLOR_ITEM.*;
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

        ageCheckPopupAndCookie
                .ageCheckConfirming()
                .clickAcceptAllButton();

        thenItemAssert
                .checkingChangeColorElement(ITEM_ORANGE_COLOR, headerMenuPage.getColorHomeItem());
        headerMenuPage
                .hoverHomeItem()
                .getColorHomeItem();
        thenItemAssert
                .checkingChangeColorElement(ITEM_WHITE_COLOR , headerMenuPage.getColorHomeItem());
    }


    @Test
    @DisplayName("Checking if Products item on  header menu is changing color on mouseover")
    void changingColorProductsItemOnMouseover() {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopupAndCookie
                .ageCheckConfirming()
                .clickAcceptAllButton();
        thenItemAssert
                .checkingChangeColorElement(ITEM_WHITE_COLOR, headerMenuPage.getColorProductsMenuItem());
        headerMenuPage
                .hoverProductsMenuItem()
                .getColorProductsMenuItem();
        thenItemAssert
                .checkingChangeColorElement(ITEM_ORANGE_COLOR , headerMenuPage.getColorProductsMenuItem());
    }

    @Test
    @DisplayName("Checking if Client Hub item on  header menu is changing color on mouseover")
    void changingColorClientHubItemOnMouseover() {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopupAndCookie
                .ageCheckConfirming()
                .clickAcceptAllButton();
        thenItemAssert
                .checkingChangeColorElement(ITEM_WHITE_COLOR , headerMenuPage.getColorClientHubItem());
        headerMenuPage
                .hoverClientHubItem()
                .getColorClientHubItem();
        thenItemAssert
                .checkingChangeColorElement(ITEM_ORANGE_COLOR , headerMenuPage.getColorClientHubItem());
    }

    @Test
    @DisplayName("Checking if Company item on  header menu is changing color on mouseover")
    void changingColorCompanyItemOnMouseover() {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopupAndCookie
                .ageCheckConfirming()
                .clickAcceptAllButton();
        thenItemAssert
                .checkingChangeColorElement(ITEM_WHITE_COLOR , headerMenuPage.getColorCompanyItem());
        headerMenuPage
                .hoverCompanyItem()
                .getColorCompanyItem();
        thenItemAssert
                .checkingChangeColorElement(ITEM_ORANGE_COLOR , headerMenuPage.getColorCompanyItem());
    }

    @Test
    @DisplayName("Checking if News item on  header menu is changing color on mouseover")
    void changingColorNewsItemOnMouseover() {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopupAndCookie
                .ageCheckConfirming()
                .clickAcceptAllButton();
        thenItemAssert
                .checkingChangeColorElement(ITEM_WHITE_COLOR , headerMenuPage.getColorNewsItem());
        headerMenuPage
                .hoverNewsItem()
                .getColorNewsItem();
        thenItemAssert
                .checkingChangeColorElement(ITEM_ORANGE_COLOR , headerMenuPage.getColorNewsItem());
    }

    @Test
    @DisplayName("Checking if Contact item on  header menu is changing color on mouseover")
    void changingColorContactItemOnMouseover() {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopupAndCookie
                .ageCheckConfirming()
                .clickAcceptAllButton();
        thenItemAssert
                .checkingChangeColorElement(ITEM_WHITE_COLOR , headerMenuPage.getColorContactItem());
        headerMenuPage
                .hoverContactItem()
                .getColorContactItem();
        thenItemAssert
                .checkingChangeColorElement(ITEM_ORANGE_COLOR , headerMenuPage.getColorContactItem());
    }

    @Test
    @DisplayName("Checking if Bingo option in Products menu is changing color on mouseover")
    void changingColorOnMouseover() {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopupAndCookie
                .ageCheckConfirming()
                .clickAcceptAllButton();
        headerMenuPage
                .hoverProductsMenuItem();
        thenItemAssert
                .checkingChangeColorElement(ITEM_WHITE_COLOR , headerMenuPage.getColorBingoItem());
        headerMenuPage
                .hoverBingoItem();
        headerMenuPage
                .getColorBingoItem();
        thenItemAssert
                .checkingChangeColorElement(ITEM_ORANGE_COLOR , headerMenuPage.getColorBingoItem());
    }



}
