package Package;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice/");
		String windowId= driver.getWindowHandle();
		String title= driver.getTitle();
		System.out.println("WindowID"+windowId);
		System.out.println("Title" + title);
		WebElement link = driver.findElement(By.linkText("Click Me to open New Window"));
		link.click();
		Set <String> handles =driver.getWindowHandles();
		System.out.println("NO od windows opened is " +handles.size());
		String newWindowId=null;
		for(String wind : handles)
		{
			if(!wind.equalsIgnoreCase(windowId) )
			{
				newWindowId = wind;
				break;
			}	
			
				
		}
		driver.switchTo().window(newWindowId);
		System.out.println("NewWindowTitle"+ driver.getTitle());
		
		WebElement thirdWindowLink= driver.findElement(By.linkText("Click Me To Open Third Window"));
		thirdWindowLink.click();
		 handles =driver.getWindowHandles();
		System.out.println("NO od windows opened is " +handles.size());
		 newWindowId=null;
		for(String wind : handles)
		{
			driver.switchTo().window(wind);
			if(driver.getTitle().contains("3rd Window"))
				break;
				
		}
		System.out.println(driver.getTitle());
		}
		
		
	}


