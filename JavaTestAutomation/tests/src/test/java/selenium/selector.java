import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorsExample {
	public static void main(String argv[])
	{
        SelectByID();
	}

    public static void SelectByID() {
        ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.ca");
		
		WebElement searchBox = driver.findElement( By.id("APjFqb") );
		searchBox.sendKeys("Brad Wang from Waterloo" + Keys.ENTER);
		
		try
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		driver.quit();
    }
}