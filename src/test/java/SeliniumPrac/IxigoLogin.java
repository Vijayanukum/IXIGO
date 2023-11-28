package SeliniumPrac;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class IxigoLogin {
	@Test
	public void f() throws InterruptedException {
		int index = 1;
		int j = 1;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ixigo.com");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='right-wrapper ']/div/span/span/span")).click();
		driver.findElement(By.xpath("//div[@class='ixigo-login']/div[2]/span[2]/input")).sendKeys("9014427793");
		driver.findElement(By.xpath("//div[@class='login-button']/button")).click();
		Thread.sleep(30000);
		// Buses Menu
		driver.findElement(By.xpath("//div[@class='left-wrapper ']/span[2]/nav/span[3]/a/span")).click();
		// from
		WebElement sourceCity = driver.findElement(By.xpath("//div[@class='container text-input  ']/div/div[2]/input"));
		sourceCity.clear();
		Thread.sleep(2000);
		sourceCity.sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
		Thread.sleep(2000);
		sourceCity.sendKeys("Chennai");
		Thread.sleep(2000);
		sourceCity.sendKeys(Keys.ARROW_DOWN);
		sourceCity.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		// to
		WebElement destinationCity = driver
				.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/input"));
		destinationCity.clear();
		destinationCity.sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
		Thread.sleep(2000);
		destinationCity.sendKeys("Hyderabad");
		Thread.sleep(2000);
		destinationCity.sendKeys(Keys.ARROW_DOWN);
		destinationCity.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		// date
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/div[3]/div/div/div/div/div[2]/input"))
				.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='journey-date-input-wrapper col']/div/div/div/div")).click();
		driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']")).sendKeys("30/11/2023");
		driver.findElement(By.xpath("//div[@class='container calendar  ']/div[2]/span[37]")).click();
		Thread.sleep(2000);
		// search button
		driver.findElement(By.xpath("//a[@class='btn btn-search filled primary lg inactive button']")).click();
		Thread.sleep(4000);
		// price drop checkbox
		driver.findElement(By.id("price-drop")).click();
		// Bus type
		driver.findElement(By.xpath("//div[@class='container filter-list ']/a[1]/span")).click();
		// price range
		WebElement slider = driver.findElement(By.xpath("//div[@class='row filter-wrapper ']/div[2]/div[4]"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(slider).moveByOffset(100, 0).release().perform();
		// Depature time
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='container departureFilterList ']/a[3]")).click();
		driver.findElement(By.xpath("//div[@class='container departureFilterList ']/a[1]")).click();
		// show seats
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		Thread.sleep(4000);
		// seat selection
		driver.findElement(By.xpath("(//*[@id='seat-layout-details'])[1]/tbody/tr[5]/td[5]/div/button/span")).click();
		driver.findElement(By.xpath("(//*[@id='seat-layout-details'])[1]/tbody/tr[5]/td[4]/div/button/span")).click();
		driver.findElement(By.xpath("(//*[@id='seat-layout-details'])[1]/tbody/tr[5]/td[3]/div/button/span")).click();
		driver.findElement(By.xpath("(//*[@id='seat-layout-details'])[1]/tbody/tr[5]/td[6]/div/button/span")).click();
		driver.findElement(By.xpath("(//*[@id='seat-layout-details'])[1]/tbody/tr[5]/td[7]/div/button/span")).click();
		driver.findElement(By.xpath("(//*[@id='seat-layout-details'])[2]/tbody/tr[5]/td[7]/div/button/span")).click();
		// driver.findElement(By.xpath("(//*[@id='seat-layout-details'])[2]/tbody/tr[5]/td[6]/div/button/span")).click();
		WebElement alertButton = driver
				.findElement(By.xpath("(//*[@id='seat-layout-details'])[2]/tbody/tr[5]/td[6]/div/button/span"));
		alertButton.click();
		// Switch to the alert
		Alert alert = driver.switchTo().alert();
		// Get the text of the alert
		String alertText = alert.getText();
		System.out.println("Alert Text: " + alertText);
		alert.dismiss();
		Thread.sleep(1000);
		// pickup
		driver.findElement(By.xpath("//div[@class='scrollable-container place-container primary ']/div[4]/input"))
				.click();
		driver.findElement(By.xpath("//div[@class='scrollable-container place-container primary ']/div[3]/input"))
				.click();
		// continue button
		driver.findElement(By.xpath("(//div[@class=' col s12 m12'])[2]/div/div/button")).click();
		Thread.sleep(4000);
		// continue to pay button
		driver.findElement(By.xpath("(//div[@class='container card   md '])[3]/button")).click();
		// Name of the Passenger Error messages
		List<WebElement> names = driver.findElements(By.xpath("(//div[@class='container text-input  ']/span)"));
		for (WebElement var : names) {
			String errorMessage = var.getText();
			System.out.println("Error message for the Name of the Passenger" + index + ": " + errorMessage);
			index++;
		}
		// Age of the Passenger error messages
		System.out.println("*****************************************");
		List<WebElement> ages = driver.findElements(By.xpath("(//*[@id=\"passenger-detail-age\"]/div/span)"));
		for (WebElement var : ages) {
			String errorMessage = var.getText();
			System.out.println("Error message for the Age of the Passenger" + j + ": " + errorMessage);
			j++;
		}
		// Passing names of the passengers
		List<WebElement> passengerNames = driver
				.findElements(By.xpath("(//div[@class='container text-input  ']/div/div/input)"));

		// Different texts to be sent to each input element
		List<String> nameOfTravellers = Arrays.asList("karun", "tharun", "suman", "laxman", "dhawan", "varun");

		// Iterate through the list of input elements and send different texts
		for (int i = 0; i < passengerNames.size(); i++) {
			WebElement inputElement = passengerNames.get(i);
			String textToSend = nameOfTravellers.get(i);
			// Perform actions on each input element
			inputElement.sendKeys(textToSend);
		}
		// Passing ages of the passengers
		List<WebElement> passengerAges = driver
				.findElements(By.xpath("(//div[@id='passenger-detail-age']/div/div/div[2]/input)"));

		// Different texts to be sent to each input element
		List<String> ageOfTravellers = Arrays.asList("30", "25", "21", "27", "20", "22");

		// Iterate through the list of input elements and send different texts
		for (int i = 0; i < passengerAges.size(); i++) {
			WebElement inputElement = passengerAges.get(i);
			String textToSend = ageOfTravellers.get(i);
			// Perform actions on each input element
			inputElement.sendKeys(textToSend);
		}

	}
}
