package ORANGEHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;


public class codeinsect {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		driver.get("http://test.akcorporation.co.in/");
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[1]/input")).sendKeys("admin@example.com");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[2]/input")).sendKeys("codeinsect");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/form/div[3]/div[2]/input")).click();
		
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/ul/li[3]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div[6]/div/div/div/div/div/div/div[2]/form/div[1]/div[1]/div/input")).sendKeys("Meenakshi");
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div[6]/div/div/div/div/div/div/div[2]/form/div[1]/div[2]/div/input")).sendKeys("Roy");		
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div[6]/div/div/div/div/div/div/div[2]/form/div[1]/div[3]/div/input")).sendKeys("06/06/1994");		
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div[6]/div/div/div/div/div/div/div[2]/form/div[1]/div[4]/div/div/input")).sendKeys("8149987852");		
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div[6]/div/div/div/div/div/div/div[2]/form/div[1]/div[6]/div/div/input")).sendKeys("pune");	
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div[6]/div/div/div/div/div/div/div[2]/form/div[1]/div[7]/div/div/input")).sendKeys("Bihar");
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div[6]/div/div/div/div/div/div/div[2]/form/div[1]/div[8]/div/div/input")).sendKeys("meenakshi076@gmail.com");
		//driver.findElement(By.xpath("")).sendKeys("");//browse pic
		WebElement department = driver.findElement(By.xpath(".//*[@id='staffDept']"));
		Select dept =new Select( department);
		dept.selectByVisibleText("Computer");
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div[6]/div/div/div/div/div/div/div[2]/form/div[1]/div[13]/div/input")).sendKeys("25/08/2018");
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div[6]/div/div/div/div/div/div/div[2]/form/div[1]/div[14]/div/input")).sendKeys("02/03");
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div[6]/div/div/div/div/div/div/div[2]/form/div[1]/div[15]/div/input")).sendKeys("320000");
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div/div[6]/div/div/div/div/div/div/div[2]/form/div[1]/div[16]/div/input")).sendKeys("9.30Am");
		//driver.findElement(By.xpath("")).sendKeys("");

	}

}
