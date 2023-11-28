package SeliniumPrac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class BrowserLaunchTest
{
	@Test
	public void goibiboLogin()
	{		
		//testAnotherDAta();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.goibibo.com/");
//		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
        //driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//		//driver.findElement((((WebElement) By.name("username")).sendKeys("Admin")) );
		WebElement mobileNo = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div/div/div[2]/div/div/form/div/input"));
		mobileNo.sendKeys("8074280286");   
		WebElement btn = driver.findElement(By.className("sc-dhKdcB cYwnDu"));
		btn.click();
		WebElement TxtBoxContent = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[1]/div/div/div[2]/div/div/form/div/input"));
		TxtBoxContent.getText();
		System.out.println(TxtBoxContent);
		//        WebElement otp = driver.findElement(By.className("desktop"));
    }
	/*private void testAnotherDAta()
	{
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2F%3Frd%3D0%26link%3Dhome_account");
		WebElement element = driver.findElement(By.className("_1_3w1N"));
		Actions builder = new Actions(driver);
		builder.moveToElement(element).build().perform();		
		WebElement orders = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/ul/li[2]/a"));
		orders.click();		
	}*/
}
