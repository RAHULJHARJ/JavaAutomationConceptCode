package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assingmentAirVistara {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.airvistara.com");
		WebElement RatioButton=driver.findElement(By.xpath("//label[@id='oneway-trip-container']"));
		RatioButton.click();
//		Thread.sleep(4000);
		WebElement Origin=driver.findElement(By.xpath("//input[@aria-label='Search origin']"));
		Origin.sendKeys("Amritsar",Keys.ARROW_DOWN,Keys.ENTER);
//		Thread.sleep(3000);
		WebElement Destiny=driver.findElement(By.xpath("//input[@name='flightSearchTo']"));
		Destiny.sendKeys("Patna (PAT) ");
//		Thread.sleep(3000);
		WebElement Departure=driver.findElement(By.xpath("//input[@tabindex='-1' and @placeholder='Departure']"));
		Departure.click();
//		Thread.sleep(3000);
		WebElement Date=driver.findElement(By.xpath("//a[text()='25']"));
		Date.click();
//		Thread.sleep(3000);
		WebElement PasangerDetails=driver.findElement(By.xpath("//input[@placeholder='adult' and @readonly='readonly']"));
		PasangerDetails.click();
		WebElement Class=driver.findElement(By.xpath("//button[@value='economy']"));
//		Class.click();
		WebElement Done=driver.findElement(By.xpath("//button[@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']"));
		Done.click();
		WebElement Done2=driver.findElement(By.xpath("//button[@id='book-flight-widget']"));
		Done2.click();
		WebElement Price=driver.findElement(By.xpath("//span[@class='aircraftnumber']/ancestor::div[@id='bound0-row0']/descendant::span[@style='padding-left: 10px;']\r\n"));
		Price.click();
	}

}
