package Batch2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class6 {
	@Test

	public void Bmw() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bmw.in/en/index.html");
	Reporter.log("I am in Bmw");
	driver.close();
}
}
