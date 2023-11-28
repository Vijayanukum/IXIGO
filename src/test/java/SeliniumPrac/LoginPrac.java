package SeliniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPrac {
  @Test
  public void f()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.leafground.com/");
	  driver.findElement(By.id("email")).sendKeys("vijayanukum@gmail.com");
	  driver.findElement(By.id("message")).sendKeys("hi");
	  driver.findElement(By.id("j_idt130")).click();
	  
  }
}
