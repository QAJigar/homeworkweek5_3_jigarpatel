import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_4_Com_SauceDemo {
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
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(baseUrl);
        driver.manage().window().maximize();
        System.out.println("Title of the page: " + driver.getTitle());
        System.out.println("Current Url: " + driver.getCurrentUrl());
        System.out.println("Page source: " + driver.getPageSource());
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        driver.close();
    }
}
