package SeliniumPrac;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownPracTest {

	@Test
	public void f() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.findElement(By.xpath("//form[@id='menuform']/ul/li[3]/a/i")).click();
		driver.findElement(By.xpath("//i[@class='pi pi-fw pi-chevron-down layout-menuitem-icon']")).click();
		WebElement ele = driver.findElement(By.xpath("//select[@style='overflow-wrap: break-word; height: 150%;']"));
		ele.click();
		ele.sendKeys("Playwright");
		ele.click();
		WebElement countryDropdown = driver.findElement(By.xpath("//div[@aria-owns='j_idt87:country_panel']"));
		countryDropdown.click();
		driver.findElement(By.xpath("//div[@class='ui-selectonemenu-items-wrapper']/ul/li[4]")).click();
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//label[text()='Select City']"));
		element.click();
		ArrayList<String> str = new ArrayList<String>();
		List<WebElement> states = driver.findElements(By.xpath("//ul[contains(@id,'city_items')]"));
		for (WebElement state : states)
		{
			str.add(state.getText());
		}
		System.out.println(str);
		Thread.sleep(3000);
		String searchText = "AWS";
		driver.findElement(By.xpath("//div[@id='j_idt87:auto-complete']/button")).click();
		List<WebElement> dropdown =driver.findElements(By.xpath("//span[@id='j_idt87:auto-complete_panel']/ul/li"));
		for (WebElement option : dropdown)
		{
		    if (option.getText().equals(searchText))
		    {
		        option.click();
		        break;
		    }
		}

	}
}
