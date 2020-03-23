package xeroTestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class XeroAssignment extends XeroReusableMethods {

	@Test(priority=1)
	public void TC_1() {
		InitializeDriver();
		CreateReport();
		logger = report.startTest("TC_1");
		OpenUrl("https://login.xero.com/");
		logger.log(LogStatus.INFO,"URL Opened Successfully");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("err1508@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Practice123");
		WebElement LoginBtn = driver.findElement(By.id("submitButton"));
		LoginBtn.click();
	}
	@Test(priority=2)
	public void TC_2() {
		InitializeDriver();
		CreateReport();
		logger = report.startTest("TC_1");
		OpenUrl("https://login.xero.com/");
		logger.log(LogStatus.INFO,"URL Opened Successfully");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("err1508@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("hfyfygf");
		WebElement LoginBtn = driver.findElement(By.id("submitButton"));
		LoginBtn.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement WrngPasswd = driver.findElement(By.xpath("//li[contains(text(),'Your email or password is incorrect')]"));
		
	}
	
}
