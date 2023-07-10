package sampleWork;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RTM {

	public static void main(String[] args) throws InterruptedException
	{
		//How to achieve runtime polymorphism
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Select the browser which you want to select");
		String browserValue = sc.next();
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://desktop-flc2hcd/login.do");
			Thread.sleep(2000);
			driver.close();
		}
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","./Drivers/msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("http://desktop-flc2hcd/login.do");
			Thread.sleep(2000);
			driver.close();
		}
		else if(browserValue.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("http://desktop-flc2hcd/login.do");
			Thread.sleep(2000);
			driver.close();
		}
		else
			System.out.println("select valid browser value");
		
	}

}
