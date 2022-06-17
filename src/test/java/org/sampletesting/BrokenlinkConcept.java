package org.sampletesting;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenlinkConcept {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		int brokenCount = 0;
		for (int i = 0; i < allLinks.size(); i++) {
			WebElement ele = allLinks.get(i);
			String attribute = ele.getAttribute("href");
			URL url = new URL(attribute);
			URLConnection openConnection = url.openConnection();
			HttpsURLConnection connection = (HttpsURLConnection) openConnection;
			int code = connection.getResponseCode();
			if (code != 200) {
				brokenCount++;
				System.out.println("Broken Links are : " + attribute);
			}
		}
		System.out.println("Total Broken Links: " + brokenCount);
	}

}
