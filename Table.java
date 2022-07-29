package week2.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> table = driver.findElements(By.xpath("//th"));
		int col = table.size();
		System.out.println("No: of columns " + col);
		
		List<WebElement> table1 = driver.findElements(By.xpath("//tr"));
		int row = table1.size();
		System.out.println("No: of columns " + row);
		
		String text = driver.findElement(By.xpath("//font[contains(text(),'Learn to interact')][1]/following::td[1]")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//font[contains(text(),'Learn to interact')]/following::font[contains(text(),'30%')]/following::input[1]")).click();
		
	}

}
