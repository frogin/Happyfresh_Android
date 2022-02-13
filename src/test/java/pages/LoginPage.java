package pages;

import Base.BaseUtil;
import Base.ElementAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseUtil {

    ElementAction action = new ElementAction();
    HomePage home = new HomePage(driver);

    public LoginPage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.happyfresh.staging:id/ui_view_privacy_policy_button_agree")
    public MobileElement btnAgree;
    public static String agreeBtn="ui_view_privacy_policy_button_agree";

    @AndroidFindBy(id = "com.happyfresh.staging:id/ui_view_privacy_policy_button_disagree")
    public MobileElement btnDisAgree;

    @AndroidFindBy(id = "orders_bottom_navigation")
    public static MobileElement btnPesananSaya;

    @AndroidFindBy(id = "login")
    public MobileElement btnSignIn;

    @AndroidFindBy(id = "email")
    public MobileElement inputEmail;

    @AndroidFindBy(id = "password")
    public MobileElement inputPassword;

    @AndroidFindBy(id = "login")
    public MobileElement btnSubmitLogin;


    @AndroidFindBy(id = "buttonDefaultPositive")
    public MobileElement btnOke;


    public void NavigateToLoginPage() throws InterruptedException{
        home.UserCheckAllEmelementHomepage();
        HomePage.btnPesananSaya.click();
        btnSignIn.click();
    }

    public void UserDoLogin(String email, String password) throws InterruptedException {
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);;
    }

    public void ClickLoginButton() {
        btnSubmitLogin.click();
    }

    public void UserReachLandingPage() {
        home.UserCheckAllEmelementLandingPage();
    }

    public void AlertWrongCredentials() {
        btnOke.isDisplayed();
        action.checkTextCountains("Wrong email and(or) password");
        btnOke.click();
    }
}
