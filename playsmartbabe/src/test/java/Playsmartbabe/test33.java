package Playsmartbabe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try{
			
			
			System.out.println("this is in try");
		}catch (ElementNotVisibleException e) {
			System.out.println("this is first catch");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
		}
		catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
		}
	
		
		
		WebDriver driver= new ChromeDriver();
		
		WebElement el = driver.findElement(By.className(""));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait= new WebDriverWait(driver,10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		
		
		
//		FluentWait<T> waiter = new FluentWait<T>(input);
		
		Wait w = new FluentWait<WebDriver>(driver).withTimeout(11, TimeUnit.SECONDS).pollingEvery(6,TimeUnit.SECONDS).ignoring(ElementNotVisibleException.class);
		
		
		
		

		
		
		
		
		
		

	}

}
