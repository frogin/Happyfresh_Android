package steps;

import Base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;

public class LoginStep extends BaseUtil {

    @Given("I Navigate to login page")
    public void iNavigateToLoginPage () throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        login.NavigateToLoginPage();


    }

    @And("I input ([^\"]*) ([^\"]*)$")
    public void iInputEmailPasword(String email, String password) throws InterruptedException {
        LoginPage login = new LoginPage(driver);
        login.UserDoLogin(email, password);
    }




    @And("I click login button")
    public void iClickLoginButton() {
        LoginPage login = new LoginPage(driver);
        login.ClickLoginButton();

    }

    @Then("I should entering landing page")
    public void iShouldEnteringLandingPage() {
        LoginPage login = new LoginPage(driver);
        login.UserReachLandingPage();

    }

    @Then("I should see error alert")
    public void iShouldSeeErrorAlert() {
        LoginPage login = new LoginPage(driver);
        login.AlertWrongCredentials();
    }
}

