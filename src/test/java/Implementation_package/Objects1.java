package Implementation_package;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Objects1 {
    public static WebDriver wdriver;

    public WebDriver open_browser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        //Launching and instance of the chromedriver with the URL to the Application under Test
        wdriver = new ChromeDriver(options);
        wdriver.get("https://www.takealot.com/");

        wdriver.manage().window().maximize();
        return wdriver;
    }
}
