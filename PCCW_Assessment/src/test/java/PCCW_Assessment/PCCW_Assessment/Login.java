package PCCW_Assessment.PCCW_Assessment;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Base
{
	public void testLogin() throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Open the web application in a browser.
        driver.get("https://practicetestautomation.com/practice-test-login");
	        
		String username = "student";
        String password = "Password123";

        // Locating the username, password fields and submit button
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));

        //Enter valid credentials (username and password) and submit the login form.
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        submitButton.click();

        Thread.sleep(3000);
       

        // Verify that the user is successfully logged in by checking for a specific element or page title.
         String logoutbtn = driver.findElement(By.className("wp-block-button")).getText();
         Assert.assertEquals(logoutbtn, "Log out");
         System.out.println("Student is Logged in Successfully");
      	 driver.quit(); 
	}
}
