package ScreenShortMethods;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakesScreenShorts {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.myntra.com/");
		
		TakesScreenshot t= (TakesScreenshot) driver;
		
		File src=t.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./ScreenSort/Myntra.png");
		Files.copy(src, dest);

	}

}
