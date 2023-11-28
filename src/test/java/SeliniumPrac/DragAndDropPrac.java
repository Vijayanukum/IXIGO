package SeliniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropPrac {
  @Test
  public void f() throws InterruptedException {
	  	WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//ul[@id='menuform:j_idt37']/li[2]")).click();
		driver.findElement(By.xpath("//ul[@role='menu']/li[4]")).click();
		Thread.sleep(3000);
		Actions builder = new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//div[@id='form:conpnl']"));
		builder.dragAndDropBy(ele, 200, 200).build().perform();
		
		WebElement source=driver.findElement(By.xpath("//div[@id='form:drag']"));
		WebElement destination=driver.findElement(By.xpath("//div[@id='form:drop']"));
		builder.dragAndDrop(source, destination).build().perform();
		WebElement element1=driver.findElement(By.xpath("//table[@role='grid']/thead/tr/th"));
		WebElement element2=driver.findElement(By.xpath("//table[@role='grid']/thead/tr/th[2]"));
		builder.clickAndHold(element1).build().perform();
		builder.moveToElement(element2).build().perform();
		Thread.sleep(3000);
		builder.release(element2).build().perform();
		Thread.sleep(4000);
		
		WebElement sourceRow = driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']/tr[3]"));
        WebElement targetRow = driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']/tr[1]"));
        Thread.sleep(4000);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceRow, targetRow).perform();
        
        WebElement img = driver.findElement(By.xpath("//img[@id='form:logo']"));       
        int width = img.getSize().getWidth();   
        System.out.println(width);
        Actions action = new Actions(driver);
        Thread.sleep(4000);        
        action.clickAndHold(img).moveByOffset(10,10).build().perform(); 
        int width1 = img.getSize().getWidth();
        System.out.println(width1);
        //driver.quit();
  }
}
