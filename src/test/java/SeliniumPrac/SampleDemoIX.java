package SeliniumPrac;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SampleDemoIX {
	@Test
	public void f() throws InterruptedException {
		int index=1;
		String adult1, child1, child2, child3, child4, child5, child6, infant1;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ixigo.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='right-wrapper ']/div/span/span/span")).click();
		driver.findElement(By.xpath("//div[@class='ixigo-login']/div[2]/span[2]/input")).sendKeys("9885625367");
		driver.findElement(By.xpath("//div[@class='login-button']/button")).click();
		Thread.sleep(20000);
		// Entering from city/airport
		WebElement from = driver
				.findElement(By.xpath("//div[@class='flight-form max-container-width']/div/div/div/div/input"));
		Thread.sleep(10000);
		from.clear();
		Thread.sleep(2000);
		from.sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
		Thread.sleep(2000);
		from.sendKeys("IXM");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ARROW_UP);
		from.sendKeys(Keys.ENTER);
		WebElement To = driver
				.findElement(By.xpath("//div[@class='dstn u-ib u-v-align-bottom u-text-left']/div/div/input"));
		To.sendKeys("MAA");
		Thread.sleep(2000);
		To.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
//			date selection
		driver.findElement(By.xpath("//table[@class='rd-days']/tbody/tr[5]/td[4]")).click();
//			passengers selection
		driver.findElement(By.xpath("//div[@class='u-box-result']/div[2]/div[2]/span[7]")).click();
		driver.findElement(By.xpath("//div[@class='u-box-result']/div[3]/div[2]/span[2]")).click();
//			submit button
		driver.findElement(By.xpath("//div[@class='search u-ib u-v-align-bottom']/button")).click();
		Thread.sleep(6000);
//			sort 
		driver.findElement(By.xpath("//div[@class='c-dropdown srt-dd-cntr']/div/span")).click();
//			selecting Quickest
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='c-dropdown srt-dd-cntr']/ul/li[3]/span")).click();
//			clicking the arrows left and right
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='otlk-crsl']/div/div/div[2]")).click();
		driver.findElement(By.xpath("//div[@class='otlk-crsl']/div/div/div[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='otlk-crsl']/div/div/div[3]")).click();
		Thread.sleep(3000);
//			selecting the date 1st dec 
		driver.findElement(By.xpath("//div[@class='otlk-crsl']/div/div/div/a[8]")).click();
		Thread.sleep(7000);
//			selecting non stop
		driver.findElement(By.xpath("//div[@class='stop-info'  and text()='Non stop']")).click();
		driver.findElement(By.xpath("//div[@class='c-dropdown srt-dd-cntr']/div/span")).click();
//			selecting Quickest
		driver.findElement(By.xpath("//div[@class='c-dropdown srt-dd-cntr']/ul/li[3]/span")).click();
//			Bhavana
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='book-cta'])[1]")).click();
//	    enter email ID
//			driver.findElement(By.xpath("//div[@class='u-ripple']")).click();
		// enter email ID
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement element = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='contact-group']/div/div[2]/div/div[2]/input")));
		element.clear();
		element.sendKeys("traningteam04@gmail.com");
		// Reshma
		// continue button
		driver.findElement(By.xpath("//div[@class='cnfrm-cntnr continue']/div/button")).click();
		Thread.sleep(2000);
		// risk it button
		driver.findElement(By.xpath("//div[@class='cta-wrap']/div")).click();
		// continue button
		driver.findElement(By.xpath("//div[@class='btn-cntnr right']/button")).click();
		// error message
		Thread.sleep(2000);		
		WebElement ele1 = driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div[1]/div[2]/div/div/div[3]/div/div[1]/div[2]/div[1]/div[1]/div[2]"));
		adult1=ele1.getText();
		System.out.println("Adult1 error msg: "+adult1);
		WebElement ele2 = driver.findElement(By.xpath("(//div[@class='error-message'])[4]"));
		child1 = ele2.getText();
		System.out.println("Child1 error msg: " + child1);
		WebElement ele3 = driver.findElement(By.xpath("(//div[@class='error-message'])[7]"));
		child2 = ele3.getText();
		System.out.println("Child2 error msg:" + child2);
		WebElement ele4 = driver.findElement(By.xpath("(//div[@class='error-message'])[10]"));
		child3 = ele4.getText();
		System.out.println("Child3 error msg:" + child3);
		WebElement ele5 = driver.findElement(By.xpath("(//div[@class='error-message'])[13]"));
		child4 = ele5.getText();
		System.out.println("Child4 error msg: " + child4);
		WebElement ele6 = driver.findElement(By.xpath("(//div[@class='error-message'])[16]"));
		child5 = ele6.getText();
		System.out.println("Child5 error msg: " + child5);
		WebElement ele7 = driver.findElement(By.xpath("(//div[@class='error-message'])[19]"));
		child6 = ele7.getText();
		System.out.println("Child6 error msg: " + child6);
		WebElement ele8 = driver.findElement(By.xpath("(//div[@class='error-message'])[22]"));
		infant1 = ele8.getText();
		System.out.println("Infant1 error msg: " + infant1);
	}
}
