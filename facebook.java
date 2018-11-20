package ORANGEHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		
		//facebook login checking notification and friend request and get logout
		driver.get("https://www.facebook.com/");
		
		//login id and width of box
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("meenakshi076@gmail.com");
		//driver.findElement(By.xpath(".//*[@id='email']")).getSize().getWidth();

		//password
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("*****");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_a']/div[1]/div[1]/div/a/span/span")).click();
		
		driver.findElement(By.xpath(".//*[@id='u_jsonp_4_9']/li[2]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='u_0_b']/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='fbRequestsJewel']/a/div")).click();
		
		driver.findElement(By.xpath(".//*[@id='u_0_c']/a/div")).click();
		
		driver.findElement(By.xpath(".//*[@id='fbNotificationsJewel']/a/div")).click();
		
		driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
		
		driver.findElement(By.xpath(".//*[@id='js_1zr']/div/div/ul/li[16]")).click();
		
	}

}
