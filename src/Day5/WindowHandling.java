package Day5;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        
        String parentwindow=driver.getWindowHandle();
        
        Set<String> window= driver.getWindowHandles();
        
        Iterator itr=window.iterator();
        
        while(itr.hasNext())
        {
            String childwindow=itr.next();
            
            if(!parentwindow.equalsIgnoreCase(childwindow))
            {
                driver.switchTo().window(childwindow);
                System.out.println("Text of the child window is ---- " + driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
            }
            
            Thread.sleep(2000);
            
        }

	}

}
