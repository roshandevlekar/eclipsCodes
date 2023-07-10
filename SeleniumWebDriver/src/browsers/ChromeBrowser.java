package browsers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		driver.switchTo().frame(frameElement);
		
		Thread.sleep(2000);
		WebElement chatBox = driver.findElement(By.id("chat-icon"));
		chatBox.click();
		Thread.sleep(3000);
		
		
		//switch the control back the main webpage..
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-name")).sendKeys("roshan");
		driver.findElement(By.id("chat-fc-email")).sendKeys("devlekarroshan7@gmailcom");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("7718063470");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='fc-button']")).click();
		//driver.close();
	}

}
