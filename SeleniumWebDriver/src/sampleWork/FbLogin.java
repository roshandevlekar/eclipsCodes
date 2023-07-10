package sampleWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569897%7Cb%7Cfb%20login%27%7C&placement=&creative=589460569897&keyword=fb%20login%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-370844460174%26loc_physical_ms%3D9300140%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw44mlBhAQEiwAqP3eVounErwHEkV4_bQQO_Lg3pEVlJD9InHlouZFCL5n_OzfxsIYOGWs4RoCVzoQAvD_BwE");
		driver.findElement(By.name("firstname")).sendKeys("roshan");
		driver.findElement(By.name("lastname")).sendKeys("devlekar");
		driver.findElement(By.name("reg_email__")).sendKeys("devlekarroshan7@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("devlekarroshan7@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("roshan@77");
		driver.findElement(By.xpath("//select[@name='birthday_day']/descendant::option[@value='26']")).click();
		driver.findElement(By.xpath("//select[@name='birthday_month']/descendant::option[text()='Feb']")).click();
		driver.findElement(By.xpath("//select[@name='birthday_year']/descendant::option[text()='1998']")).click();
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		Thread.sleep(2000);
		driver.close();
	}
}
