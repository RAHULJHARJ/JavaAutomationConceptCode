package JavaScriptMrthods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoPage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.zomato.com");
		
		WebElement Sector29=driver.findElement(By.xpath("//h5[text()='Sector 29']"));
//		Rectangle rect=Sector29.getRect();
//		int x=rect.getX();
//		int y=rect.getY();
		
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
//		j.executeScript("window.scrollBy("+x+","+y+")");		
		j.executeScript("arguments[0].scrollIntoView(true)", Sector29);

	}

}
