package ActionClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class MyntraUsingActionClass {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://myntra.com/");
		
		//Create the object of action class
		Actions a=new Actions(driver);
		
		WebElement men=driver.findElement(By.xpath("//a[@data-group='men']"));
		a.moveToElement(men).perform();
		
		WebElement Shirt=driver.findElement(By.linkText("T-Shirts"));
		a.moveToElement(Shirt).click().perform();
		
		WebElement Logo=driver.findElement(By.xpath("//img[@title='RARE RABBIT Polo Collar Short Sleeves Cotton T-shirt']"));
		File src=Logo.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./ScreenSort/myntraShirtLogo.png");
		Files.copy(src, dest);

	}

}
