package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-flc2hcd/login.do");
		
		//read the data from excel file and test the login page
		Flib flib=new Flib();
			
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTimeTestdata.xlsx","validcreds", 1, 0));
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestdata.xlsx","validcreds", 1, 1));
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
		driver.close();
		
		
	}

}