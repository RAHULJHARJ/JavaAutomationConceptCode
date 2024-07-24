package ActionClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class PaytmUsingActionClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://paytm.com/");
		
		//Create the object of action class
		Actions a=new Actions(driver);
		
		
		WebElement pfc=driver.findElement(By.linkText("Paytm for Consumer"));
		a.moveToElement(pfc).perform();
		
		WebElement Payments=driver.findElement(By.linkText("Payments"));
		a.moveToElement(Payments).perform();
		
		WebElement OnlinePayments=driver.findElement(By.linkText("Online Payments"));
		a.moveToElement(OnlinePayments).perform();
		OnlinePayments.click();
		
		WebElement Important=driver.findElement(By.xpath("(//div[@class='_1sxKw'])[4]"));
		Important.click();
		WebElement VerifiedLatestPaytmNews=driver.findElement(By.linkText("Verified Latest Paytm News"));
		VerifiedLatestPaytmNews.click();
		
		
		WebElement Logo=driver.findElement(By.xpath("(//div[@class='zzczH'])[1]"));
		File src=Logo.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./ScreenSort/paytmLogoLogo.png");
		Files.copy(src, dest);
		

        

	}

}
