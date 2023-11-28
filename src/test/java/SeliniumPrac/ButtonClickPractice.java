package SeliniumPrac;

import java.awt.Dimension;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ButtonClickPractice {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.leafground.com/");
	  driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
	  driver.findElement(By.xpath("//i[@class='pi pi-fw pi-mobile layout-menuitem-icon']")).click();
	  //driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
	  WebElement ele=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
	  System.out.println(ele.isDisplayed());
	  // System.out.println(driver.findElement(By.id("j_idt88:j_idt94")).getLocation()); 
	  //String colr = driver.findElement(By.xpath("//*[@button='j_idt88:j_idt96'’]")).getCssValue("color");
	  //System.out.println(colr);
  }
}
