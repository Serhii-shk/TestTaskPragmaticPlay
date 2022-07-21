package asserts;

import org.junit.jupiter.api.Assertions;
import pages.headerMenu.HeaderMenu;

public class ItemAssert extends HeaderMenu {


//    public void checkingThatTheElementIsOrange(String orangeColor,String item) {
//        Assertions.assertEquals(orangeColor ,item);
//    }

    public void checkingChangeColorElement(String whiteColor , String item) {
        Assertions.assertEquals(whiteColor, item);
    }









}
