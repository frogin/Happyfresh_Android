package pages;

import Base.BaseUtil;
import Base.ElementAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.LivePage;
import steps.APISupport;


public class MoviesPage extends BaseUtil {

    ElementAction action = new ElementAction();
    LivePage page = new LivePage(driver);

    public MoviesPage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.goplay.android:id/feed_item_image")
    public MobileElement bannerMovie;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Movies and Series']")
    public MobileElement txtMovies;

    @AndroidFindBy(id = "com.goplay.android:id/ivDownloadState")
    public static MobileElement btnDownload;

    @AndroidFindBy(id = "com.goplay.android:id/iv_avod_banner")
    public static MobileElement infoSubscribe;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Reply 1988']")
    public static MobileElement imgMovieReply1998;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Train to Busan']")
    public static MobileElement imgMovieTrainToBusan;

    @AndroidFindBy(id = "com.goplay.android:id/button_contact_customer_care")
    public static MobileElement btnAddAccess;

    @AndroidFindBy(id = "com.goplay.android:id/clear_button")
    public static MobileElement btnCloseSubsPage;

    @AndroidFindBy(id = "com.goplay.android:id/restore_button")
    public static MobileElement btnManageSubs;

    @AndroidFindBy(id = "com.goplay.android:id/ll_contribute")
    public static MobileElement btnContribute;

    @AndroidFindBy(id = "com.goplay.android:id/ll_share_ig")
    public static MobileElement btnShareIG;

    @AndroidFindBy(id = "com.goplay.android:id/merchant_logo")
    public static MobileElement imgMerchantLogo;

    @AndroidFindBy(id = "com.goplay.android:id/tipping_screen_continue_button")
    public static MobileElement btnSupportNow;

    @AndroidFindBy(id = "com.goplay.android:id/tipping_screen_skip_button")
    public static MobileElement btnIWillSkip;

    public void gotoMoviesPage() {
        txtMovies.click();
        bannerMovie.isDisplayed();
    }

    public void checkMovieDetailPageWithSomeFreeEpisode() {
        bannerMovie.click();
        LivePage.btnPlayNow.isDisplayed();
        action.checkTextCountains("Share to IG");
        LivePage.btnPlayNow.click();
        Assert.assertFalse(action.checkPageElement("Share to IG"));
        action.androidBack();
        LivePage.btnPlayNow.isDisplayed();
        action.scroToElement("More like this");
        bannerMovie.isDisplayed();
    }

    public void checkMovieDetailPageWithFreeAll() {
        imgMovieReply1998.click();
        LivePage.btnPlayNow.isDisplayed();
        action.checkTextCountains("Share to IG");
        action.checkTextCountains("Cast");
        action.checkTextCountains("Director");
        LivePage.btnPlayNow.click();
        Assert.assertFalse(action.checkPageElement("Share to IG"));
        action.androidBack();
        LivePage.btnPlayNow.isDisplayed();
    }

    public void checkPaidMovie() {
        imgMovieTrainToBusan.click();
        LivePage.btnPlayNow.isDisplayed();
        action.checkTextCountains("Share to IG");
        action.checkTextCountains("Cast");
        action.checkTextCountains("Director");
        LivePage.btnPlayNow.click();
        btnAddAccess.isDisplayed();
        action.checkTextCountains("You don’t have a GoPlay access, yet");
        action.checkTextCountains("To start watching, you will need to purchase a GoPlay access first.");
        btnAddAccess.click();
        LivePage.btnOnce.click();
        btnManageSubs.isDisplayed();
        btnCloseSubsPage.click();
        LivePage.btnPlayNow.isDisplayed();
        action.scroToElement("More like this");
        bannerMovie.isDisplayed();
    }

    public void checkRentMovie() {
        action.scroToElement("GoPlay rentals");
        LivePage.btnSeeAll.click();
        bannerMovie.isDisplayed();
        action.checkTextCountains("All rentals");
        bannerMovie.click();
        LivePage.btnPlayNow.isDisplayed();
        action.checkTextCountains("Start within 30 days, Finish within 48 hours from the time you start. No hurry");
        btnContribute.isDisplayed();
        btnShareIG.isDisplayed();
        LivePage.btnPlayNow.click();
        imgMerchantLogo.isDisplayed();
        action.checkTextCountains("Rp 3,000");
        action.checkTextCountains("Credit/Debit Card");
        action.checkTextCountains("GoPay");
        action.androidBack();
        btnContribute.click();
        btnSupportNow.isDisplayed();
        btnIWillSkip.isDisplayed();
        action.checkTextCountains("Help the filmmaker create more films independently, for themselves and for you.");
        action.checkTextCountains("*This is inclusive of GoPlay and transaction charges.");
        action.androidBack();
        action.scroToElement("More like this");
        bannerMovie.isDisplayed();
    }

    public void openRandomMovie() {
        bannerMovie.click();
        LivePage.btnPlayNow.isDisplayed();
        action.androidBack();
        action.scroToElement("Holidays from home");
        bannerMovie.click();
        LivePage.btnPlayNow.isDisplayed();
        action.androidBack();
        action.scroToElement("Based on real events");
        bannerMovie.click();
        LivePage.btnPlayNow.isDisplayed();
        action.androidBack();
    }


}
