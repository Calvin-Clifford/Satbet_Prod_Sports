package Actions;

import org.openqa.selenium.By;
import java.io.FileInputStream;
import java.time.Duration;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import Pages.xpathpages;
import source_sports.baseclass;


public class gameavailabilityactions extends baseclass {
@Test

		
		public static void gameavailability() throws Throwable  {
			//public static WebDriver driver = null;
			
		baseclass.invoke();
			
			//For Excel Read
			
			FileInputStream fis = new FileInputStream("D:\\workspace\\SATBET_SPORTS_PROD\\SatbetSportsProdExcel.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			test = report.startTest("Live Games Availability / Place Bet / Insuff Balance / Max Bet");
			
			//Click Login for New User
			
			try {
			driver.findElement(xpathpages.loginbutton).click();
			System.out.println("Login Button is clicked for new User !");
			Thread.sleep(4000);
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty1.png") ;
			
			test.log(LogStatus.PASS,"Click Login Button", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty1.png'target=\\\"_blank\\  >Click Here</a>");
			}
			catch(Exception f1)
			{
				f1.getMessage();
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty1.png") ;
				
				test.log(LogStatus.FAIL,"Click Login Button", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty1.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
			
			//Enter User name
			
			try {
			Row row11 = sheet.getRow(1);
			Cell cell11 = row11.getCell(2);
			String cellval11 = cell11.getStringCellValue();
			driver.findElement(xpathpages.username).sendKeys(cellval11);
			Thread.sleep(4000);
			System.out.println("User name is Entered");
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty2.png") ;
			
			test.log(LogStatus.PASS,"Enter User name", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
			
			
			}
			
			catch(Exception f2)
			{
				System.out.println("Unable to Enter Username");
				f2.getMessage();
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty2.png") ;
				
				test.log(LogStatus.FAIL,"Enter User name", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
			
			//Enter Password
			
			try {
			Row row12 = sheet.getRow(2);
			Cell cell12 = row12.getCell(2);
			String cellval12 = cell12.getStringCellValue();
			driver.findElement(xpathpages.password).sendKeys(cellval12);
			Thread.sleep(2000);	
			System.out.println("Password is Entered");
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty3.png") ;
			
			test.log(LogStatus.PASS,"Enter Password", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty3.png'target=\\\"_blank\\  >Click Here</a>");	
			
			
			}
			catch(Exception f3)
			{
				f3.getMessage();
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty3.png") ;
				
				test.log(LogStatus.FAIL,"Enter Password", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty3.png'target=\\\"_blank\\  >Click Here</a>");	
				
			}
			
			
			//Click Submit
			
			try {
			driver.findElement(xpathpages.submit).click();
			System.out.println("Submit button is clicked !");
			Thread.sleep(7000);	
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty4.png") ;
			
			test.log(LogStatus.PASS,"Click Submit", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty4.png'target=\\\"_blank\\  >Click Here</a>");	
			}
			catch(Exception f4)
			{
				f4.getMessage();
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty4.png") ;
				
				test.log(LogStatus.FAIL,"Click Submit", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty4.png'target=\\\"_blank\\  >Click Here</a>");	
			}
			
			
			
			//Open Sportsbook page
			
			try {
			driver.findElement(xpathpages.sportsbookpage).click();
			System.out.println("Sportsbook is opened !");
			Thread.sleep(8000);
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty6.png") ;
			
			test.log(LogStatus.PASS,"Open Sportsbook page", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty6.png'target=\\\"_blank\\  >Click Here</a>");	
			}
			catch(Exception f6)
			{
				f6.getMessage();
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty6.png") ;
				
				test.log(LogStatus.FAIL,"Open Sportsbook page", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty6.png'target=\\\"_blank\\  >Click Here</a>");
				
			}
			
			
			
			//Navigating to Sports iFrame
			
			try {
			WebElement frameElement = driver.findElement(By.xpath("//*[@id=\"frameLeft\"]")); 
			//	driver.navigate().
				
				
					
					List<WebElement> elements = driver.findElements(By.tagName("iframe"));
					int numberOfTags = elements.size();
					System.out.println("No. of Iframes on this Web Page are: " + numberOfTags);
					
					System.out.println("Switching to the frame");
					if (frameElement.isDisplayed())
					{
					driver.switchTo().frame(frameElement);
					System.out.println("Navigated to frame with element "+ frameElement);
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty7.png") ;
					
					test.log(LogStatus.PASS,"Switch to Sports iFrame", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty7.png'target=\\\"_blank\\  >Click Here</a>");	
				} 
					else 
					{
					System.out.println("Unable to navigate to frame with element "+ frameElement);
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty7.png") ;
					
					test.log(LogStatus.FAIL,"Switch to Sports iFrame", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty7.png'target=\\\"_blank\\  >Click Here</a>");
				}	
					
			}
			catch(Exception f7)
			{
				f7.getMessage();
			}
			
			
			//Verify if Live Games are available
			
			try {
			WebElement verifyliveavailable = driver.findElement(By.className("sports_name1"));
		    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", verifyliveavailable);
			if(verifyliveavailable.isDisplayed()==true)
			{
				System.out.println(" Games available in Live now page");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty8.png") ;
				
				test.log(LogStatus.PASS,"Live Games Availability", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty8.png'target=\\\"_blank\\  >Click Here</a>");	
				Thread.sleep(5000);
			}
			else
			{
				System.out.println(" Games not available in Live now page");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty8.png") ;
				
				test.log(LogStatus.FAIL,"Live Games Availability", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty8.png'target=\\\"_blank\\  >Click Here</a>");	
			}
			}
			catch(Exception f8)
			{
				f8.getMessage();
			}
			
			/*
			//Zoom Page 
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_MINUS);
			*/
			
			
			FluentWait<WebDriver> wait = new FluentWait<WebDriver> (driver)
					.withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(30))
					.ignoring(Exception.class);
			
			
			//Place Bet in Live Game
			
			try {
			
			
			boolean odds1 = driver.findElement(xpathpages.odds1).isEnabled();
			//boolean odds2 = driver.findElement(xpathpages.odds2).isEnabled();
			//boolean odds3 = driver.findElement(xpathpages.odds3).isEnabled();
			
			if(odds1 == true)
			{
				System.out.println("Odds1 is not suspended !");
				driver.findElement(xpathpages.odds1).click();
				System.out.println("Clicked on Bet placing Button 1 !");
				Thread.sleep(2000);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty9.png") ;
				
				test.log(LogStatus.PASS,"Click to Bet - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty9.png'target=\\\"_blank\\  >Click Here</a>");
				
			}
			
			
			else
			{
				System.out.println("Odds1 and Odds2 are suspended, So clicking odds 3 !");
				driver.findElement(xpathpages.odds3).click();
				System.out.println("Clicked on Bet placing Button 3 !");
				Thread.sleep(2000);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty9.png") ;
				
				test.log(LogStatus.PASS,"Click to Bet - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty9.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
			
			}
			
			catch(Exception f9)
			{
				f9.getMessage();
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty9.png") ;
				
				test.log(LogStatus.FAIL,"Click to Bet - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty9.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
			
			
			//Enter Stake

			try {
			
			driver.findElement(xpathpages.stakeamount).click();
			System.out.println("Stake amount is entered !");
			Thread.sleep(1500);
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty10.png") ;
			
			
			test.log(LogStatus.PASS,"Enter Stake", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
			
			}
			catch(Exception f10)
			{
				System.out.println("Unable to Enter Stake amount");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty10.png") ;
				
				
				test.log(LogStatus.FAIL,"Enter Stake", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
			
			
			//Click Always allow odd changes
			
			try {
			driver.findElement(xpathpages.alwaysallowoddchange).click();
			System.out.println("Always allow odd changes is clicked !");
			Thread.sleep(4000);
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty11.png") ;
			
			
			test.log(LogStatus.PASS,"Click Always allow odd changes", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty11.png'target=\\\"_blank\\  >Click Here</a>");
			
			}
			catch(Exception f11)
			{
				System.out.println("Unable to Allow Odd Changes");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty11.png") ;
				
				
				test.log(LogStatus.FAIL,"Click Always allow odd changes", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty11.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
			//Click Submit to place bet
			
			try {
			driver.findElement(xpathpages.submitbet).click();
			System.out.println("Submit to place bet is clicked !");
			Thread.sleep(2000);
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty12.png") ;
			
			
			test.log(LogStatus.PASS,"Click Submit to place bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty12.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
			catch(Exception f12)
			{
				System.out.println("Unable to Click Submit !");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty12.png") ;
				
				
				test.log(LogStatus.FAIL,"Click Submit to place bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty12.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
			//Checking By Placing Bet - In-sufficient Balance
			
			//Place Bet in Live Game
			
			try {
				
				boolean odds1 = driver.findElement(xpathpages.odds1).isEnabled();
				//boolean odds2 = driver.findElement(xpathpages.odds2).isEnabled();
				//boolean odds3 = driver.findElement(xpathpages.odds3).isEnabled();
				
				if(odds1 == true)
				{
					System.out.println("Odds1 is not suspended !");
					driver.findElement(xpathpages.odds1).click();
					System.out.println("Clicked on Bet placing Button 1 !");
					Thread.sleep(2000);
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty13.png") ;
					
					test.log(LogStatus.PASS,"Click to Bet - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty13.png'target=\\\"_blank\\  >Click Here</a>");
					
				}
				
				else
				{
					System.out.println("Odds1 and Odds2 are suspended, So clicking odds 3 !");
					driver.findElement(xpathpages.odds3).click();
					System.out.println("Clicked on Bet placing Button 3 !");
					Thread.sleep(2000);
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty13.png") ;
					
					test.log(LogStatus.PASS,"Click to Bet - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty13.png'target=\\\"_blank\\  >Click Here</a>");
				}
			
			}
			
			catch(Exception f9)
			{
				f9.getMessage();
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty13.png") ;
				
				test.log(LogStatus.FAIL,"Click to Bet - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty13.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
			//Enter Stake

			try {
			
			driver.findElement(xpathpages.stakeamount1).click();
			System.out.println("Stake amount is entered !");
			Thread.sleep(1500);
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty14.png") ;
			
			
			test.log(LogStatus.PASS,"Enter Stake", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty14.png'target=\\\"_blank\\  >Click Here</a>");
			
			}
			catch(Exception f10)
			{
				System.out.println("Unable to Enter Stake amount");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty14.png") ;
				
				
				test.log(LogStatus.FAIL,"Enter Stake", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty14.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
			
			
			//Click Submit to place bet
			
			try {
			driver.findElement(xpathpages.submitbet).click();
			System.out.println("Submit to place bet is clicked !");
			Thread.sleep(2000);
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty16.png") ;
			
			
			test.log(LogStatus.PASS,"Click Submit to place bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty12.png'target=\\\"_blank\\  >Click Here</a>");
			}
			catch(Exception f12)
			{
				System.out.println("Unable to Click Submit !");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty16.png") ;
				
				
				test.log(LogStatus.FAIL,"Click Submit to place bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty12.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
			//Check if Insuff Alert is Displayed 
			
			try {
				
				boolean insuffalert = driver.findElement(xpathpages.insuffalert).isDisplayed();
				if(insuffalert == true)
				{
					System.out.println("In-sufficient Balance Alert is displayed !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty17.png") ;
					
					
					test.log(LogStatus.PASS,"In-Sufficient Balance Alert", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty17.png'target=\\\"_blank\\  >Click Here</a>");
					
					driver.findElement(xpathpages.closeevent).click();
					Thread.sleep(2000);
				
				}
				else {
					System.out.println("In-sufficient Balance Alert is not displayed !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty17.png") ;
					
					
					test.log(LogStatus.FAIL,"In-Sufficient Balance Alert", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty17.png'target=\\\"_blank\\  >Click Here</a>");
					
				}
				
			}
			
			catch(Exception f13)
			{
				f13.getMessage();
				System.out.println("Unable to Verify Insuff balance Scenario");
				
			}
			
			
			try {
				WebDriverWait wait01 = new WebDriverWait(driver,30);
				driver.findElement(By.className("bet_close")).click();
				System.out.println("Single Bet - Betslip is closed !");
				Thread.sleep(2000);	
				}
				catch(Exception f3)
				{
					f3.getMessage();
				}
			
			
			//Scenario to Check Max Bet is Working 
			
			//Place Bet in Live Game
			
			try {
				
				boolean odds1 = driver.findElement(xpathpages.odds1).isEnabled();
				//boolean odds2 = driver.findElement(xpathpages.odds2).isEnabled();
				//boolean odds3 = driver.findElement(xpathpages.odds3).isEnabled();
				
				if(odds1 == true)
				{
					System.out.println("Odds1 is not suspended !");
					driver.findElement(xpathpages.odds1).click();
					System.out.println("Clicked on Bet placing Button 1 !");
					Thread.sleep(2000);
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty18.png") ;
					
					test.log(LogStatus.PASS,"Click to Bet - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty18.png'target=\\\"_blank\\  >Click Here</a>");
					
				}
				
				else
				{
					System.out.println("Odds1 and Odds2 are suspended, So clicking odds 3 !");
					driver.findElement(xpathpages.odds3).click();
					System.out.println("Clicked on Bet placing Button 3 !");
					Thread.sleep(2000);
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty18.png") ;
					
					test.log(LogStatus.PASS,"Click to Bet - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty18.png'target=\\\"_blank\\  >Click Here</a>");
				}
			
			}
			
			catch(Exception f9)
			{
				f9.getMessage();
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty18.png") ;
				
				test.log(LogStatus.FAIL,"Click to Bet - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty18.png'target=\\\"_blank\\  >Click Here</a>");
			}
			/*
			//Enter Max Stake

			try {
			
			driver.findElement(xpathpages.maxstake).click();
			System.out.println("Max Stake amount is selected !");
			Thread.sleep(2500);
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty19.png") ;
			
			
			test.log(LogStatus.PASS,"Enter Max Stake", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty19.png'target=\\\"_blank\\  >Click Here</a>");
			
			}
			catch(Exception f10)
			{
				System.out.println("Unable to Enter Max Stake amount");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty19.png") ;
				
				
				test.log(LogStatus.FAIL,"Enter Max Stake", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty19.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
			
			//Verify Max Stake
			
			try {
				
				boolean maxstakefailalert = driver.findElement(xpathpages.maxstakealert).isDisplayed();
				if(maxstakefailalert != true)
				{
					System.out.println("In-sufficient Balance Alert is displayed !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty20.png") ;
					
					
					test.log(LogStatus.PASS,"Max Stake", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty20.png'target=\\\"_blank\\  >Click Here</a>");
					
					
					Thread.sleep(2000);
					
				
				}
				else {
					System.out.println("Unable to place Max Bet !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\gameavailability\\qwerty20.png") ;
					
					
					test.log(LogStatus.FAIL,"Max Stake", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/gameavailability/qwerty20.png'target=\\\"_blank\\  >Click Here</a>");
					Thread.sleep(3000);
					driver.findElement(xpathpages.closeevent).click();
				}
				
			}
			
			catch(Exception f13)
			{
				f13.getMessage();
				System.out.println("Unable to Verify Max Bet Scenario");
				
			}
			*/
			
			
			driver.switchTo().parentFrame();
			
			        
			
			
			driver.close();
			System.out.println("Browser is closed !");

	}

}

