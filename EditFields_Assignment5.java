package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields_Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Edit.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("email")).sendKeys("subashini.kssn@gmail.com");
		
		String text = driver.findElement(By.xpath("//input[@value='Append ']")).getText();
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(text + "appendedtext", Keys.TAB);
		
		String text2 = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println(text2);
		
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		if (enabled) {
			System.out.println("enabled");
		} else System.out.println("disabled");
		
		
	}

}
