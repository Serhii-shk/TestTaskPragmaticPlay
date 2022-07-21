package asserts;


import org.junit.jupiter.api.Assertions;
import pages.bingo.BingoPage;


public class ThemeAssert extends BingoPage {

    public void checkingLinkToContainsName(String nameThemes , String getLinkTheme) {
        Assertions.assertTrue(getLinkTheme.contains(nameThemes));
    }




}
