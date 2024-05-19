package day0310;


import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RakeshTest4321 
{

	public static void main(String[] args)
	{
		//WebDriverManager.getInstance(CHROME).setup();
		WebDriverManager.firefoxdriver().setup();
		
		//System.setProperty("webdriver.firefox.driver", "C:\\geckodriver.exe");
		
		FirefoxDriver  driver = new FirefoxDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

}
