package Batch1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Class4 {
	@Test
	public void Reebok() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://reebok.abfrl.in/");
	Reporter.log("I am in reebook");
	driver.close();
	}
}
