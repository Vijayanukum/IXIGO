package SeliniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FullFlowTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password'][@name='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@value='Login' and @name='login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' or name='add-to-cart-sauce-labs-backpack']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//*[@id='checkout']")).click();
		driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("karan");
		driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("varma");
		driver.findElement(By.xpath("//*[@placeholder='Zip/Postal Code']")).sendKeys("517501");
		driver.findElement(By.xpath("//*[@id='continue']")).click();
		driver.findElement(By.xpath("//*[@id='finish']")).click();
		driver.findElement(By.xpath("//*[@id='react-burger-menu-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='bm-menu']/nav/a[3]")).click();
		 }
}
