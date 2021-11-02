package Homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.Gecko.driver","C:\\Users\\gouri\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver= (WebDriver) new GeckoDriverInfo();
		driver.get("https://www.amazon.com/");

	}

}
