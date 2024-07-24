package PopupsMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import javax.tools.Tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateNaukriPageFileUplode {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		WebElement IamExprienced=driver.findElement(By.xpath("//h2[contains(text(),'experienced')]"));
		IamExprienced.click();
		Thread.sleep(2000);
		
		WebElement Upload=driver.findElement(By.xpath("//button[@class='uploadResume resman-btn-primary resman-btn-small']"));
		Upload.click();
		
		StringSelection path=new StringSelection("C:\\Users\\rahul\\OneDrive\\Desktop\\Rahul Pay Slip C.docx");
		
		Clipboard tool=Toolkit.getDefaultToolkit().getSystemClipboard();
		tool.setContents(path, null);
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		
		
	}

}
