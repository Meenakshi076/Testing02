package ORANGEHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class objrun {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get(objrepo.url);
		Thread.sleep(3000);
		driver.findElement(By.id(objrepo.userid_id)).sendKeys("Admin");
		driver.findElement(By.id(objrepo.userpassword_id)).sendKeys("admin");
		driver.findElement(By.id(objrepo.loginbtn_id)).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath(objrepo.admin_xpath)).click();
		driver.findElement(By.xpath(objrepo.addemp_xpath)).click();
		driver.findElement(By.xpath(objrepo.firstname_xpath)).sendKeys("meenakshi2");
		driver.findElement(By.xpath(objrepo.lastname_xpath)).sendKeys("roy2");
		//driver.findElement(By.xpath(objrepo.empid_xpath)).sendKeys("101");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(objrepo.createlogin_xpath)).click();
		driver.findElement(By.xpath(objrepo.createusername_xpath)).sendKeys("meenakshi2");
		driver.findElement(By.xpath(objrepo.createuserpwd_xpath)).sendKeys("meenakshi2");
		driver.findElement(By.xpath(objrepo.createcnfrmpwd_xpath)).sendKeys("meenakshi2");
		driver.findElement(By.xpath(objrepo.createusersave_xpath)).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='btnSave']")).click();
		
		WebElement gender=driver.findElement(By.xpath(".//*[@id='personal_optGender_2']"));
		gender.click();
		driver.findElement(By.xpath(".//*[@id='btnSave']")).click();
		
		Thread.sleep(3000);
		driver.close();
		 
		
		
		

	}

}
