package pages.base;

import static com.codeborne.selenide.Selenide.*;

public class BasePage {

	/**
	 * A method for navigating to a specific URL
	 */
    public void goToURL(String url) {
        open(url);
    }

}
