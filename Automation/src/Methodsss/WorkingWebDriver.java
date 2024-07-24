package Methodsss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWebDriver {

	public static void main(String[] args) {
		
		//To launch the browser
		WebDriver driver = new ChromeDriver();
		//launch the webbrowser
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		//to fetch the title of webPage
		String yt=driver.getTitle();
		System.out.println("Title is:-"+yt);
		//to fetch the Current url of webPage
		String url=driver.getCurrentUrl();
		System.out.println("url is :-"+ url);
		//to fetch the PageSource of webPage
		String pageSource=driver.getPageSource();
		System.out.println("PageSource is :-"+pageSource);
		//To close the browser
		driver.close();
		//to close the parent as well as child window
		driver.quit();
	}

}
