package common;

import com.codeborne.selenide.Configuration;

abstract public class Config {
	/** Specify the browser to test: */
	public static String BROWSER_NAME = "firefox"; //chrome firefox opera edge ie
	/** Whether to clean the browser's cookies after each iteration*/
	public static boolean CLEAR_COOKIES = true;
	/** Clean the directory with the screen before starting the build*/
	public static boolean CLEAR_REPORTS_DIR = true;
	/** Whether to keep the browser open after the tests*/
	public static final boolean HOLD_BROWSER_OPEN = false;
	/** Whether to open the browser in full-screen mode*/
	public static final boolean FULLSCREEN_MODE_BROWSER = true;
	/** Browser visibility during test execution*/
	public static final boolean HIDING_BROWSER_DURING_TEST = false;

	static {
		Configuration.holdBrowserOpen = HOLD_BROWSER_OPEN;
		Configuration.reportsFolder = "build/reports/tests";
		Configuration.browser = BROWSER_NAME;
		Configuration.startMaximized = FULLSCREEN_MODE_BROWSER;
		Configuration.headless = HIDING_BROWSER_DURING_TEST;
	}
}
