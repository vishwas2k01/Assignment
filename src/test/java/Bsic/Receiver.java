package Bsic;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.w3c.dom.events.EventException;
@Test
public class Receiver {
public void Receiver (String email,String password) {
	WebDriver driver = new ChromeDrievr();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Druration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/computers");
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id(password)).sendKeys(password);
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
@DataProvider(name = 'login')
public Object[][] sender() throws EventException, IOException{
	File file = new File("https://demowebshop.tricentis.com/computers");
	FileInputStream fis = new FileInputStream(file);
	Workbook wb = WorkbookFcatory.create(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	int row = sheet.getPhysicalNumberOfRows();
	int colom = sheet.getRow(0).getPhysicalNumberofCells();
	object
	
	
}
}
