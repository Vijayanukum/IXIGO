package SeliniumPrac;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsPrac {
	@Test
	public void f() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//form[@id='menuform']/ul/li[3]/a/i")).click();		
		driver.findElement(By.xpath("//i[@class='pi pi-fw pi-clock layout-menuitem-icon']")).click();
		WebElement firstButton = driver.findElement(By.id("j_idt87:j_idt89"));
		firstButton.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement secondButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_idt87:j_idt90")));
		WebElement b1 = driver.findElement(By.id("j_idt87:j_idt92"));
		b1.click();
		WebDriverWait waitForInvisibility = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement b2 = driver.findElement(By.id("j_idt87:j_idt93"));
		wait.until(ExpectedConditions.invisibilityOf(b2));		
		
	}
	public void sendKeys(WebDriver driver,WebElement ele)
	{
		new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(ele));
		
	}
	
}
