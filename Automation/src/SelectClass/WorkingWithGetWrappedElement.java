package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithGetWrappedElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
        WebElement UiInterface = driver.findElement(By.xpath("//main[@class='w-[100%] h-[14.5rem] ps-7 flex flex-col justify-around p-[0.5rem] rounded  bg-[#feebfc]  hover:shadow-slate-400 shadow-lg group']"));
        UiInterface.click();
        WebElement Dropdown = driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[5]"));
        Dropdown.click();
        WebElement Multiple = driver.findElement(By.xpath("(//a[@class='poppins ps-1 pe-3 py-1 font-semibold flex items-center justify-between w-full text-[14px] '])[1]"));
        Multiple.click();
        Select s=new Select(Dropdown);
        
        WebElement allOptions=s.getWrappedElement();
        System.out.println(allOptions.getText());
	}

}
