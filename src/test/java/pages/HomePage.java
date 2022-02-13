package pages;

import Base.BaseUtil;
import Base.ElementAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseUtil {

    ElementAction action = new ElementAction();

    public HomePage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "ui_view_privacy_policy_button_agree")
    public MobileElement btnAgree;
    public static String agreeBtn="ui_view_privacy_policy_button_agree";

    @AndroidFindBy(id = "ui_view_privacy_policy_button_disagree")
    public MobileElement btnDisAgree;

    @AndroidFindBy(id = "ui_view_skip_on_boarding_button")
    public MobileElement btnSkip;

    @AndroidFindBy(id = "ui_view_next_on_boarding_button")
    public MobileElement btnContinue;

    @AndroidFindBy(id = "ui_view_sub_menu_language_switch_textview")
    public MobileElement btnFlag;

    @AndroidFindBy(id = "permission_allow_foreground_only_button")
    public MobileElement btnAllowPermission;

    @AndroidFindBy(id = "ui_view_input_product_find_product_edittext")
    public MobileElement inputSearch;

    @AndroidFindBy(id = "home_bottom_navigation")
    public static  MobileElement btnBeranda;

    @AndroidFindBy(id = "orders_bottom_navigation")
    public static MobileElement btnPesananSaya;

    @AndroidFindBy(id = "deals_bottom_navigation")
    public MobileElement btnPenawaran;

    @AndroidFindBy(id = "notification_bottom_navigation")
    public MobileElement btnNotifikasi;

    @AndroidFindBy(id = "account_bottom_navigation")
    public MobileElement btnAkun;


    public void UserCheckAllEmelementHomepage() throws InterruptedException {
        System.out.println("FIRST");
        action.waitUntiElementPresent(By.id(agreeBtn));
        Thread.sleep(3000);
        btnAgree.isDisplayed();
        btnDisAgree.isDisplayed();
        btnAgree.click();
        btnSkip.click();
    }

    public void UserCheckAllEmelementLandingPage() {
        btnBeranda.isDisplayed();
        btnPesananSaya.isDisplayed();
        btnPenawaran.isDisplayed();
        btnNotifikasi.isDisplayed();
        btnAkun.isDisplayed();
    }


}
