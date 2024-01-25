package stepDefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PcxloginPage {
	
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
		
    	WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://dev.1clxlite.com/login");
	    driver.manage().window().maximize();
	
	    WebElement  sign= driver.findElement(By.xpath("(//a[@id='signIn'])[1]"));
	    sign.click(); 
	     
	}
	@When("the user enters valid {string} and {string}")
	public void the_user_enters_valid_and(String string, String string2) throws InterruptedException 
	{	
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(string);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='signin_password']"));
		password.sendKeys(string2);
	   
	}
	@When("clicks on the login button")
	public void clicks_on_the_login_button() throws InterruptedException 
	{	
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("(//button[@class='text-white bg1 mt-3 border rounded-2 p-2 w-100'])[2]"));
        submit.click();
        
	}
	@Then("the user should be navigated to home page")
	public void the_user_should_be_navigated_to_home_page() throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement Profile = driver.findElement(By.xpath("//div[@class='navbar navbar-dark']"));
		Profile.click();
	
	}
	@When("user click on profile link")
	public void user_click_on_profile_link() throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement clk = driver.findElement(By.xpath("(//span[@class='fs-6 text-black'])[1]"));
		clk.click();
	 
	}
	@When("user click on details update")
	public void user_click_on_details_update() throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement  update1= driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		update1.click();
		
		Thread.sleep(2000);
		WebElement sucessfully1 = driver.findElement(By.xpath("(//button[@class='swal2-confirm swal2-styled'])[1]"));
		sucessfully1.click();
	}

	@When("user change the profile")
	public void user_change_the_profile() throws AWTException, InterruptedException 
	{
	   
		WebElement profileclk = driver.findElement(By.xpath("//label[@title='Change Profile']"));
		profileclk.click();
		
		Thread.sleep(2000);
		 // creating object of Robot class
	    Robot rb = new Robot();
	 
	    // copying File path to Clipboard
	    StringSelection str = new StringSelection("C:\\Users\\Vasanthakumar\\Downloads\\images.png");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     //press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	     // release Contol+V for pasting
	     rb.keyRelease(KeyEvent.VK_CONTROL);
	     rb.keyRelease(KeyEvent.VK_V);
	 
	     // for pressing and releasing Enter
	     rb.keyPress(KeyEvent.VK_ENTER);
	     rb.keyRelease(KeyEvent.VK_ENTER);
	    
	     Thread.sleep(2000);
	     WebElement uploadprofile = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
	     uploadprofile.click();	
	}
	@When("user enters password {string} and {string} and {string}")
	public void user_enters_password_and_and(String string, String string2, String string3) throws InterruptedException 
	
	{   
		Thread.sleep(2000);
		WebElement oldpassword = driver.findElement(By.xpath("(//input[@name='old_password'])"));
		oldpassword.sendKeys(string);
		
		Thread.sleep(2000);
		WebElement newpassword = driver.findElement(By.xpath("(//input[@name='password'])"));
		newpassword.sendKeys(string2);
		
		Thread.sleep(2000);
		WebElement conpassword = driver.findElement(By.xpath("(//input[@name='password_confirmation'])"));
		conpassword.sendKeys(string3);	
		
	}
	@When("user click on password update button")
	public void user_click_on_password_update_button() throws InterruptedException 
	{
		Thread.sleep(2000);		
		WebElement update2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		//Thread.sleep(2000);	
		//js.executeScript("arguments[0].scrollIntoView()", update2); 
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",update2);
		
		//js.executeScript("arguments[0].click();",update2);
		//update2.click();
		
		Thread.sleep(2000);
		WebElement sucessfully2 = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		sucessfully2.click();
	  
	}
	@When("user enters razorpay id {string} and {string}")
	public void user_enters_razorpay_id_and(String string, String string2) throws InterruptedException 
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,800)", "");
		
		Thread.sleep(2000);
		WebElement keyid = driver.findElement(By.xpath("//input[@name='key_id']"));
		keyid.clear();
		keyid.sendKeys(string);
		
		WebElement secret_id = driver.findElement(By.xpath("//input[@name='secret_id']"));
		secret_id.clear();
		secret_id.sendKeys(string2);
	}	

	@When("User clicks on razorpay update")
	public void user_clicks_on_razorpay_update() throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement update3 = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		update3.click();
		
		Thread.sleep(2000);
		WebElement sucessfully3 = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		sucessfully3.click();
	   
	}

	@When("user select the sell type")
	public void user_select_the_sell_type() throws InterruptedException 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
		Thread.sleep(2000);
		WebElement selltype = driver.findElement(By.xpath("//input[@name='products']"));
		selltype.click();
		
		WebElement update4 = driver.findElement(By.xpath("(//button[@type='submit'])[4]"));
		update4.click();
		
		Thread.sleep(2000);
		WebElement sucessfully4 = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		sucessfully4.click();		
	}
	
	@When("user enters gstin number {string}")
	public void user_enters_gstin_number(String string) throws InterruptedException
	{
		
		Thread.sleep(2000);
		WebElement gstno = driver.findElement(By.xpath("//input[@name='gst_no']"));
		gstno.clear();
		gstno.sendKeys(string);
	}	    
	@Then("user clicks on GSTIN number update")
	public void user_clicks_on_gstin_number_update() throws InterruptedException 
	{
		Thread.sleep(2000);
		WebElement update5 = driver.findElement(By.xpath("(//button[@type='submit'])[5]"));
		update5.click();
		
		Thread.sleep(2000);
		WebElement sucessfully5 = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		sucessfully5.click();
	}
		


}
