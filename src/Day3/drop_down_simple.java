package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down_simple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 
		
		driver.get("https://www.amazon.com/");
		
		/*driver.findElement(By.xpath("//select[@id='searchLanguage']")).sendKeys("Català");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@id='searchLanguage']")).sendKeys("English");*/
		
		Select select=new Select (driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']")));
        Thread.sleep(2000);
        select.selectByVisibleText("Deals");
        Thread.sleep(2000);
        select.selectByIndex(1);
        Thread.sleep(2000);
        select.selectByValue("search-alias=electronics-intl-ship");

	}

}
