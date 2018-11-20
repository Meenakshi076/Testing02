package ORANGEHRM;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fb {

	

	public static void main(String[] args) throws Exception {

		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("meenakshi076@gmail.com");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("./screenshot/facebook.png"));
		System.out.println("screenshot captured");
		
		driver.quit();
		
//		Dimension values=driver.findElement(By.xpath(".//*[@id='email']")).getSize();
//	System.out.println("values" + values);
		
//		int width=driver.findElement(By.xpath(".//*[@id='email']")).getSize().getWidth();
//		System.out.println("width:" + width);
//		int height=driver.findElement(By.xpath(".//*[@id='email']")).getSize().getHeight();
//		System.out.println("height" + height);
//		

	}

}
