package loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases {
	WebDriver driver = new ChromeDriver();
	String theURL = "https://automationteststore.com/";
	String SignupPage = "https://automationteststore.com/index.php?rt=account/create";

	@BeforeTest
	public void mySetup() {
		driver.get(theURL);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void Signup() {
		driver.navigate().to(SignupPage);
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"AccountFrm_firstname\"]"));
		firstName.sendKeys("Abdullrahman");

	}
}
