package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDeSelectAll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");

		// Click on create new sccount
		driver.findElement(By.xpath(
				"//main[@class='w-[100%] h-[14.5rem] ps-7 flex flex-col justify-around p-[0.5rem] rounded  bg-[#feebfc]  hover:shadow-slate-400 shadow-lg group']"))
				.click();

		Thread.sleep(3000);
		// identify the month dropDown
		WebElement Dropdown = driver.findElement(By.linkText("Dropdown"));
		Dropdown.click();

		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();

		Thread.sleep(3000);
		WebElement SelectCountry = driver.findElement(By.id("select-multiple-native"));

		Select s = new Select(SelectCountry);

		for (int i = 0; i < 3; i++) {
			s.selectByIndex(i);
			Thread.sleep(2000);
			s.deselectAll();
		}

	}

}
