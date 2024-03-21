package Bsic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class DWSHOMEPAGE {
	
	DWSHOMEPAGE(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
@FindBy(xpath="//a[@class='ico-register']")
WebElement register;
@FindBy(xpath="//a[@class='ico-login']")  
WebElement login;
@FindBy(xpath="//a[contains(text(),'Books')]")
WebElement books;
@FindBy(xpath="//a[contains(text(),'Computers')]")
WebElement computers;
@FindBy(xpath="//a[contains(text(),'Electronics')]")
WebElement electronics;
@FindBy(xpath="//a[contains(text(),'Apparel & Shoes')]")
WebElement apparelshoes;
@FindBy(xpath="//a[contains(text(),'Digital downloads')]")
WebElement digitaldownloads;
@FindBy(xpath="//a[contains(text(),'Jewelry')]")
WebElement jewelery;
@FindBy(xpath="//a[contains(text(),'Gift Cards')]")
WebElement giftcards;
@FindBy(id="newsletter-email")
WebElement newslettersearch;

}
}
