package Playsmartbabe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int x= 231;
		String b="";
		int a;
		
		while(x>0)
		{
			
			
			a=x%2;
			
			b= b+""+a;
			x=x/2;
			
		}
		
		
	System.out.println("the binary number is :"+b);	
WebDriver driver = new FirefoxDriver();

//Actions att= new Actions(driver);
//
//att.dragAndDrop(source, target);



	}

}
