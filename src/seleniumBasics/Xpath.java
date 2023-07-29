package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		//option.addArguments("--start-maximized");
		option.addArguments("incognito");
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://testenvironment.toptechschool.us/");
		
		//driver.manage().window().minimize();
		
		System.out.println("hi");
		
		
		// ChormeOptions
		
		
	}

}
