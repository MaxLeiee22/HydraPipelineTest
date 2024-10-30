package Steps;

import Implementation_package.Login_keywords;
import Implementation_package.Objects1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Search_function {
    public static WebDriver wdriver;
    Objects1 ob = new Objects1();
    Login_keywords login = new Login_keywords();
    @Given("Launch browser")
    public void launchBrowser() {
        ob.open_browser();
    }

    @Given("i am loggin in")
    public void iAmLogginIn() throws InterruptedException {
        login.handling_popups();
        login.setObj();
        Thread.sleep(5000);
        login.handling_popups();

    }

    @And("i enter {string} and {string}")
    public void iEnterAnd(String email, String password) {
        login.login_details(email, password);
        login.submit_button();
    }
    @Then("Takealot homepage must be displayed with {string} signed in")
    public void takealotHomepageMustBeDisplayedWithSignedIn(String user) throws InterruptedException {
        Thread.sleep(5000);
        login.login_user_details(user);
    }
}