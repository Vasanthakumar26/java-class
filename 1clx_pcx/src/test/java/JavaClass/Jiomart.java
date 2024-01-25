package JavaClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Jiomart {
	
	 public static WebDriver driver;
	  public static void main(String[] args) throws InterruptedException {
		       // System.setProperty("webdriver.http.factory", "jdk-http-client");
		        WebDriverManager.chromedriver().setup();
		        driver =new ChromeDriver();
		        driver.get("https://seller.jiomart.com/cat/catalog#!/manage_manufacturers");
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        driver.manage().window().maximize();
		        //Username & password
		        WebElement userName = driver.findElement(By.xpath("//input[@id='user_user_id']"));
		        userName.sendKeys("sakthifruits");
		        WebElement password = driver.findElement(By.xpath("//input[@id='user_password']"));
		        password.sendKeys("Jio@1234");
		        Thread.sleep(20000);
		        WebElement submit = driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/input[1]"));
		        submit.click();
		        // Product table
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        WebElement product= driver.findElement(By.xpath("//a[text()='Products']"));
		        product.click();
		        WebElement manufacture = driver.findElement(By.xpath("//a[contains(text(),'Manufacturers')]"));
		        manufacture.click();
		       //All data
		        Thread.sleep(2000);
		        WebElement lastOne = driver.findElement(By.xpath("(//a[@class='ng-binding'])[13]"));
		        lastOne.click();
		        Thread.sleep(3000);
		        List<WebElement> datas = driver.findElements(By.xpath("//table/tbody/tr/td"));
		        for (WebElement webElement : datas) {
		            System.out.println(webElement.getText());
		            }
		        //Next
		        while (true) {
		            WebElement previous = driver.findElement(By.xpath("//a[contains(text(),'Previous')]"));
		            previous.click();
		            Thread.sleep(5000);
		            if (previous.isEnabled()) {
		                previous.click();
		                Thread.sleep(5000);
		                    List<WebElement> data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		                    for (WebElement webElements : data) {
		                        System.out.println(webElements.getText());
		                       
		                    }} 
		                        
		                }}
		            

		        }
		            
		            
		    
	


