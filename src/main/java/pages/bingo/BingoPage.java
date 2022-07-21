package pages.bingo;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.NoSuchElementException;
import pages.base.BasePage;
import static com.codeborne.selenide.Selenide.$x;

public class BingoPage extends BasePage {

    private final SelenideElement ourBingoVariantsBloc = $x("//div[@class='games']");
    private final SelenideElement theJackpotRoomTheme = $x("//div[@data-slick-index='9']");
    private final SelenideElement bingoBlastTheme = $x("//div[@data-slick-index='10']");
    private final SelenideElement reelsRoomTheme = $x("//div[@data-slick-index='11']");
    private final SelenideElement countryRoadsTheme = $x("//div[@data-slick-index='12']");
    private final SelenideElement zoomRoomTheme = $x("//div[@data-slick-index='13']");
    private final SelenideElement boomboxTheme = $x("//div[@data-slick-index='14']");
    private final SelenideElement sweetBonanzaBingoTheme = $x("//div[@data-slick-index='15']");
    private final SelenideElement snowballBlastTheme = $x("//div[@data-slick-index='16']");
    private final SelenideElement rockNSwingTheme = $x("//div[@data-slick-index='17']");

    private final SelenideElement theJackpotRoomLink = $x("(//div[@class='games']//img[contains(@src,'The-Jackpot-Room')]) [1]");
    private final SelenideElement bingoBlastLink = $x("(//div[@class='games']//img[contains(@src,'Bingo-Blast')]) [1]");
    private final SelenideElement reelsRoomLink = $x("(//div[@class='games']//img[contains(@src,'Release-The-Kraken')]) [1]");
    private final SelenideElement countryRoadsLink = $x("(//div[@class='games']//img[contains(@src,'Country-Roads')]) [1]");
    private final SelenideElement zoomRoomLink = $x("(//div[@class='games']//img[contains(@src,'Zoom-Room')]) [1]");
    private final SelenideElement boomboxLink = $x("(//div[@class='games']//img[contains(@src,'Boombox')]) [1]");
    private final SelenideElement sweetBonanzaBingoLink = $x("(//div[@class='games']//img[contains(@src,'Sweet-Bonanza-Bingo')]) [2]");
    private final SelenideElement snowballBlastLink = $x("(//div[@class='games']//img[contains(@src,'Snowball-Blast')]) [1]");
    private final SelenideElement rockNSwingLink = $x("(//div[@class='games']//img[contains(@src,'Rock-N-Swing')]) [1]");


    public SelenideElement[] theme = {
            theJackpotRoomTheme,
            bingoBlastTheme,
            reelsRoomTheme,
            countryRoadsTheme,
            zoomRoomTheme,
            boomboxTheme,
            sweetBonanzaBingoTheme,
            snowballBlastTheme,
            rockNSwingTheme};

    public boolean isElementPresent(){
        boolean themes = true;
        for (SelenideElement element: theme){
            try{
                element.isDisplayed();
            }
            catch(NoSuchElementException e){
                themes = false;
            }
        }
        return themes;
    }


    public BingoPage scrollToOurBingoVariantsBloc() {
        ourBingoVariantsBloc.scrollIntoView(true);
        return this;
    }


    String getLinkTheme(SelenideElement element) {
        String linkTheme = element.getAttribute("src");
        return linkTheme;
    }

    public String getLinkTheJackpotRoomTheme() {
        return getLinkTheme(theJackpotRoomLink);
    }

    public String getBingoBlastTheme() {
        return getLinkTheme(bingoBlastLink);
    }

    public String getReelsRoomTheme() {
        return getLinkTheme(reelsRoomLink);
    }

    public String getCountryRoadsTheme() {
        return getLinkTheme(countryRoadsLink);
    }

    public String getZoomRoomTheme() {
        return getLinkTheme(zoomRoomLink);
    }

    public String getBoomboxTheme() {
        return getLinkTheme(boomboxLink);
    }

    public String getSweetBonanzaBingoTheme() {
        return getLinkTheme(sweetBonanzaBingoLink);
    }

    public String getSnowballBlastTheme() {
        return getLinkTheme(snowballBlastLink);
    }

    public String getRockNSwingTheme() {
        return getLinkTheme(rockNSwingLink);
    }
}
















