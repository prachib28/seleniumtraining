package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        WebElement ele=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        System.out.println("Text is ==== " +ele.getText());
        
        driver.switchTo().defaultContent();
        
        driver.switchTo().frame("frame2");
        WebElement ele2=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
        System.out.println("Text is ==== " +ele2.getText());

	}

}
