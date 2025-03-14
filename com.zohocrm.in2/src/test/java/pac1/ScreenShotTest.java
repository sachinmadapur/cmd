package pac1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotTest {
		@Test
		public void amazonTest() throws IOException {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			//createan object to Eventfiring webdriver
			TakesScreenshot t=(TakesScreenshot)driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File desc=new File("./screenshot/ss.png");
			FileUtils.copyFile(src, desc);
		}

}
