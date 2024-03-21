package Bsic;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class AllElement { 
	@Test
public void setUp() {
WebDriver driver = new ChromeDriver();driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(2000);
driver.close();
}
}
