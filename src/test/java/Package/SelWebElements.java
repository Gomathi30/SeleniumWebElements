package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions  chromeoptions= new ChromeOptions();
		chromeoptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebElement firstName,lastName,gender,language,age;
		//driver.get("www.google.com");
		
		driver.get("http://www.lms-ui.com");
		driver.get("https://cosmocode.io/automation-practice/");
		
		//firstName = driver.findElement(By.id("firstname"));
		firstName = driver.findElement(By.xpath("//input[@id='firstname']"));
		firstName.clear();
		firstName.sendKeys("Gomathi");
		
		
		
		//lastName = driver.findElement(By.className("lastname"));
		lastName = driver.findElement(By.xpath("//input[@class='lastname']"));
		lastName.clear();
		lastName.sendKeys("Kand");
		
		gender= driver.findElement(By.xpath("//input[@value='Male']"));
		gender.click();
		
		language=driver.findElement(By.name("language_java"));
		language.click();
		
		//age=driver.findElement(By.name("age"));
		//age.click();
		//System.out.println("before close");
		//driver.close();
		System.out.println("before quit");
		driver.quit();
				
		
	}

}
