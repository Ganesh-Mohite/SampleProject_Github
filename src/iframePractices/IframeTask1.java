package iframePractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IframeTask1 {

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver update\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver d=new ChromeDriver(option);
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		d.switchTo().frame("packageListFrame");	// by name
		Thread.sleep(2000);
		WebElement frame1 = d.findElement(By.xpath("//a[text()='org.openqa.selenium']"));
		frame1.click();
		Thread.sleep(2000);
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		d.switchTo().frame(1);	// by Index---index starts with 0,1,2,3....
		Thread.sleep(2000);
		WebElement frame2 = d.findElement(By.xpath("//span[text()='JavascriptExecutor']"));
		frame2.click();
		Thread.sleep(2000);
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement frame3 = d.findElement(By.xpath("//iframe[@class='rightIframe']"));
		d.switchTo().frame(frame3);	// by WebElement
		Thread.sleep(2000);
		WebElement link_help = d.findElement(By.xpath("(//a[text()='Help'])[1]"));
		link_help.click();
		Thread.sleep(2000);
		WebElement txtbox_search = d.findElement(By.xpath("//input[@id='search']"));
		txtbox_search.sendKeys("Automation Tester");
		Thread.sleep(2000);
		d.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
