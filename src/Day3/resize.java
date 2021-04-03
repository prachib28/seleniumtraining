package Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class resize {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://jqueryui.com/droppable/");
		driver.get("https://jqueryui.com/resizable/");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
      
		
		Actions obj=new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement rezize_button=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		obj.clickAndHold(rezize_button).moveByOffset(10,15).release().build().perform();
	}

}
