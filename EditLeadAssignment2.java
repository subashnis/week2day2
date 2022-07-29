package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadAssignment2 {

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
		
		//Click on first resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		//Verify title of the page
		String title = driver.getTitle();
		if (title.contains("View Lead")) {
			System.out.println("View Lead page displayed");
		}
		
		//Click on the Edit button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		// CLear the company name and enter new company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Shobi");
				
		// Click on the Update button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Confirm the changed name appears
		String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if (text.contains("Shobi")) {
			System.out.println("Company Name has been updated");
		} else
			System.out.println("Company name not updated");
		
		//Close the browser (Do not log out)
		driver.close();
		
	}

}
