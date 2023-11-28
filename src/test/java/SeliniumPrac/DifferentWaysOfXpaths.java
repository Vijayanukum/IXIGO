package SeliniumPrac;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class DifferentWaysOfXpaths {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("selinium");
		Thread.sleep(1000);
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		for(WebElement element:elements)
		{
			if(element.getText().equals("selenium webdriver"))
			{
				element.click();
				break;
			}
		}
		 
	    }
}
