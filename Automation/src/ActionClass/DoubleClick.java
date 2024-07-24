package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable if necessary
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");

        // Locate the element to double click
        WebElement button = driver.findElement(By.xpath("(//button[@class='active:bg-green-400 transition-all duration-300 active:border-green-400 rounded-md mx-1 px-5 py-2 text-black font-bold bg-orange-300 border border-orange-600'])[1]"));

        // Create the object of Actions class
        Actions a = new Actions(driver);

        // Perform double click action on the located element
        a.doubleClick(button).perform();
    }
}
