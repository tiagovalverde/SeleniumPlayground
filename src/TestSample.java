//import com.qa.selenium.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestSample {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.website.com/login");
        System.out.println(driver.getTitle());

        WebElement element = driver.findElement(By.id("email"));
        element.sendKeys("test@hotmail.com");
        Thread.sleep(1000);

        element = driver.findElement(By.xpath("//input[@id='password']"));
        element.sendKeys("abc123");
        Thread.sleep(1000);

        element = driver.findElement(By.xpath("//button[@type='submit']"));
        element.click();

        Thread.sleep(3000);
        driver.close();




        Thread.sleep(5000);
        driver.quit();

    }
}
