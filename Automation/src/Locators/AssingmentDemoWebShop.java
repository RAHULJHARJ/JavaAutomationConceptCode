package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssingmentDemoWebShop {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		                              //login part
		WebElement Login=driver.findElement(By.xpath("//a[@href='/login']"));
		Login.click();
		WebElement emailElement=driver.findElement(By.xpath("//input[@id='Email']"));
		emailElement.sendKeys("rahuljha14012002@gmail.com");
		WebElement Password=driver.findElement(By.xpath("//input[@id='Password']"));
		Password.sendKeys("Rahul@123");
		Thread.sleep(2000);
		WebElement LoginButton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
		LoginButton.click();
		//Search
		WebElement Search=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		Search.sendKeys("Book",Keys.ENTER);
		WebElement AddCart=driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']"));
		AddCart.click();
		                          //Addtocart
		WebElement OpenCart=driver.findElement(By.xpath("(//span[@class='cart-label'])[1]"));
		OpenCart.click();
		                            //CheckoutButton
		WebElement CheckButton=driver.findElement(By.xpath("//input[@id='termsofservice']"));
		CheckButton.click();
		WebElement CheckOut=driver.findElement(By.xpath("//button[@id='checkout']"));
		CheckOut.click();
	}

}
