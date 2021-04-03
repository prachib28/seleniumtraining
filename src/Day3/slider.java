package Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		
        
        
        System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/slider");
        
        //div[@id='slider']/span
        
       
		Actions obj=new Actions(driver);
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        obj.dragAndDropBy(driver.findElement(By.xpath("//div[@id='slider']/span")), 80, 0).build().perform();
		

	}

}
