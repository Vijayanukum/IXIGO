package SeliniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TxtBoxClick {
  @Test
  public void f()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.leafground.com/");
	  driver.findElement(By.xpath("//form[@id='menuform']/ul/li[3]/a/i")).click();
	  driver.findElement(By.xpath("//i[@class='pi pi-fw pi-check-square layout-menuitem-icon']")).click();
	  driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("karan");
	  driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys("India");
	  System.out.println(driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isEnabled());
	  driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
	  System.out.println(driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value"));
	  driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("vijay@123.com");	  
	  driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys(Keys.TAB);
	  driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("hi im from tirupati.Tirupati is Temple Town");
	  driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']/p")).sendKeys("happy");
	  driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
	  WebElement element=driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']"));
	  element.sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();
	  driver.findElement(By.xpath("//input[@id='j_idt106:auto-complete_input']")).sendKeys("hh");
      driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']")).click();
	  driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("12");
	  System.out.println(driver.findElement(By.className("ui-slider-handle ui-corner-all ui-state-default")).getAttribute("style"));
	  driver.findElement(By.xpath("//input[@id='j_idt106:j_idt122']")).sendKeys("hi");
	  System.out.println(driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']")).isDisplayed());
  }
}
