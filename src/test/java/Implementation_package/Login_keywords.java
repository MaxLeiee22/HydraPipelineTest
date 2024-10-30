package Implementation_package;

import Objects.Login_objects;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_keywords extends Objects1{
    Login_objects objct = new Login_objects();
    //public WebDriver driver = new ChromeDriver();
    public void setObj() {

       objct.Login_button().click();

    }

    public void submit_button() {objct.submit_button().click();

    }

    public void login_details(String email, String password ) {
        objct.email().sendKeys(email);
        objct.password().sendKeys(password);

    }

    public void login_user_details(String user ) {
        objct.user().getText();
        String username = objct.user().getText();

        Assert.assertEquals(username,user);

    }

    public void handling_popups() throws InterruptedException {
        WebElement element = null;
        try {
            element = wdriver.findElement(By.className("ctp-checkbox-label"));
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // Element not found
            System.out.println("Security check not found. Continuing execution.");
        }

        // Check if the element exists
        if (element != null) {
            // Click on the element if it exists
            element.click();
            System.out.println("Security checkbox clicked.");
        } else {
            // Continue with execution if the element does not exist
            System.out.println("Security checkbox does not exist. Continuing execution.");

            Thread.sleep(5000);


            try {
                WebElement popupElement = wdriver.findElement(By.xpath("//button[normalize-space()='Got it']"));

                // Click the "Got It" button if it's present
                if (popupElement.isDisplayed()) {
                    popupElement.click();
                }
            } catch (org.openqa.selenium.NoSuchElementException e) {
                // Handle the case when the pop-up is not present
                System.out.println("No pop-up found. Continuing execution.");
            }

            // Check if the "Promotional" pop-up is present
            try {
                WebElement popupElement1 = wdriver.findElement(By.xpath("//button[normalize-space()='NOT NOW']"));
                // Click the "Promotional" button if it's present
                if (popupElement1.isDisplayed()) {
                    popupElement1.click();
                }
            } catch (org.openqa.selenium.NoSuchElementException e) {
                // Handle the case when the pop-up is not present
                System.out.println("No pop-up1 found. Continuing execution.");
            }
        }


    }
}
