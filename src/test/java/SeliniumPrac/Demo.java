package SeliniumPrac;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class Demo
{
	
	public static void main(String[] args)
	{
	
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all team']"));
		List<String> strName = new ArrayList<String>();
		for (WebElement var : elements) {
			String strvar = var.getText();
			strName.add(strvar);
		}
		System.out.println("The weekly tasks are :" + strName);

	}
}


