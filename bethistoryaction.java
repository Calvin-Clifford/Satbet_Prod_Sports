package Actions;

import org.openqa.selenium.By;
import java.io.FileInputStream;
import java.util.Calendar;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebElement;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import Pages.xpathpages;
import source_sports.baseclass;


public class bethistoryaction extends baseclass{
	@Test
	
	public static void bethistory() throws Throwable  {
		//public static WebDriver driver = null;
		
		baseclass.invoke();
		
		//For Excel Read
		
		FileInputStream fis = new FileInputStream("D:\\workspace\\SATBET_SPORTS_PROD\\SatbetSportsProdExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		test = report.startTest("Bet History Actions");
		
		//Click Login for New User
		
				driver.findElement(xpathpages.loginbutton).click();
				System.out.println("Login Button is clicked for new User !");
				Thread.sleep(4000);
				
				//Enter User name
				
				Row row11 = sheet.getRow(1);
				Cell cell11 = row11.getCell(2);
				String cellval11 = cell11.getStringCellValue();
				driver.findElement(xpathpages.username).sendKeys(cellval11);
				Thread.sleep(4000);
				System.out.println("User name is Entered");
				
				
			
				//Enter Password
			
				Row row12 = sheet.getRow(2);
				Cell cell12 = row12.getCell(2);
				String cellval12 = cell12.getStringCellValue();
				driver.findElement(xpathpages.password).sendKeys(cellval12);
				Thread.sleep(2000);	
				System.out.println("Password is Entered");
					
				
				//Click Submit
					
				driver.findElement(xpathpages.submit).click();
				System.out.println("Submit button is clicked !");
				Thread.sleep(3000);	
			
				
				//Open Sportsbook page
				
				driver.findElement(xpathpages.sportsbookpage).click();
				System.out.println("Sportsbook is opened !");
				Thread.sleep(4000);
				
				//Navigating to Sports iFrame
				
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
					} 
						else 
						{
						System.out.println("Unable to navigate to frame with element "+ frameElement);
					}
						
						
				//Open Bet History Page
						
						try {
						WebDriverWait wait1 = new WebDriverWait(driver,30);
						wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.bethistory));
						driver.findElement(xpathpages.bethistory).click();
						System.out.println("Clicked on Bet History !");
						Thread.sleep(2000);
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty1.png") ;
						
						test.log(LogStatus.PASS,"Open Bet History Page", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty1.png'target=\\\"_blank\\  >Click Here</a>");
						}
						
						catch(Exception f1)
						{
							f1.getMessage();
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty1.png") ;
							
							test.log(LogStatus.FAIL,"Open Bet History Page", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty1.png'target=\\\"_blank\\  >Click Here</a>");
						}
				
				//Get Today Date
						
						DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
						DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy mm:ss");
						 
						 //get current date time with Date()
						 Date date = new Date();
						 
						 //get Yesterday date time with Date()
						 
						 // Create a calendar object with today date
						 
						 Calendar calendar = Calendar.getInstance();

						 // Move calendar to yesterday
						 
						 calendar.add(Calendar.DATE, -1);

						 // Get current date of calendar which point to the yesterday now
						 
						 Date yesterday = calendar.getTime();
						 
						 // Now format the date
						 String date1= dateFormat.format(date);
						 String yesterdaydate= dateFormat1.format(yesterday);
						 
						 // Print the Date
						 System.out.println(date1);
						 
			
						
				//Verify Bets in Open Bets
						
						try {
						WebDriverWait wait02 = new WebDriverWait(driver,30);
						wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.bettime));
						driver.findElement(xpathpages.bettime).isDisplayed();
						System.out.println("Open Bet is Displayed !");
						String G = driver.findElement(xpathpages.bettime).getText();
						System.out.println(G);
						
						if (G.contains(date1))
							{
								System.out.println("Open Bets are working fine");
								baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty2.png") ;
								
								test.log(LogStatus.PASS,"Open Bets - Display - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
							}
						
						else
						{
							System.out.println("Open Bets are not working fine");
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty2.png") ;
							
							test.log(LogStatus.INFO,"Open Bets - Not present at the Time of Test", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
						}
						}
						catch(Exception f2)
						{
							System.out.println("Open Bets are not working fine - SKIP");
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty2.png") ;
							
							test.log(LogStatus.FAIL,"Open Bets - Display - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
						}
						
						
						
				//Open Settled in BetHistory Page
						
						try {
						WebDriverWait wait02 = new WebDriverWait(driver,30);
						wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.settled1));
						driver.findElement(xpathpages.settled1).click();
						System.out.println("Settled in Bet History is Opened !");
						Thread.sleep(2000);
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty3.png") ;
						
						test.log(LogStatus.PASS,"Settled Bets - Click to Open", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty3.png'target=\\\"_blank\\  >Click Here</a>");
						}
						catch(Exception f3)
						{
							f3.getMessage();
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty3.png") ;
							
							test.log(LogStatus.FAIL,"Settled Bets - Click to Open", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty3.png'target=\\\"_blank\\  >Click Here</a>");
						}
						
						
						
				//Verify Bets Present in Settled Bets
						
						try {
						WebDriverWait wait02 = new WebDriverWait(driver,30);
						wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.bettime));
						boolean a0001 = driver.findElement(xpathpages.bettime).isDisplayed();
						if(a0001 == true)
						{
						System.out.println("Settled Bets are Displayed !");
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty4.png") ;
						
						test.log(LogStatus.PASS,"Settled Bets - Display - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty4.png'target=\\\"_blank\\  >Click Here</a>");
						}
						else
						{
							System.out.println("Settled Bets are not Displayed !");
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty4.png") ;
							
							test.log(LogStatus.FAIL,"Settled Bets - Display - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty4.png'target=\\\"_blank\\  >Click Here</a>");
						}
						}
						catch(Exception f4)
						{
							f4.getMessage();
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty4.png") ;
							
							test.log(LogStatus.FAIL,"Settled Bets - Display - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty4.png'target=\\\"_blank\\  >Click Here</a>");
						}
						
						
						
				//Open Settled Dropdown in Bet History
						
						try {
						WebDriverWait wait02 = new WebDriverWait(driver,30);
						wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.settleddrop));
						driver.findElement(xpathpages.settleddrop).click();
						System.out.println("Settled Dropdown is Opened !");
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty5.png") ;
						
						test.log(LogStatus.PASS,"Settled Bets - Dropdown - Open", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty5.png'target=\\\"_blank\\  >Click Here</a>");
						}
						catch(Exception f5)
						{
							f5.getMessage();
							System.out.println("Settled Dropdown not Opened !");
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty5.png") ;
							
							test.log(LogStatus.FAIL,"Settled Bets - Dropdown - Open", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty5.png'target=\\\"_blank\\  >Click Here</a>");
						}
						
						
						
						
				//Open All Dropdown in Bet History
						
						try {
						
						WebDriverWait wait02 = new WebDriverWait(driver,30);
						wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.alldrop));
						driver.findElement(xpathpages.alldrop).click();
						System.out.println("All in Dropdown is Opened !");
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty6.png") ;
						
						test.log(LogStatus.PASS,"Settled Bets - All - Click to Open", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty6.png'target=\\\"_blank\\  >Click Here</a>");
						
						}
						catch(Exception f6)
						{
							f6.getMessage();
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty6.png") ;
							
							test.log(LogStatus.FAIL,"Settled Bets - All - Click to Open", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty6.png'target=\\\"_blank\\  >Click Here</a>");
							
						}
						
						
						//Verify Bets Present in Settled Bets - All
						
						try {
						WebDriverWait wait02 = new WebDriverWait(driver,30);
						wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.bettime));
						boolean a0001 = driver.findElement(xpathpages.bettime).isDisplayed();
						if(a0001 == true)
						{
						System.out.println("Settled Bets are Displayed !");
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty7.png") ;
						
						test.log(LogStatus.PASS,"Settled Bets - All - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty7.png'target=\\\"_blank\\  >Click Here</a>");
						}
						else
						{
							System.out.println("Settled Bets are not Displayed !");
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty7.png") ;
							
							test.log(LogStatus.FAIL,"Settled Bets - All - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty7.png'target=\\\"_blank\\  >Click Here</a>");
						}
						}
						catch(Exception f4)
						{
							f4.getMessage();
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty7.png") ;
							
							test.log(LogStatus.FAIL,"Settled Bets - All - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty7.png'target=\\\"_blank\\  >Click Here</a>");
						}
						
				//Open Settled Dropdown in Bet History
						
						try {
						WebDriverWait wait02 = new WebDriverWait(driver,30);
						wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.settleddrop));
						driver.findElement(xpathpages.settleddrop).click();
						System.out.println("Settled Dropdown is Opened !");
						
						}
						catch(Exception f5)
						{
							f5.getMessage();
							System.out.println("Settled Dropdown not Opened !");
							
						}
						
				//Open 24Hrs in All Dropdown
						
						try {
							
							WebDriverWait wait02 = new WebDriverWait(driver,30);
							wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.hr24indrop));
							driver.findElement(xpathpages.hr24indrop).click();
							System.out.println("24hrs in Dropdown is Opened !");
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty8.png") ;
							
							test.log(LogStatus.PASS,"Settled Bets - 24hrs - Click to Open", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty8.png'target=\\\"_blank\\  >Click Here</a>");
							
							}
							catch(Exception f6)
							{
								f6.getMessage();
								baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty8.png") ;
								
								test.log(LogStatus.FAIL,"Settled Bets - 24hrs - Click to Open", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty8.png'target=\\\"_blank\\  >Click Here</a>");
								
							}
						
					//Verify Bets Present in Settled Bets - 24hrs
						
						try {
						WebDriverWait wait02 = new WebDriverWait(driver,30);
						wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.bettime));
						boolean a0001 = driver.findElement(xpathpages.bettime).isDisplayed();
						if(a0001 == true)
						{
						System.out.println("Settled Bets are Displayed !");
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty9.png") ;
						
						test.log(LogStatus.PASS,"Settled Bets - 24hrs - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty9.png'target=\\\"_blank\\  >Click Here</a>");
						}
						else
						{
							System.out.println("Settled Bets are not Displayed !");
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty9.png") ;
							
							test.log(LogStatus.FAIL,"Settled Bets - 24hrs - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty9.png'target=\\\"_blank\\  >Click Here</a>");
						}
						}
						catch(Exception f4)
						{
							f4.getMessage();
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty9.png") ;
							
							test.log(LogStatus.FAIL,"Settled Bets - 24hrs - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty9.png'target=\\\"_blank\\  >Click Here</a>");
						}
						
					//Open Settled Dropdown in Bet History
						
						try {
						WebDriverWait wait02 = new WebDriverWait(driver,30);
						wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.settleddrop));
						driver.findElement(xpathpages.settleddrop).click();
						System.out.println("Settled Dropdown is Opened !");
						
						}
						catch(Exception f5)
						{
							f5.getMessage();
							System.out.println("Settled Dropdown not Opened !");
							
						}
						
					//Open 3 days in All Dropdown
						
						try {
							
							WebDriverWait wait02 = new WebDriverWait(driver,30);
							wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.days3indrop));
							driver.findElement(xpathpages.days3indrop).click();
							System.out.println("3 days in Dropdown is Opened !");
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty10.png") ;
							
							test.log(LogStatus.PASS,"Settled Bets - 3 days - Click to Open", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
							
							}
							catch(Exception f6)
							{
								f6.getMessage();
								baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty10.png") ;
								
								test.log(LogStatus.FAIL,"Settled Bets - 3 days - Click to Open", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
								
							}
						
						
					//Verify Bets Present in Settled Bets - 3 days
						
						try {
						WebDriverWait wait02 = new WebDriverWait(driver,30);
						wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.bettime));
						boolean a0001 = driver.findElement(xpathpages.bettime).isDisplayed();
						if(a0001 == true)
						{
						System.out.println("Settled Bets are Displayed !");
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty11.png") ;
						
						test.log(LogStatus.PASS,"Settled Bets - 3 days - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty11.png'target=\\\"_blank\\  >Click Here</a>");
						}
						else
						{
							System.out.println("Settled Bets are not Displayed !");
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty11.png") ;
							
							test.log(LogStatus.FAIL,"Settled Bets - 3 days - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty11.png'target=\\\"_blank\\  >Click Here</a>");
						}
						}
						catch(Exception f4)
						{
							f4.getMessage();
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty11.png") ;
							
							test.log(LogStatus.FAIL,"Settled Bets - 3 days - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty11.png'target=\\\"_blank\\  >Click Here</a>");
						}
						
						
					//Open Settled Dropdown in Bet History
						
						try {
						WebDriverWait wait02 = new WebDriverWait(driver,30);
						wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.settleddrop));
						driver.findElement(xpathpages.settleddrop).click();
						System.out.println("Settled Dropdown is Opened !");
						
						}
						catch(Exception f5)
						{
							f5.getMessage();
							System.out.println("Settled Dropdown not Opened !");
							
						}
						
						
					//Open 7 days in All Dropdown
						
						try {
							
							WebDriverWait wait02 = new WebDriverWait(driver,30);
							wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.days7indrop));
							driver.findElement(xpathpages.days7indrop).click();
							System.out.println(" 7 days in Dropdown is Opened !");
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty12.png") ;
							
							test.log(LogStatus.PASS,"Settled Bets - 7 days - Click to Open", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty12.png'target=\\\"_blank\\  >Click Here</a>");
							
							}
							catch(Exception f6)
							{
								f6.getMessage();
								baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty12.png") ;
								
								test.log(LogStatus.FAIL,"Settled Bets - 7 days - Click to Open", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty12.png'target=\\\"_blank\\  >Click Here</a>");
								
							}
						
						
					//Verify Bets Present in Settled Bets - 7 days
						
						try {
						WebDriverWait wait02 = new WebDriverWait(driver,30);
						wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.bettime));
						boolean a0001 = driver.findElement(xpathpages.bettime).isDisplayed();
						if(a0001 == true)
						{
						System.out.println("Settled Bets are Displayed !");
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty13.png") ;
						
						test.log(LogStatus.PASS,"Settled Bets - 7 days - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty13.png'target=\\\"_blank\\  >Click Here</a>");
						}
						else
						{
							System.out.println("Settled Bets are not Displayed !");
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty13.png") ;
							
							test.log(LogStatus.FAIL,"Settled Bets - 7 days - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty13.png'target=\\\"_blank\\  >Click Here</a>");
						}
						}
						catch(Exception f4)
						{
							f4.getMessage();
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\bethistoryactions\\qwerty13.png") ;
							
							test.log(LogStatus.FAIL,"Settled Bets - 7 days - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/bethistoryactions/qwerty13.png'target=\\\"_blank\\  >Click Here</a>");
						}
						
						
						//Switching to Parent Frame
					  	
					  	driver.switchTo().parentFrame();
					  	System.out.println("Switched to Parent Frame !");
					  	
					  	
						
						driver.close();
						System.out.println("Browser is closed !");
						
				
		
	}

}
