package SeliniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMTest {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		/*By formSelector = By.xpath(""); // Replace with your form's ID
		WebElement formElement = driver.findElement(formSelector);
		
		By inputSelector = By.name("username"); // Replace with the name attribute of the input field
		WebElement usernameInput = formElement.findElement(inputSelector);
		usernameInput.sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//*[text()=' Login ']")).click();*/
		
		By usernameSelector = By.id("txtUsername");
		WebElement usernameInput = driver.findElement(usernameSelector);

		// Locate the password input field
		By passwordSelector = By.id("txtPassword");
		WebElement passwordInput = driver.findElement(passwordSelector);

		// Locate the login button
		By loginButtonSelector = By.id("btnLogin");
		WebElement loginButton = driver.findElement(loginButtonSelector);
		// Enter username and password
		usernameInput.sendKeys("your_username");
		passwordInput.sendKeys("your_password");

		// Click the login button
		loginButton.click();
  }
  
}
