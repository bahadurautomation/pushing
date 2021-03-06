/**
 * 
 */
/**
 * @author goodwell
 *
 */
package com.qa.abhibus.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class TestBase{
	
	public static WebDriver driver;
	public static Properties prop;
	public TestBase(){
		try{
			prop=new Properties();
			FileInputStream ip= new FileInputStream("D:\\practice selenium\\Abhibus\\src\\main\\java\\com\\qa\\abhibus\\cofig\\configration.properties");
			prop.load(ip);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void initialization(){
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","D:\\practice selenium\\Abhibus\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		if(browsername.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "D:\\practice selenium\\Abhibus\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		if(browsername.equals("IE")){
			System.setProperty("webdriver.ie.driver", "D:\\practice selenium\\Abhibus\\Drivers\\ieinstal.exe");
			driver=new InternetExplorerDriver();
			
			}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	}
}




