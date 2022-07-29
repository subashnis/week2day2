package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images_Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		
		driver.findElement(By.xpath("//h5[text()='Image']")).click();
		
		
	//String attribute = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute(null);
//		System.out.println(width);
//		if (width==0) {
//			System.out.println("Image is broken");
//		}
//		
//		/*
//		boolean enabled = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).isEnabled();
//		if (enabled) {
//			System.out.println("enabled");
//		} else
//			System.out.println("broken"); 
//		*/
		
		//WebElement brokenimage = driver.findElement(By.xpath("(//div[contains(@class,'large-6')])[2]/img"));
	//	System.out.println(brokenimage.getAttribute("naturalwidth"));
		WebElement brokenImg = driver.findElement(By.xpath("//label[@for='home']/following::img[2]"));
//		if(brokenimage.getAttribute("naturalwidth").equals("0")) {
//			System.out.println("image broken");
//		}else {
//			System.out.println("image not broken");
//		}
		if (brokenImg.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Broken Image");
		} else {
			System.out.println("Not an Broken Image");
		}
		
		Actions a = new Actions(driver);
		
		WebElement findElement = driver.findElement(By.xpath("//label[@for='home']/following::img[3]"));
		a.click(findElement).perform();
		
		
		
	}

}
