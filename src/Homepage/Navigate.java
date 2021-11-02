package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gouri\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(1000);
		
		System.out.println("done back...");
		driver.navigate().forward();
		Thread.sleep(1000);
		System.out.println("forward done");
		driver.navigate().refresh();
		driver.close();

	}

}
