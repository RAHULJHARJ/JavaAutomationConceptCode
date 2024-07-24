package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathDependantIndendant {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		WebElement Search=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		Search.sendKeys("Iphone 15",Keys.ENTER);
		WebElement element=driver.findElement(By.xpath("(//div[@class='KzDlHZ']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR'])[4]"));
		element.click();
		
	}

}
