package SeliniumPrac;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AutomationExerciseSitePrac {
	@Test
	public void f() {
		ChromeOptions opt = new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='shop-menu pull-right']/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='accordian']/div[1]/div[1]/h4/a/span/i")).click();
	}
}
