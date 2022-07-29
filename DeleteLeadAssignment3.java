package week2.day2;

import java.time.Duration;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Setup the chromedriver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Open Leaftaps
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximise the browser
		driver.manage().window().maximize();
		
		//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		//Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		
		//Click on the Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Capture lead ID of First Resulting lead
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		String text2 = findElement.getText();
		
		//Click on the first resulting Lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		//Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//Click Find LEads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text2);
		
		//Click on Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		boolean displayed = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
		if (displayed) {
			System.out.println("This message confirms the successful deletion");
			
		}
		
		//Close the browser (Do not log out)
		driver.close();
		
	}

}
