package Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com/slider");
        
        driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]")).
        
        //div[@id='slider']/span
        Actions obj = new Actions(driver);
        obj.dragAndDrop(driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]")) , driver.findElement(By.xpath("//p[contains(text(),'//p[contains(text(),'Drop here')]')]"))).build().perform();
       
	}

}
