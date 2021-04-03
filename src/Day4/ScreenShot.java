package Day4;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("https://www.oracle.com/database/technologies/appdev/jdbc-ucp-19-10-c-downloads.html");
		
		   TakesScreenshot ss_taker=(TakesScreenshot)driver;
	        
	        File ss_selenium= ss_taker.getScreenshotAs(OutputType.FILE);
	        String suffix=LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd_mm_yyyy_hh_mm_ss"));
	        
	        File ss_output_file=new File ("output_screenshots\\ss_selenium"+suffix+".png");
	        File ss_output_file=new File ("C:\\New folder\\ss_selenium"+suffix+".png");
	        
	        com.google.common.io.Files.copy(ss_selenium, ss_output_file);

	}

}
