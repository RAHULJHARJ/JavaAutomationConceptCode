package Methodsss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class WorkWithNegatigateMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Zomato.com");
		driver.navigate().to("https://www.swiggy.com");
		driver.navigate().to("https://blinkit.com/");
		Thread.sleep(3000);
		//to go back
		for(int i=0;i<=2;i++) {
			driver.navigate().back();
		}
		Thread.sleep(3000);
		//to go forward
		driver.navigate().forward();
		driver.navigate().forward();
		//to refresh the browser
		driver.navigate().refresh();
		Thread.sleep(3000);
		//to close the browser
		driver.close();
		//to quit the browser
		driver.quit();

	}

}
