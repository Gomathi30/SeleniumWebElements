package Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Session6AssgnmtBasic {

	public static WebDriver driver=new ChromeDriver();

	public static void search()
	{
		WebElement search=driver.findElement(By.id("search_query_top"));
		search.clear();
		search.sendKeys("Summer dress");

		WebElement submit=driver.findElement(By.name("submit_search"));
		submit.click();
		driver.manage().window().maximize();
	}

	public static void MouseOver()
	{
		WebElement ele = driver.findElement(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']"));

		//Creating object of an Actions class
		Actions action = new Actions(driver);
		//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
	}

	public static void AddToCart()
	{
		WebElement addToCart= driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=5&token=e817bb0705dd58da8db074c69f729fd8']"));
		addToCart.click();
	}

	public static void ProceedToCheckout() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Proceed to checkout")));

		//WebElement proceedToCheckout= driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium' and @href='http://automationpractice.com/index.php?controller=order']"));	
		WebElement proceedToCheckout= driver.findElement(By.linkText("Proceed to checkout"));
		proceedToCheckout.click();
	}

	public static void CreateAccount()
	{
		WebElement createEmail= driver.findElement(By.id("email_create"));
		createEmail.sendKeys("abcdef@abc.com");
		WebElement submitCreate= driver.findElement(By.id("SubmitCreate"));//button[@id='SubmitCreate']
		submitCreate.click();

	}

	public static void Address()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@class='address_add submit']/a[@href='http://automationpractice.com/index.php?controller=address&back=order.php%3Fstep%3D1']")));//xpath("//p[@class='submit']")));

		WebElement newAddress= driver.findElement(By.xpath("//p[@class='address_add submit']/a[@href='http://automationpractice.com/index.php?controller=address&back=order.php%3Fstep%3D1']"));
		newAddress.click();

		//wait = new WebDriverWait(driver, 20);

		WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("firstname")));//xpath("//p[@class='submit']")));
		WebElement firstName= driver.findElement(By.id("firstname"));
		firstName.sendKeys("abc");

		WebElement lastName= driver.findElement(By.id("lastname"));
		lastName.sendKeys("def"); 

		WebElement address= driver.findElement(By.id("address1"));
		address.sendKeys("123 abc");

		WebElement city= driver.findElement(By.id("city"));
		city.sendKeys("salem");

		Select state= new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Alabama");

		WebElement zip= driver.findElement(By.id("postcode"));
		zip.sendKeys("04321");

		Select country= new Select(driver.findElement(By.id("id_country")));
		country.selectByIndex(0);

		WebElement phone= driver.findElement(By.id("phone"));
		phone.sendKeys("3234567890");

		WebElement mobPhone= driver.findElement(By.id("phone_mobile"));
		mobPhone.sendKeys("2234567890");

		WebElement alias= driver.findElement(By.id("alias"));
		alias.clear();

		alias.sendKeys("addr2");		

		WebElement save= driver.findElement(By.id("submitAddress"));
		save.click();
	}	

	public static void SignIn()
	{
		WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("abcdef@abc.com");
		WebElement password= driver.findElement(By.xpath("//input[@id='passwd']"));

		password.sendKeys("abcdef");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitLogin")));//xpath("//p[@class='submit']")));

		WebElement signIn=driver.findElement(By.id("SubmitLogin"));
		signIn.click();

	}
	public static void ProceedToCheckoutAddress()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.name("processAddress")));

		WebElement addchkout=driver.findElement(By.name("processAddress"));
		addchkout.click();
	}
	
	public static void Shipping()
	{
		WebElement checkBox= driver.findElement(By.id("cgv"));
		checkBox.click();
		//ProceedToCheckout();
		WebElement addchkout=driver.findElement(By.name("processCarrier"));
		addchkout.click();
	}
	
	public static void Payment()
	{
		WebElement pay= driver.findElement(By.className("bankwire"));
		pay.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@id='cart_navigation']/button")));

		WebElement confirm= driver.findElement(By.xpath("//p[@id='cart_navigation']/button"));
		confirm.click();
	}
	
	public static void main(String[] args)  {

		driver.get("http://automationpractice.com/index.php");
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		search();


		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");

		/* mouse over code for Women webelement
			WebElement dress=driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category']"));
			actions.moveToElement(dress).perform();
		 */

		//code to mouse over the first summer dress displayed

		MouseOver();
		AddToCart();
		ProceedToCheckout();
		ProceedToCheckout();
		SignIn();
		//Address();
		ProceedToCheckoutAddress();
		Shipping();
		Payment();

	}

}
