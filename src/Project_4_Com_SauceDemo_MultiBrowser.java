import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project_4_Com_SauceDemo_MultiBrowser {
    /**
     * Project-4 - ProjectName : com-saucedemo
     * BaseUrl = https://www.saucedemo.com/
     * 1. Setup Chrome browser.
     * 2. Open URL.
     * 3. Print the title of the page.
     * 4. Print the current url.
     * 5. Print the page source.
     * 6. Enter the email to email field.
     * 7. Enter the password to password field.
     * 8. Click on Login Button.
     * 9. Print the current url.
     * 10. Navigate to baseUrl
     * 11. Refresh the page.
     * 12. Close the browser.
     */

    static String baseUrl = "https://www.saucedemo.com/";
    static String browser = "Chrome";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else if (browser.equalsIgnoreCase("Firefox")){
            driver =new FirefoxDriver();
        }else {
            System.out.println("Wrong Browser Name");
        }
        //Navigate to BaseUrl
        driver.get(baseUrl);
        //maximize the window
        driver.manage().window().maximize();
        //print the page Title, CurrentUrl and Page Source
        System.out.println("Title of the page: " + driver.getTitle());
        System.out.println("Current Url: " + driver.getCurrentUrl());
        System.out.println("Page source: " + driver.getPageSource());
        //enter username
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        //enter password
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        //click on login button
        driver.findElement(By.name("login-button")).click();
        //close the page
        driver.close();
    }
}
