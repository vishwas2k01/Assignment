package Bsic;




	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Reporter;
	import org.testng.annotations.Test;
	public class HelperMethods2 {


		@Test(priority = 2, dependsOnMethods= "nike")
		public void dws() {

				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("https://demowebshop.tricentis.com/");
				
			}
		@Test(priority = 1)
			public void csk() {
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("https://www.chennaisuperkings.com/");
				Reporter.log("Iam from csk",true);
				driver.close();
			}
		@Test(priority = 1)
			
			public void Rcb() {
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("https://www.royalchallengers.com/");
				Reporter.log("I am from Rcb",true);
				driver.close();
			}
			
			}



}
