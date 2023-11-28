package SeliniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NewTestBewakoof {
  @Test
  public void f() throws InterruptedException {
	  ChromeOptions options= new ChromeOptions();
	  options.addArguments("disable-notifications");
	  WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.bewakoof.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='mainHeaderCols dropDownDiv']/span[2]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='productImg']/img")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.id("testSizes_2XL")).click();
		driver.findElement(By.xpath("//*[@id='testSizes_M']")).click();
		 try {
	            // Identify the parent div using its unique attribute (e.g., by class name)
	            WebElement parentDiv = driver.findElement(By.className("selectSize"));

	            // Find child div elements within the parent div
	            List<WebElement> childDivs = parentDiv.findElements(By.tagName("div"));

	            // Loop through the list and click on each child div
	            for (WebElement childDiv : childDivs) {
	                // Click on each child div
	                childDiv.click();
	                
	                // You can perform additional actions after clicking if needed
	            }
	        } catch (org.openqa.selenium.NoSuchElementException e) {
	            System.err.println("Element not found: " + e.getMessage());
	        } finally {
	            // Close the browser
	            driver.quit();}

		
}
}