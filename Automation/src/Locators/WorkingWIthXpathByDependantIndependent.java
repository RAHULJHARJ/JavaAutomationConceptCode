package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWIthXpathByDependantIndependent {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com");
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		WebElement Search=driver.findElement(By.xpath("//a[@role='button' and @href=\'/r.php\' ]"));
		System.out.println(Search.getText());

	}

}
