package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Download and set the path 
		WebDriverManager.chromedriver().setup();
		
		//Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		//Maximise the window
		driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on Create New Account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		//Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Subashini");
		
		//Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dinesh");
		
		//Enter the mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("subashnis@yahoo.com");
		
		//Enter the password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Test@1920");
		
		//Handle all the three drop downs
		WebElement findElement1 = driver.findElement(By.id("day"));
		
		Select day = new Select(findElement1);
		day.selectByValue("6");
		
		WebElement findElement2 = driver.findElement(By.id("month"));
		
		Select month = new Select(findElement2);
		month.selectByValue("1");
		
		WebElement findElement3 = driver.findElement(By.id("year"));
		
		Select year = new Select(findElement3);
		year.selectByValue("1979");
		
		//Select the radio button "Female" 
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		
		

	}

}
