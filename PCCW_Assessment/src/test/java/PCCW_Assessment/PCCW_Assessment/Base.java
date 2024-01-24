package PCCW_Assessment.PCCW_Assessment;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@Test
public class Base {
	public static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Open the web application in a browser
        driver.get("https://practicetestautomation.com/practice-test-login");
    }
}
