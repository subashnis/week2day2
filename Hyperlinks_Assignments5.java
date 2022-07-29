package week2.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlinks_Assignments5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();

		String attribute = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href");
		System.out.println(attribute);
		
		driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
		
		String text = driver.findElement(By.xpath("//h1[text()='404 Not Found']")).getText();
		if (text.contains("404")) {
			System.out.println("broken");
		}
		
		driver.get("http://leafground.com/pages/Link.html");
		
		String attribute1 = driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[1]")).getAttribute("href");
		String attribute2 = driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).getAttribute("href");
		if (attribute1.equalsIgnoreCase(attribute2)) {
			System.out.println("similar link");
		}
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println(size);
		
		
		
	}
	
}
