package asserts;

import org.junit.jupiter.api.Assertions;
import pages.headerMenu.HeaderMenu;

public class ItemAssert extends HeaderMenu {

    public void checkingThatTheElementIsOrange(String item) {
        Assertions.assertEquals(item, itemOrangeColor);
    }

    public void checkingThatTheElementIsWhite(String item) {
        Assertions.assertEquals(item, itemWhiteColor);
    }



}
