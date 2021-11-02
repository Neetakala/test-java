package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gouri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		/*WebElement um=driver.findElement(By.id("email"));
		um.sendKeys("a1@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("test");
		driver.findElement(By.name("login")).click();
		 String title =driver.getTitle();
		 System.out.println("title is: " + title);
		 System.out.println(driver.getCurrentUrl());*/
		//driver.navigate();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.id("email")));
		WebElement urn=driver.findElement(By.id("email"));
		System.out.println(urn.getAttribute("id"));
		System.out.println(driver.getClass());
		
		 
		driver.quit();
	}
	
}
