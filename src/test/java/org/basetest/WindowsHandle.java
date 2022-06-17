package org.basetest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.pom.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandle extends BaseClass {
	static Robot r;
	
	public static void main(String[] args) throws AWTException {
	
		BaseClass b = new BaseClass();
		b.browserLaunch();
		b.launchURL("https://www.amazon.in/");
		b.findLocator("id", "twotabsearchtextbox").sendKeys("samsung s22 ultra");
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
//		b.findLocator("xpath", "//div[@data-asin='B09SZSKMF7']//child::a[@class='a-link-normal']").click();
		b.findLocator("xpath", "(//span[@class='a-size-medium a-color-base a-text-normal'])[2]").click();
		Set<String> w1 = driver.getWindowHandles();
		
		
		List<String> li = new ArrayList<>(w1);
		
		driver.switchTo().window(li.get(1));
		b.findLocator("xpath", "//input[@id='add-to-cart-button']").click();
		driver.switchTo().window(li.get(0));
		
//		b.findLocator("xpath", "//div[@data-asin=\"B09JP5NCMP\"]//child::span[@class='rush-component']");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebElement btnclick = driver.findElement(By.xpath("//span[contains(text(),'Without Offer')]"));
		executor.executeScript("arguments[0].click()", btnclick);
		
 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
