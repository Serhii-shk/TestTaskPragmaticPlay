package asserts;


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.NoSuchElementException;
import pages.bingo.BingoPage;

import static com.codeborne.selenide.Selenide.$x;


public class ThemeAssert extends BingoPage {

    public void checkingLinkToContainsName(String nameThemes , String getLinkTheme) {
        Assertions.assertTrue(getLinkTheme.contains(nameThemes));
    }




}
