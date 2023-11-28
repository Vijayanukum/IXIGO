package SeliniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathPractice {
  @Test
  public void method1() throws InterruptedException
  {
	  	WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		//single attribute
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(2000);
		//multiple attributes
		driver.findElement(By.xpath("//input[@placeholder='Password'][@name='password']")).sendKeys("secret_sauce");
		// Using AND
		driver.findElement(By.xpath("//input[@value='Login' and @name='login-button']")).click();
		Thread.sleep(2000);
		//Using OR
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack' or name='add-to-cart-sauce-labs-backpack']")).click();
		//contains()
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@class,'shopping_cart_link')]")).click();
		//text()
		driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']")).click();
		//Using Single Slash
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/button")).click();
		//Double Slash
		driver.findElement(By.xpath("//button[@name='remove-sauce-labs-backpack']")).click();
		Thread.sleep(2000);
		//starts-with()
		driver.findElement(By.xpath("//*[starts-with(@id,'react-burger')]")).click();
		Thread.sleep(2000);
		//Finding elements using index
		driver.findElement(By.xpath("//nav[@class='bm-item-list']/a[3]")).click();
		//preceding
		driver.findElement(By.xpath("//*[@placeholder='Password']//preceding::input[@type='text']")).sendKeys("performance_glitch_user");
		Thread.sleep(2000);
		//following
		driver.findElement(By.xpath("//*[@placeholder='Username']//following::input")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Open Menu']")).click();
		Thread.sleep(2000);
		//last
		driver.findElement(By.xpath("(//a[@tabindex='0'])[last()-1]")).click();
		Thread.sleep(2000);
		//position
		driver.findElement(By.xpath("(//input[@type='text'])[position()=1]")).sendKeys("problem_user");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();

  }
}
