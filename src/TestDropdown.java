import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestDropdown {
    public static void main(String[] args) throws InterruptedException {

        // open browser
        System.setProperty("webdriver.gecko.driver", "C:\\WebDrivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.wikipedia.org/");
        System.out.println(driver.getTitle());

        // input text
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("25 de Abril");

        // select from dropdown
        Select select = new Select(driver.findElement(By.xpath("//select[@id='searchLanguage']")));

        // Different ways of selecting elements
        // select.selectByVisibleText("Português");
        // select.selectByValue("pt");
        List<WebElement> options = select.getOptions();
        System.out.println(options.size());

        // extract all languages from dropdown
        for(int i = 0; i< options.size(); i++) {
            System.out.println(options.get(i).getText());
        }
        // click button to search
        driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']")).click();

        Thread.sleep(2000);
        driver.close();
    }
}

