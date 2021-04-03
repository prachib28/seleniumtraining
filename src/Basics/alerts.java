package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		 driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	        Thread.sleep(2000);
	        driver.switchTo().alert().accept();
	        
	        driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	        Thread.sleep(2000);
	        driver.switchTo().alert().dismiss();
	        
	        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	        Thread.sleep(2000);
	        driver.switchTo().alert().sendKeys("Hello");
	        
	        driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	        WebDriverWait wait=new WebDriverWait(driver,20);
	        wait.until(ExpectedConditions.alertIsPresent());
	        Thread.sleep(2000);
	        driver.switchTo().alert().accept();

	}

}
