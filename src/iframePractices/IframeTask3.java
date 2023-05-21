package iframePractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IframeTask3 {

	public static void main(String[]args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver update\\chromedriver_win32 (2)\\chromedriver.exe");	
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	WebDriver d=new ChromeDriver(option);
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	d.switchTo().frame("iframeResult");		// by Name
	WebElement outerframe = d.findElement(By.xpath("//p[text()='You can use the height and width attributes to specify the size of the iframe:']"));
	String txt_outerframe = outerframe.getText();	// use of getText Method
	System.out.println(txt_outerframe);
	Thread.sleep(2000);
	WebElement innerFrame = d.findElement(By.xpath("//iframe[@src='demo_iframe.htm']"));
	d.switchTo().frame(innerFrame);	// by WebElement
	Thread.sleep(2000);
	WebElement txt_innerframe = d.findElement(By.xpath("//h1"));
	String txt_innerIframe = txt_innerframe.getText();	// use of getText Method
	System.out.println(txt_innerIframe);
	Thread.sleep(2000);
	d.quit();
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
