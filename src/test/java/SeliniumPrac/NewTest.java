package SeliniumPrac;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException 
  {
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--disable-notifications");
	  //Map<String, Object> prefs = new HashMap<String, Object>();	    
	//add key and value to map as follow to switch off browser notification
	//Pass the argument 1 to allow and 2 to block
	//prefs.put("profile.default_content_setting_values.notifications", 2);
	//options.setExperimentalOption("prefs", prefs);
	  WebDriver driver = new ChromeDriver(options);
      driver.get("https://www.redbus.in/");
      driver.findElement(By.xpath("//*[@class='rb_header']/ul[2]/li[2]")).click();
      driver.findElement(By.xpath("//*[@id=\"user_sign_in_sign_up\"]")).click();
     // driver.wait(1);
      //driver.switchTo().activeElement();
      driver.switchTo().frame(0);

      

      //frames = wait(this.browser, 10).until(EC.presence_of_all_elements_located((By.XPATH,"//iframe")))

      driver.findElement(By.id("mobileNoInp")).sendKeys("9099");
     // driver.findElement(By.xpath("//*[@class='mobileInputContainer clearfix contact-box']/div[3]/input")).click();
      //driver.findElement(By.xpath("//input[@id=\"mobileNoInp\"]")).click();
    		  // Locate the dropdown element//*[@id="mobileNoInp"]
      ///WebElement dropdown = driver.findElement(By.xpath("//div[@class='header_dropdown_menu']"));
      // Create a Select object
      //Select select = new Select(dropdown);

      // Select an option by visible text
     // select.selectByVisibleText("Login/ Sign Up");

      // Perform other actions as needed

      // Close the WebDriver
      //driver.quit();
	//*[@id="account_dd"]/div[1]
      
    //*[@id="user_sign_in_sign_up"]/span
  }
}
