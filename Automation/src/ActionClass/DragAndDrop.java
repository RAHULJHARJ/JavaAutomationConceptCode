package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		
		//Create the object of action class
		Actions a=new Actions(driver);
		
		WebElement Drag=driver.findElement(By.xpath("(//div[@class='draggable'])[1]"));
		WebElement Drop=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		a.dragAndDrop(Drag, Drop).perform();
		
		

	}

}
