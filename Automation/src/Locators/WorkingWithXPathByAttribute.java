package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXPathByAttribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		WebElement Search=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		Search.sendKeys("iphone",Keys.ENTER);

	}

}
