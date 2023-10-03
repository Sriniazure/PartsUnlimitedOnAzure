package com.pom.basepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class LoginPage 
{
	
	public static WebDriver driver ;
	@BeforeMethod
    public static void firstmethod(){
    
        System.out.println( "Hello World!" );
        String path = System.getProperty("user.dir");
        System.out.println(path);
         
      System.setProperty("webdriver.chrome.driver",path+"\\src\\test\\executables\\chromedriver.exe");
      driver = new ChromeDriver();	
  //   WebDriver driver = new ChromeDriver(); 
       driver.manage().window().maximize();
       driver.get("https://pulterraformweb2ba39e77.azurewebsites.net/");

        }
	@AfterMethod
	  public  void driverquit() {
		  
    	driver.quit();
    	System.out.println("Method executed from BaseClass : driver quit is complete");

  }
}
