package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/radio-button");
        driver.findElement(By.xpath("//label[contains(text(),'Impressive')]")).click();
        
        Thread.sleep(2000);
        WebElement element =driver.findElement(By.xpath("//label[contains(text(),'Yes')]"));
        WebElement Button_ele=driver.findElement(By.xpath("//input[@id='yesRadio']"));
        element.click();
    
        if (Button_ele.isSelected())
        {
            System.out.println("Radion Button is selected");
        }
        else
        {
            System.out.println("Radion Button is not selected");
        }
		
	        

	}

}
