package PracticeRevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
        WebElement Ui=driver.findElement(By.xpath("//main[@class='w-[100%] h-[14.5rem] ps-7 flex flex-col justify-around p-[0.5rem] rounded  bg-[#feebfc]  hover:shadow-slate-400 shadow-lg group']"));
        Ui.click();
        WebElement Dropdown=driver.findElement(By.xpath("//section[@class='poppins text-[14px]' and text()='Dropdown']"));
        Dropdown.click();
        Thread.sleep(2000);
        WebElement Multiple=driver.findElement(By.xpath("//a[@class='poppins ps-1 pe-3 py-1 font-semibold flex items-center justify-between w-full text-[14px] text-orange-500 active']"));
        Multiple.clear();
        
	}

}
