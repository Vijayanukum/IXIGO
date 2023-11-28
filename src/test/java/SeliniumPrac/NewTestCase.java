package SeliniumPrac;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class NewTestCase
{
	
	@Test
	public void f()
	{
		ArrayList<String> countyNames= new ArrayList<String>();		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");		
		List<WebElement> cells = driver.findElements(By.xpath("//div[@id='j_idt154_content']/table/tbody/tr/td/span"));
		for (WebElement cell : cells)
		{			
			countyNames.add(cell.getText());		
		}
		System.out.println(countyNames);		
	}

}
