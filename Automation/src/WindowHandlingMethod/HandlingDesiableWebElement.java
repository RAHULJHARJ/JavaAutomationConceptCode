package WindowHandlingMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDesiableWebElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		WebElement Ui=driver.findElement(By.xpath("//main[@class='w-[100%] h-[14.5rem] ps-7 flex flex-col justify-around p-[0.5rem] rounded  bg-[#feebfc]  hover:shadow-slate-400 shadow-lg group']"));
		Ui.click();
		
		WebElement Disabled=driver.findElement(By.xpath("//li[@class='w-[100%] flex justify-between items-center py-1  cursor-pointer  px-2 relative ps-1  text-[14px]  text-black']"));
		Disabled.click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("document.getElementById('name').value='Rahul';");

		
		j.executeScript("document.getElementById('email').value='rahuljha14012002@gmail.com';");
		
		
		j.executeScript("document.getElementById('password').value='Google';");
		
		
	}

}
