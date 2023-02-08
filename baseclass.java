package source_sports;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.log4testng.Logger;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import source_sports.baseclass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {

	
		
			
				public static WebDriver driver;	
				protected static ExtentTest test;
			    protected static ExtentReports report;
			    static final Logger log = Logger.getLogger(baseclass.class);
			     
			     
			     
				@BeforeTest
			    public static void startTest()
			    
			    {
					
				String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			    report = new ExtentReports(System.getProperty("user.dir")+ "/RecentExecutionReports/"+ dateName + "\\Satbet_Sports_Automation_Report_Desktop_2411.html");
			    
			    }
				
				
				
				public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
					
	                //below line is just to append the date format with the screenshot name to avoid duplicate names
	                String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	                TakesScreenshot ts = (TakesScreenshot) driver;
	                File source = ts.getScreenshotAs(OutputType.FILE);
	                //after execution, you could see a folder "FailedTestsScreenshots" under src folder
	                String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+"qwerty.png";
	                File finalDestination = new File(destination);
	                FileUtils.copyFile(source, finalDestination);
	                //Returns the captured file path
	                return destination;
				}
				
				public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

			        //Convert web driver object to TakeScreenshot

			        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

			        //Call getScreenshotAs method to create image file

			                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

			            //Move image file to new destination

			                File DestFile=new File(fileWithPath);

			                //Copy file at destination

			                FileUtils.copyFile(SrcFile, DestFile);

			    }
				
				public static String capture(WebDriver driver) throws IOException {
					
					String base64Screenshot  = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
					return "data:image/jpg;base64, " + base64Screenshot  ;
						
				}
				
				
				public static void invoke() throws Throwable
				{
					
					try 
						{
						
						ChromeOptions options = new ChromeOptions();
						options.addArguments("--disable-notifications");  
						options.setExperimentalOption("useAutomationExtension", false);
						options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
						System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
						WebDriverManager.chromedriver().setup();
						Thread.sleep(5000);
						driver = new ChromeDriver(options);
						System.out.println("Browser is launched !");
						driver.manage().window().maximize();
						System.out.println("Url is passed!");
						driver.get("https://www.satbet.com/");
						Thread.sleep(3000);
						
						}
					catch (Exception e) 
					
					    {
							e.getMessage();
					    }
				}
				
				
				
				
				
				@AfterTest
				
				
				
		        public static void endTest()
		        {
					
		        report.endTest(test);
		        report.flush();
		        }
				
			     public static void reportLog(String message) 
			        {  
			    	 
			    	 	
			            test.log(LogStatus.INFO, message);//For extentTest HTML report
			            log.info("Message: " + message);
			            Reporter.log(message);
			            report.endTest(test);
				        report.flush();   
			    	 
			        }
			     
			     }