package tests.bingo;

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
import static constants.Constants.NAME_THEMES.*;

@Link(name = "check-list", url = "https://docs.google.com/spreadsheets/d/1Esfb7JScop6K5Mkvm2kOZ3ya-SeVQ7f8U8qByg4tstw/edit#gid=0")
@Feature("Checking availability Bingo Themes, that the elements aren't duplicated, that the link to the image contains a theme's name Bloc")
@Story("A positive scenario")
@ExtendWith(Listener.class)
@Execution(ExecutionMode.CONCURRENT)

public class BingoTest extends BaseTest {

    @Test
    @DisplayName("Checking that there are 9 Bingo themes.")
    void availabilityBingoThemes() {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopupAndCookie
                .ageCheckConfirming()
                .clickAcceptAllButton();
        headerMenuPage
                .hoverProductsMenuItem()
                .clickBingoItem();

        bingoPage
                .scrollToOurBingoVariantsBloc()
                .isElementPresent();
    }

    @Test
    @DisplayName("Checking that the link to the image contains a theme The Jackpot Room Name ")
    void checkingLinkToContainsTheJackpotRoomName() throws InterruptedException {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopupAndCookie
                .ageCheckConfirming()
                .clickAcceptAllButton();
        headerMenuPage
                .hoverProductsMenuItem()
                .clickBingoItem();
        Thread.sleep(1000);
        bingoPage
                .scrollToOurBingoVariantsBloc();
        thenThemeAssert
                .checkingLinkToContainsName(THE_JACKPOT_ROOM_THEME, bingoPage.getLinkTheJackpotRoomTheme());
    }

    @Test
    @DisplayName("Checking that the link to the image contains a theme BingoB last Name ")
    void checkingLinkToContainsBingoBlastName() throws InterruptedException {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopupAndCookie
                .ageCheckConfirming()
                .clickAcceptAllButton();
        headerMenuPage
                .hoverProductsMenuItem()
                .clickBingoItem();
        Thread.sleep(1000);
        bingoPage
                .scrollToOurBingoVariantsBloc();
        thenThemeAssert
                .checkingLinkToContainsName(BINGO_BLAST_THEME, bingoPage.getBingoBlastTheme());
    }

    @Test
    @DisplayName("Checking that the link to the image contains a theme Reels Room Name ")
    void checkingLinkToContainsReelsRoomName() throws InterruptedException {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopupAndCookie
                .ageCheckConfirming()
                .clickAcceptAllButton();
        headerMenuPage
                .hoverProductsMenuItem()
                .clickBingoItem();
        Thread.sleep(1000);
        bingoPage
                .scrollToOurBingoVariantsBloc();
        thenThemeAssert
                .checkingLinkToContainsName(REELS_ROOM_THEME, bingoPage.getReelsRoomTheme());
    }

    @Test
    @DisplayName("Checking that the link to the image contains a theme Country Roads Name ")
    void checkingLinkToContainsCountryRoadsName() throws InterruptedException {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopupAndCookie
                .ageCheckConfirming()
                .clickAcceptAllButton();
        headerMenuPage
                .hoverProductsMenuItem()
                .clickBingoItem();
        Thread.sleep(1000);
        bingoPage
                .scrollToOurBingoVariantsBloc();
        thenThemeAssert
                .checkingLinkToContainsName(COUNTRY_ROADS_THEME, bingoPage.getCountryRoadsTheme());
    }

    @Test
    @DisplayName("Checking that the link to the image contains a theme Zoom Room Name ")
    void checkingLinkToContainsZoomRoomName() throws InterruptedException {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopupAndCookie
                .ageCheckConfirming()
                .clickAcceptAllButton();
        headerMenuPage
                .hoverProductsMenuItem()
                .clickBingoItem();
        Thread.sleep(1000);
        bingoPage
                .scrollToOurBingoVariantsBloc();
        thenThemeAssert
                .checkingLinkToContainsName(ZOOM_ROOM_THEME, bingoPage.getZoomRoomTheme());
    }

    @Test
    @DisplayName("Checking that the link to the image contains a theme Boombox Name ")
    void checkingLinkToContainsBoomboxName() throws InterruptedException {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopupAndCookie
                .ageCheckConfirming()
                .clickAcceptAllButton();
        headerMenuPage
                .hoverProductsMenuItem()
                .clickBingoItem();
        Thread.sleep(1000);
        bingoPage
                .scrollToOurBingoVariantsBloc();
        thenThemeAssert
                .checkingLinkToContainsName(BOOMBOX_THEME, bingoPage.getBoomboxTheme());
    }

    @Test
    @DisplayName("Checking that the link to the image contains a theme Sweet Bonanza Bingo Name ")
    void checkingLinkToContainsSweetBonanzaBingoName() throws InterruptedException {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopupAndCookie
                .ageCheckConfirming()
                .clickAcceptAllButton();
        headerMenuPage
                .hoverProductsMenuItem()
                .clickBingoItem();
        Thread.sleep(1000);
        bingoPage
                .scrollToOurBingoVariantsBloc();
        thenThemeAssert
                .checkingLinkToContainsName(SWEET_BONANZA_BINGO_THEME, bingoPage.getSweetBonanzaBingoTheme());
    }

    @Test
    @DisplayName("Checking that the link to the image contains a theme Snowball Blast Name ")
    void checkingLinkToContainsSnowballBlastName() throws InterruptedException {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopupAndCookie
                .ageCheckConfirming()
                .clickAcceptAllButton();
        headerMenuPage
                .hoverProductsMenuItem()
                .clickBingoItem();
        Thread.sleep(1000);
        bingoPage
                .scrollToOurBingoVariantsBloc();
        thenThemeAssert
                .checkingLinkToContainsName(SNOWBALL_BLAST_THEME, bingoPage.getSnowballBlastTheme());
    }

    @Test
    @DisplayName("Checking that the link to the image contains a theme Rock N Swing Name ")
    void checkingLinkToContainsRockNSwingName() throws InterruptedException {
        basePage
                .goToURL(PRAGMATIC_PLAY_URL);
        ageCheckPopupAndCookie
                .ageCheckConfirming()
                .clickAcceptAllButton();
        headerMenuPage
                .hoverProductsMenuItem()
                .clickBingoItem();
        Thread.sleep(1000);
        bingoPage
                .scrollToOurBingoVariantsBloc();
        thenThemeAssert
                .checkingLinkToContainsName(ROCK_N_SWING_THEME, bingoPage.getRockNSwingTheme());
    }

}




















