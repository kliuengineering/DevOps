import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserTest {
	public static void main(String args[])
	{
		// interface class usage for runtime polymorphism capabilities
		// strategy pattern
		WebDriver driver = new ChromeDriver();
		
		// open a site
		driver.get("https://google.ca");
		
		// logging different things
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		try
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		driver.get
		driver.quit();
	}
}