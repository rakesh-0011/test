package dAY19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver = new ChromeDriver();
		
		Thread.sleep(1000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		String str  = driver.getCurrentUrl();
		
		System.out.println(str);
		
		String str1 = driver.getTitle();
		
		System.out.println(str1);
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")).click();
		
		
		Thread.sleep(5000);
		
		
		
		//List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='orangehrm-tabs']/div"));
		
		//System.out.println(webelements);
		
		
		
		//String pagesource =driver.getPageSource();
		//System.out.println(pagesource);
		//driver.navigate().to("https://outlook.live.com/owa/");
		
		
		
		
		//driver.close();
		
		
	}

}
