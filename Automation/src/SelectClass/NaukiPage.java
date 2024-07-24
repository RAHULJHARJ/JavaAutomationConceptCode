package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaukiPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/");
		WebElement LoginButton=driver.findElement(By.id("login_Layer"));
		LoginButton.click();
		WebElement EmailTextField=driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
		EmailTextField.sendKeys("rahuljha14012002@gmail.com",Keys.ENTER);
		WebElement PasswordTextField=driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		PasswordTextField.sendKeys("Gopagal@123",Keys.ENTER);
		WebElement Logout=driver.findElement(By.xpath("//img[@class='nI-gNb-icon-img']"));
		Logout.click();
		WebElement LogouButtont=driver.findElement(By.xpath("(//a[@class='nI-gNb-list-cta'])[4]"));
		LogouButtont.click();
		driver.close();
		driver.quit();
	}

}
