package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathByMultipleAttribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		WebElement CreatNewAccount=driver.findElement(By.xpath("//a[@role='button' and @href=\'/r.php\' ]"));
		CreatNewAccount.click();

	}

}
