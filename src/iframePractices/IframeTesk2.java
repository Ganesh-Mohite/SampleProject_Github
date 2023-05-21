package iframePractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IframeTesk2 {

	public static void main(String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver update\\chromedriver_win32 (2)\\chromedriver.exe");	
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	WebDriver d=new ChromeDriver(option);
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.get("https://demo.automationtesting.in/Frames.html");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement Btn_iframe2 = d.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		Btn_iframe2.click();
		Thread.sleep(2000);
		WebElement outerIframe = d.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		d.switchTo().frame(outerIframe);	// by WebElement
		Thread.sleep(2000);
		WebElement innerFrame = d.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		d.switchTo().frame(innerFrame);		// by WebElement
		Thread.sleep(2000);
		WebElement textbox = d.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("QA Tester");
		Thread.sleep(2000);
		d.quit();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
