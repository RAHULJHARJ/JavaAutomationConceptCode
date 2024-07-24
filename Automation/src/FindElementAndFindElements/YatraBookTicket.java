package FindElementAndFindElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YatraBookTicket {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.yatra.com/");
		
		// click on buss
		
        WebElement Bus = driver.findElement(By.xpath("//span[text()='Buses']"));
        Bus.click();
        
        //Click on from
        
        WebElement From=driver.findElement(By.id("BE_bus_from_station"));
        From.click();
        WebElement From2=driver.findElement(By.xpath("(//div[@class='viewport']/descendant::span[text()='B'])[1]"));
        From2.click(); 
        
        
        //Click on to
        Thread.sleep(2000);
        
        WebElement To=driver.findElement(By.id("BE_bus_to_station"));
        To.click();
        To.sendKeys("Chennai");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='viewport']/descendant::li[1]")).click();
        
        //SearchButton
        
        WebElement SearchButton=driver.findElement(By.id("BE_bus_search_btn"));
        SearchButton.click();
        
        //---------------------
        
        List<WebElement> results = driver.findElements(By.xpath("//div[@class='v-card__text srp-touple']"));
        for (WebElement x : results) {
            System.out.println(x.getText());
            System.out.println("=====================================");
        }

        }
        
	}
