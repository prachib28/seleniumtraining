package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 
		
		driver.get("https://demoqa.com/upload-download");
        driver.findElement(By.xpath("//a[@id='downloadButton']")).click();
        driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\New folder\\hellow.txt");
	}

}
