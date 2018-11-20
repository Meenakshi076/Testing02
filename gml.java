package ORANGEHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class gml {

		
		public static void main(String[] args) throws InterruptedException {
			  FirefoxDriver driver  = new FirefoxDriver();
			  driver.get("http://www.gmail.com/");
			  driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("binodkr076@gmail.com");
			  driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();//next
			  driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("****");
			  driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();//next(login)
			  Thread.sleep(20000L);
			  String inbox=driver.findElement(By.xpath("//*[contains(@title,'Inbox')]")).getText();
			  String unreadInboxMails=inbox.substring(inbox.indexOf("(")+1,inbox.indexOf(")"));
			  System.out.println("inbox  "+inbox);
			  System.out.println(unreadInboxMails);
			  
			  List<WebElement> mailsObj=driver.findElements(By.xpath("//*[@class='zA zE']"));
			  
			  System.out.println("total no of unread mails are==="+mailsObj.size());
			  mailsObj.get(0).click();
			  
			  
	}

}
