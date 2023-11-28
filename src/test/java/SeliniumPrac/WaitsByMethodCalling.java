package SeliniumPrac;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitsByMethodCalling {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement menu=driver.findElement(By.xpath("//i[@class='pi pi-fw pi-clock layout-menuitem-icon']"));
		clickMethod(driver,menu);
  }
  @Test
  public void clickMethod(WebDriver driver,WebElement ele)
  {
	  			 
	  
	  new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(ele));
	  ele.click();
  }
}
