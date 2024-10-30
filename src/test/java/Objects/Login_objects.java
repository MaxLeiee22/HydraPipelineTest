package Objects;

import Implementation_package.Objects1;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class  Login_objects extends Objects1 {
    // public  WebDriver wdriver = new ChromeDriver();

    public WebElement Login_button() {
        return wdriver.findElement(By.xpath("//a[normalize-space()='Login']"));

    }

    public WebElement email() {
        return
                wdriver.findElement(By.xpath("//input[@id='customer_login_email']"));
    }

    public WebElement password() {
        return
                wdriver.findElement(By.xpath("//input[@id='customer_login_password']"));
    }

    public WebElement submit_button() {
        return
                wdriver.findElement(By.xpath("//button[normalize-space()='Login']"));

    }

    public WebElement user() {
        return
                wdriver.findElement(By.xpath("//li[@data-ref='name-item']"));

    }
}



