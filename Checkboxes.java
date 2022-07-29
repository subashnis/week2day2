package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//label[@for='java']/following::input[1]")).click();
		driver.findElement(By.xpath("//label[@for='java']/following::input[3]")).click();
		
		boolean selected = driver.findElement(By.xpath("//label[@for='java']/following::input[6]")).isSelected();
		if (selected) {
			System.out.println("checkbox is selected");
		}
		
		//boolean selected2 = driver.findElement(By.xpath("//label[@for='java']/following::input[1]")).isSelected();
		//boolean selected3 = driver.findElement(By.xpath("//label[@for='java']/following::input[2]")).isSelected();
		//if (selected3) {
			//driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input[1]")).click();
			driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input[2]")).click();
		//}
			
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[1]")).click();	

		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[2]")).click();

		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[3]")).click();
		

		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[4]")).click();

		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[5]")).click();

		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[6]")).click();
	}

}
