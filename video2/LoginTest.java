package video2;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest
{

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//WebDriverManager.edgedriver().setup();
		//EdgeDriver driver = new EdgeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver = new FirefoxDriver();
		//Thread.sleep(10000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("admin23");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		String act_title = null;
		try
		{
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		}
		
		catch(NoSuchElementException e)
		{
		}
		
		Thread.sleep(5000);
		
		String exp_title = "Dashboard";
		Thread.sleep(1000);
		
		if(act_title.equals(exp_title))
		{
			System.out.println("test passed");
		}
		
		else
		{
			System.out.println("test failed");
		}
		
		
		
	}

}
