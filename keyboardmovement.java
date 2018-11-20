package ORANGEHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keyboardmovement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new FirefoxDriver();
		
		driver.get(objrepo.url);
		WebElement username=driver.findElement(By.id(objrepo.userid_id));
		username.sendKeys("Admin");
		username.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
		WebElement userpassword=driver.findElement(By.id(objrepo.userpassword_id));
		userpassword.sendKeys("admin");
		Thread.sleep(3000);
		String both =Keys.chord(Keys.TAB,Keys.SHIFT);
		userpassword.sendKeys(both);
		username.clear();
		username.sendKeys("admin");
		Thread.sleep(3000);
		username.sendKeys(Keys.TAB);
		
		userpassword.sendKeys("admin");
		userpassword.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.id(objrepo.loginbtn_id)).click();

	}

}
