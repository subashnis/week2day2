package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Select se = new Select(driver.findElement(By.id("dropdown1")));
		se.selectByIndex(2);
		
		Select se1 = new Select(driver.findElement(By.name("dropdown2")));
		se1.selectByVisibleText("Selenium");
		
		Select se2 = new Select(driver.findElement(By.id("dropdown3")));
		se2.selectByValue("2");		
		//List<WebElement> options = se2.getOptions();
		
		Select se3 = new Select(driver.findElement(By.className("dropdown")));
		List<WebElement> options2 = se3.getOptions();
		System.out.println(options2.size());
		
		driver.findElement(By.xpath("//div[@class='example'][5]/select")).click();
		driver.findElement(By.xpath("//div[@class='example'][5]/select")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[@class='example'][5]/select")).sendKeys(Keys.ENTER);
		
		Select se4 = new Select(driver.findElement(By.xpath("//div[@class='example'][6]/select")));
		se4.selectByIndex(1);
		se4.selectByIndex(4);
		
	}

}
