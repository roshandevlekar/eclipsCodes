package sampleWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin2 {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rupesh\\Desktop\\SeleniumWeDriver\\SeleniumWebDriver\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("devlekarroshan7@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Roshan@77");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		//Thread.sleep(2000);
		//driver.close();
	}

}
