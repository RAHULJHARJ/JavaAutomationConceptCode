package SelectClass;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBookPageLike {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
        WebElement UserIdText = driver.findElement(By.id("email"));
        UserIdText.sendKeys("7970992840");
//        Thread.sleep(2000);
        WebElement PasswordText = driver.findElement(By.xpath("//input[@type='password']"));
        PasswordText.sendKeys("Gopagal@123");
//        Thread.sleep(2000);
        WebElement LoginButton=driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
        LoginButton.click();
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement rahulJha = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Rahul Jha']")));
        rahulJha.click();
        WebElement postLike = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='x1b0d499 x1d69dk1'])[1]")));
        postLike.click();

	}

}
