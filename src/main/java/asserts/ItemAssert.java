package asserts;

import org.junit.jupiter.api.Assertions;
import pages.headerMenu.HeaderMenuPage;

public class ItemAssert extends HeaderMenuPage {


    public void checkingChangeColorElement(String color , String item) {
        Assertions.assertEquals(color, item);
    }


}
