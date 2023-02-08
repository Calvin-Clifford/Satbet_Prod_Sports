package Actions;

import org.openqa.selenium.By;
import java.io.FileInputStream;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;	
import java.awt.Robot;	
import java.awt.event.KeyEvent;
import org.openqa.selenium.JavascriptExecutor;
import Pages.xpathpages;
import source_sports.baseclass;

public class functionsaction extends baseclass {
	@Test
	
	public static void function() throws Throwable  {
		
		baseclass.invoke();
		
		//For Excel Read
		
		FileInputStream fis = new FileInputStream("D:\\workspace\\SATBET_SPORTS_PROD\\SatbetSportsProdExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		test = report.startTest("Functions / Bets & Wins ");
		
		 
		 int Tennis1;
		 int TableTennis1;
		 int Soccer1;
		 int Basketball1;
		 int Volleyball1;
		 int Tennis001;
		 int TableTennis001;
		 int Soccer001;
		 int Basketball001;
		 int Volleyball001;
		
		//Click Login for New User
		
				driver.findElement(xpathpages.loginbutton).click();
				System.out.println("Login Button is clicked for new User !");
				Thread.sleep(2000);
				
				//Enter User name
				
				Row row11 = sheet.getRow(1);
				Cell cell11 = row11.getCell(2);
				String cellval11 = cell11.getStringCellValue();
				driver.findElement(xpathpages.username).sendKeys(cellval11);
				Thread.sleep(2000);
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
				
						
				
			
			  	//Open Livenow in Sportsbook
			  	
			
				WebDriverWait wait02 = new WebDriverWait(driver,30);
			  	WebElement livenow1 = driver.findElement(By.xpath("//*[text()='Live Now']"));
			  	JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", livenow1);
				System.out.println("Live Now page Opened !");
			
				
				
			  	//Open the First game in Live now
			  	
				
				wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.openscore));
			  	driver.findElement(xpathpages.openscore).click();
			  	System.out.println("Game Opened !");
			  	
			  	//Verify Scorecard or Live Tracker is Displayed
			  	
			  	try {
			  	
				wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.scorecard));
				boolean a009 = driver.findElement(xpathpages.scorecard).isDisplayed();
			    if(a009 == true)
			    {
			  	System.out.println("Scorecard is Displayed");
			    baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty1.png") ;
				
				test.log(LogStatus.PASS,"Verify Scorecard/Live Score Display", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty1.png'target=\\\"_blank\\  >Click Here</a>");
			  	}
			  	else
			  	{
			  		System.out.println("Scorecard is not Displayed");
			  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty1.png") ;
						
					test.log(LogStatus.FAIL,"Verify Scorecard/Live Score Display", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty1.png'target=\\\"_blank\\  >Click Here</a>");
			  	}
			  	}
			  	
			  	catch(Exception f1)
			  	{
			  		f1.getMessage();
			  		System.out.println("Scorecard is not Displayed");
			  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty1.png") ;
						
					test.log(LogStatus.FAIL,"Verify Scorecard/Live Score Display", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty1.png'target=\\\"_blank\\  >Click Here</a>");
			  	}
			  	
			  		
			 //Close the Event page
			  	
			  	wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.closeevent));
			    driver.findElement(xpathpages.closeevent).click();
			    System.out.println("Event is Closed !");
			    
			    
			   
			  	
			 //Live count verify
			  	
			    try {
					
					String Tennis11 = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[3]")).getText();
					Tennis11 = Tennis11.replaceAll("[^0-9]", " ");
					Tennis11 = Tennis11.trim();
					Tennis11 = Tennis11.replaceAll(" + ", " ");
					//Tennis = Tennis.replaceAll("[\\[\\](){}]","");
					Tennis001 =Integer.parseInt(Tennis11);
					System.out.println("Number of games in Tennis" + " = " + Tennis001);
					
					}
					catch(Exception f01)    
					{
						f01.getMessage();
						Tennis001 = 0;
					}
					
					try {
					
					String TableTennis11 = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[4]")).getText();
					TableTennis11 = TableTennis11.replaceAll("[^0-9]", " ");
					TableTennis11 = TableTennis11.trim();
					TableTennis11 = TableTennis11.replaceAll(" + ", " ");
					//TableTennis = TableTennis.replaceAll("[\\[\\](){}]","");
					TableTennis001 =Integer.parseInt(TableTennis11);
					System.out.println("Number of games in Table Tennis" + " = " + TableTennis001);
					}
					catch(Exception f02)
					{
						f02.getMessage();
						TableTennis001 = 0;
					}
					
					try {
			
					String Soccer11 = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[2]")).getText();
					Soccer11 = Soccer11.replaceAll("[^0-9]", " ");
					Soccer11 = Soccer11.trim();
					Soccer11 = Soccer11.replaceAll(" + ", " ");
					//Soccer = Soccer.replaceAll("[\\[\\](){}]","");
					Soccer001 =Integer.parseInt(Soccer11);
					System.out.println("Number of games in Soccer" + " = " + Soccer001);
					
					}
					catch(Exception f03)
					{
						f03.getMessage();
						Soccer001 = 0;
						
					}
					
					try {
				
					String Basketball11 = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[8]")).getText();
					Basketball11 = Basketball11.replaceAll("[^0-9]", " ");
					Basketball11 = Basketball11.trim();
					Basketball11 = Basketball11.replaceAll(" + ", " ");
					//Basketball = Basketball.replaceAll("[\\[\\](){}]","");
					Basketball001 =Integer.parseInt(Basketball11);
					System.out.println("Number of games in Basketball" + " = " + Basketball001);
					
					}
					catch(Exception f04)
					{
						f04.getMessage();
						Basketball001 = 0;
					}
					
					try {
					
						String Volleyball11 = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[13]")).getText();
						Volleyball11 = Volleyball11.replaceAll("[^0-9]", " ");
						Volleyball11 = Volleyball11.trim();
						Volleyball11 = Volleyball11.replaceAll(" + ", " ");
						//Volleyball = Volleyball.replaceAll("[\\[\\](){}]","");
						Volleyball001 =Integer.parseInt(Volleyball11);
						System.out.println("Number of games in Volleyball" + " = " + Volleyball001);
						
						}
						catch(Exception f04)
						{
							f04.getMessage();
							Volleyball001 = 0;
						}
			   
				try {
				
				if(Tennis001 >= 1)
				{
					
					WebElement tennistab = driver.findElement(By.xpath("//*[text()='Tennis']"));
					executor.executeScript("arguments[0].click();", tennistab);
				    System.out.println("Tennis Game page opened !");
				    Thread.sleep(2000);
				    
					//Get number of Events in Tennis
				  	
				  	List <WebElement> noofevents = driver.findElements(By.className("overall-event-data"));
				  	
				  	int total = noofevents.size();
				  	System.out.println("No of Events " + " = " + total);
				  	
				  	if(total == Tennis001)
				  	{
				  		System.out.println("Live count working fine");
				  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty2.png") ;
						
						test.log(LogStatus.PASS,"Live Count - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
				  	}
				  	else
				  	{
				  		System.out.println("Live count is not working");
				  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty2.png") ;
						
						test.log(LogStatus.FAIL,"Live Count - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
				  	}

				  	
				  	
				}
				else if(TableTennis001 >= 1)
				{
					WebElement tabletennistab = driver.findElement(By.xpath("//*[text()='Table Tennis']"));
					executor.executeScript("arguments[0].click();", tabletennistab);
				    System.out.println("Table Tennis Game page opened !");
				    Thread.sleep(2000);
				    
					//Get number of Events in Table  Tennis
				  	
				  	List <WebElement> noofevents = driver.findElements(By.className("overall-event-data"));
				  	
				  	int total = noofevents.size();
				  	System.out.println("No of Events " + " = " + total);
				  	
				  	if(total == TableTennis001)
				  	{
				  		System.out.println("Live count working fine");
				  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty2.png") ;
						
						test.log(LogStatus.PASS,"Live Count - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
				  	}
				  	else
				  	{
				  		System.out.println("Live count is not working");
				  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty2.png") ;
						
						test.log(LogStatus.FAIL,"Live Count - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
				  	}
				}
				
				else if(Soccer001 >= 1)
				{
					
					WebElement soccertab = driver.findElement(By.xpath("//*[text()='Soccer']"));
					executor.executeScript("arguments[0].click();", soccertab);
				    System.out.println("Soccer Game page opened !");
				    Thread.sleep(2000);
				    
					//Get number of Events in Soccer
				  	
				  	List <WebElement> noofevents = driver.findElements(By.className("overall-event-data"));
				  	
				  	int total = noofevents.size();
				  	System.out.println("No of Events " + " = " + total);
				  	
				  	if(total == Soccer001)
				  	{
				  		System.out.println("Live count working fine");
				  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty2.png") ;
						
						test.log(LogStatus.PASS,"Live Count - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
				  	}
				  	else
				  	{
				  		System.out.println("Live count is not working");
				  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty2.png") ;
						
						test.log(LogStatus.FAIL,"Live Count - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
				  	}
				}
				
				
				else if(Basketball001 >= 1)
				{
					
					WebElement basketballtab = driver.findElement(By.xpath("//*[text()='Basketball']"));
					executor.executeScript("arguments[0].click();", basketballtab);
				    System.out.println("Basketball Game page opened !");
				    Thread.sleep(2000);
				    
					//Get number of Events in Basketball
				  	
				  	List <WebElement> noofevents = driver.findElements(By.className("overall-event-data"));
				  	
				  	int total = noofevents.size();
				  	System.out.println("No of Events " + " = " + total);
				  	
				  	if(total == Basketball001)
				  	{
				  		System.out.println("Live count working fine");
				  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty2.png") ;
						
						test.log(LogStatus.PASS,"Live Count - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
				  	}
				  	else
				  	{
				  		System.out.println("Live count is not working");
				  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty2.png") ;
						
						test.log(LogStatus.FAIL,"Live Count - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
				  	}
				}
				
				else if(Volleyball001 >= 1)
				{
					
					WebElement volleyballtab = driver.findElement(By.xpath("//*[text()='Volleyball']"));
					executor.executeScript("arguments[0].click();", volleyballtab);
				    System.out.println("volleyball Game page opened !");
				    Thread.sleep(2000);
				    
					//Get number of Events in Volleyball
				  	
				  	List <WebElement> noofevents = driver.findElements(By.className("overall-event-data"));
				  	
				  	int total = noofevents.size();
				  	System.out.println("No of Events " + " = " + total);
				  	
				  	if(total == Volleyball001)
				  	{
				  		System.out.println("Live count working fine");
				  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty2.png") ;
						
						test.log(LogStatus.PASS,"Live Count - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
				  	}
				  	else
				  	{
				  		System.out.println("Live count is not working");
				  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty2.png") ;
						
						test.log(LogStatus.FAIL,"Live Count - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
				  	}
				}
				}
				catch(Exception f2)
				{
					f2.getMessage();
					System.out.println("Live count - Unable to Execute");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty2.png") ;
					
					test.log(LogStatus.FAIL,"Live Count - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
					
				}
				
				//Open Livenow in Sportsbook
			  	
				
				
			  	WebElement livenow2 = driver.findElement(By.xpath("//*[text()='Live Now']"));
			  	//JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", livenow2);
				System.out.println("Live Now page Opened !");
				Thread.sleep(3000);
				
				//Pending Status Verify
				
				//Place Bet in Live Game
				
				//try {
				
				
				boolean odds1 = driver.findElement(xpathpages.odds1).isEnabled();
				//boolean odds2 = driver.findElement(xpathpages.odds2).isEnabled();
				//boolean odds3 = driver.findElement(xpathpages.odds3).isEnabled();
				
				if(odds1 == true)
				{
					System.out.println("Odds1 is not suspended !");
					driver.findElement(xpathpages.odds1).click();
					System.out.println("Clicked on Bet placing Button 1 !");
					Thread.sleep(2000);
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty3.png") ;
					
					test.log(LogStatus.PASS,"Click to Bet - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty3.png'target=\\\"_blank\\  >Click Here</a>");
					
				}
				
				else
				{
					System.out.println("Odds1 and Odds2 are suspended, So clicking odds 3 !");
					driver.findElement(xpathpages.odds3).click();
					System.out.println("Clicked on Bet placing Button 3 !");
					Thread.sleep(2000);
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty3.png") ;
					
					test.log(LogStatus.PASS,"Click to Bet - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty3.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				/*
				
				}
				
				catch(Exception f9)
				{
					f9.getMessage();
					System.out.println("Unable to click Odds");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty3.png") ;
					
					test.log(LogStatus.FAIL,"Click to Bet - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty3.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				*/
				
				//Enter Stake

				try {
				
				driver.findElement(xpathpages.stakeamount).click();
				System.out.println("Stake amount is entered !");
				Thread.sleep(1500);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty4.png") ;
				
				
				test.log(LogStatus.PASS,"Enter Stake", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty4.png'target=\\\"_blank\\  >Click Here</a>");
				
				}
				catch(Exception f10)
				{
					System.out.println("Unable to Enter Stake amount");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty4.png") ;
					
					
					test.log(LogStatus.FAIL,"Enter Stake", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty4.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				
				
				//Click Always allow odd changes
				
				//try {	
				WebElement a = driver.findElement(xpathpages.alwaysallowoddchange);
				executor.executeScript("arguments[0].click();", a);
				//driver.findElement(xpathpages.alwaysallowoddchange).click();
				System.out.println("Always allow odd changes is clicked !");
				Thread.sleep(4000);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty5.png") ;
				
				
				test.log(LogStatus.PASS,"Click Always allow odd changes", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty5.png'target=\\\"_blank\\  >Click Here</a>");
				/*
				}
				catch(Exception f11)
				{
					System.out.println("Unable to Allow Odd Changes");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty5.png") ;
					
					
					test.log(LogStatus.FAIL,"Click Always allow odd changes", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty5.png'target=\\\"_blank\\  >Click Here</a>");
				}
				*/
				//Click Submit to place bet
				
				try {
				driver.findElement(xpathpages.submitbet).click();
				System.out.println("Submit to place bet is clicked !");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty6.png") ;
				
				
				test.log(LogStatus.PASS,"Click Submit to place bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty6.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				catch(Exception f12)
				{
					System.out.println("Unable to Click Submit !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty6.png") ;
					
					
					test.log(LogStatus.FAIL,"Click Submit to place bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty6.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				//Open Bet History Page
				
				try {
				WebDriverWait wait1 = new WebDriverWait(driver,30);
				wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.bethistory));
				driver.findElement(xpathpages.bethistory).click();
				System.out.println("Clicked on Bet History !");
				
				
				}
				
				catch(Exception f1)
				{
					f1.getMessage();
					
				}
				
				//Verify Pending Status
				
				try {
				wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.pending));
				boolean a090 = driver.findElement(xpathpages.pending).isDisplayed();
				if(a090 == true)
				{
				System.out.println("Pending Status Verified!");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty7.png") ;
				
				
				test.log(LogStatus.PASS,"Pending Status - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty7.png'target=\\\"_blank\\  >Click Here</a>");
				}
				else
				{
					System.out.println("Pending Status Verified! - FAIL");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty7.png") ;
					
					
					test.log(LogStatus.FAIL,"Pending Status - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty7.png'target=\\\"_blank\\  >Click Here</a>");
				}
				}
				catch(Exception f7)
				{
					f7.getMessage();
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty7.png") ;
					
					
					test.log(LogStatus.FAIL,"Pending Status - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty7.png'target=\\\"_blank\\  >Click Here</a>");

					
				}
				
				//Verify Accepted Status
				
				try {
				wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.accepted));
				boolean a091 = driver.findElement(xpathpages.accepted).isDisplayed();
				if(a091 == true)
				{
				System.out.println("Accepted Status Verified!");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty8.png") ;
				
				
				test.log(LogStatus.PASS,"Accepted Status - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty8.png'target=\\\"_blank\\  >Click Here</a>");
				}
				else
				{
					System.out.println("Accepted Status Verified! - FAIL");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty8.png") ;
					
					
					test.log(LogStatus.FAIL,"Accepted Status - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty8.png'target=\\\"_blank\\  >Click Here</a>");
				}
				}
				catch(Exception f8)
				{
					f8.getMessage();
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty8.png") ;
					
					
					test.log(LogStatus.FAIL,"Accepted Status - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty8.png'target=\\\"_blank\\  >Click Here</a>");

					
				}
				
				//Verify Ref Num Display
				
				try {
				wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.refnum));
				boolean a093 = driver.findElement(xpathpages.refnum).isDisplayed();
				if(a093 == true)
				{
				System.out.println("Ref Num Verified!");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty9.png") ;
				
				
				test.log(LogStatus.PASS,"Reference Number - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty9.png'target=\\\"_blank\\  >Click Here</a>");
				}
				else
				{
					System.out.println("Ref Num Verified! - FAIL");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty9.png") ;
					
					
					test.log(LogStatus.FAIL,"Reference Number - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty9.png'target=\\\"_blank\\  >Click Here</a>");
				}
				}
				catch(Exception f9)
				{
					f9.getMessage();
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty9.png") ;
					
					
					test.log(LogStatus.FAIL,"Reference Number - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty9.png'target=\\\"_blank\\  >Click Here</a>");

					
				}
				
				//Multibet Same game In-Play and Pre-Match
				
				Robot robot = new Robot();
				
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_MINUS);
				
				Thread.sleep(1000);
				
						
				//Finding Cashout Games and Switching to Particular sports 
				
				try {
					
					String Tennis11 = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[3]")).getText();
					Tennis11 = Tennis11.replaceAll("[^0-9]", " ");
					Tennis11 = Tennis11.trim();
					Tennis11 = Tennis11.replaceAll(" + ", " ");
					//Tennis = Tennis.replaceAll("[\\[\\](){}]","");
					Tennis001 =Integer.parseInt(Tennis11);
					System.out.println("Number of games in Tennis" + " = " + Tennis001);
					
					}
					catch(Exception f01)    
					{
						f01.getMessage();
						Tennis001 = 0;
					}
					
					try {
					
					String TableTennis11 = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[4]")).getText();
					TableTennis11 = TableTennis11.replaceAll("[^0-9]", " ");
					TableTennis11 = TableTennis11.trim();
					TableTennis11 = TableTennis11.replaceAll(" + ", " ");
					//TableTennis = TableTennis.replaceAll("[\\[\\](){}]","");
					TableTennis001 =Integer.parseInt(TableTennis11);
					System.out.println("Number of games in Table Tennis" + " = " + TableTennis001);
					}
					catch(Exception f02)
					{
						f02.getMessage();
						TableTennis001 = 0;
					}
					
					try {
			
					String Soccer11 = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[2]")).getText();
					Soccer11 = Soccer11.replaceAll("[^0-9]", " ");
					Soccer11 = Soccer11.trim();
					Soccer11 = Soccer11.replaceAll(" + ", " ");
					//Soccer = Soccer.replaceAll("[\\[\\](){}]","");
					Soccer001 =Integer.parseInt(Soccer11);
					System.out.println("Number of games in Soccer" + " = " + Soccer001);
					
					}
					catch(Exception f03)
					{
						f03.getMessage();
						Soccer001 = 0;
						
					}
					
					try {
				
					String Basketball11 = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[8]")).getText();
					Basketball11 = Basketball11.replaceAll("[^0-9]", " ");
					Basketball11 = Basketball11.trim();
					Basketball11 = Basketball11.replaceAll(" + ", " ");
					//Basketball = Basketball.replaceAll("[\\[\\](){}]","");
					Basketball001 =Integer.parseInt(Basketball11);
					System.out.println("Number of games in Basketball" + " = " + Basketball001);
					
					}
					catch(Exception f04)
					{
						f04.getMessage();
						Basketball001 = 0;
					}
					
					try {
					
						String Volleyball11 = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[13]")).getText();
						Volleyball11 = Volleyball11.replaceAll("[^0-9]", " ");
						Volleyball11 = Volleyball11.trim();
						Volleyball11 = Volleyball11.replaceAll(" + ", " ");
						//Volleyball = Volleyball.replaceAll("[\\[\\](){}]","");
						Volleyball001 =Integer.parseInt(Volleyball11);
						System.out.println("Number of games in Volleyball" + " = " + Volleyball001);
						
						}
						catch(Exception f04)
						{
							f04.getMessage();
							Volleyball001 = 0;
						}
				
				if(Tennis001 >= 1)
				{
					WebElement tennistab = driver.findElement(By.xpath("//*[text()='Tennis']"));
					executor.executeScript("arguments[0].click();", tennistab);
				    System.out.println("Tennis Game page opened !");
				    Thread.sleep(2000);
				    
				 // Place Multi Bet 
					
					try {
						
						boolean odds001 = driver.findElement(xpathpages.odds1).isEnabled();
						//boolean odds2 = driver.findElement(xpathpages.odds2).isEnabled();
						//boolean odds3 = driver.findElement(xpathpages.odds3).isEnabled();
						
						if(odds001 == true)
						{
							System.out.println("Odds1 is not suspended !");
							WebElement odds01 = driver.findElement(By.xpath("(//div[@class='team-button'])[4]"));
							executor.executeScript("arguments[0].click();", odds01);
							//driver.findElement(cashoutpages.odds1).click();
							System.out.println("Clicked on Bet placing Button 1 !");
							Thread.sleep(2000);
							
							//Open Pre-Match in Tennis Tab
						  	
						  	driver.findElement(xpathpages.Prematchtennis).click();
						  	System.out.println("Prematch games in tennis is opened !");
						  	Thread.sleep(3000);
							
							WebElement odds02 = driver.findElement(By.xpath("(//div[@class='team-button'])[4]"));
							executor.executeScript("arguments[0].click();", odds02);
							//driver.findElement(cashoutpages.odds2).click();
							System.out.println("Clicked on Bet placing Button 2 !");
							Thread.sleep(2000);
							
							
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty10.png") ;
							test.log(LogStatus.PASS,"Click to Bet - Multi Bet(Inplay and Prematch Same Game)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
							
						}
						
						else
						{
							System.out.println("Odds1 and Odds2 are suspended, So clicking odds 3 !");
							WebElement odds03 = driver.findElement(By.xpath("(//div[@class=\"team-button\"])[8]"));
							executor.executeScript("arguments[0].click();", odds03);
							//driver.findElement(cashoutpages.odds3).click();
							System.out.println("Clicked on Bet placing Button 3 !");
							Thread.sleep(2000);
							
							//Open Pre-Match in Tennis Tab
						  	
						  	driver.findElement(xpathpages.Prematchtennis).click();
						  	System.out.println("Prematch games in tennis is opened !");
						  	Thread.sleep(3000);
							
							WebElement odds01 = driver.findElement(By.xpath("(//div[@class=\"team-button\"])[8]"));
							executor.executeScript("arguments[0].click();", odds01);
							//driver.findElement(cashoutpages.odds1).click();
							System.out.println("Clicked on Bet placing Button 1 !");
							Thread.sleep(2000);
							
							
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty10.png") ;
							test.log(LogStatus.PASS,"Click to Bet - Multi Bet(Inplay and Prematch Same Game)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
						}
					
						
					}
					
					catch(Exception f9)
					{
						f9.getMessage();
						System.out.println("Unable to Click on Odds 1 !");
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty10.png") ;
						test.log(LogStatus.FAIL,"Click to Bet - Multi Bet(Inplay and Prematch Same Game)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
					}
				}
				
				
				else if(TableTennis001 >= 1)
				{
					WebElement tabletennistab = driver.findElement(By.xpath("//*[text()='Table Tennis']"));
					executor.executeScript("arguments[0].click();", tabletennistab);
				    System.out.println("Table Tennis Game page opened !");
				    Thread.sleep(2000);
				    
				 // Place Multi Bet 
					
					try {
						
						boolean odds001 = driver.findElement(xpathpages.odds1).isEnabled();
						//boolean odds2 = driver.findElement(xpathpages.odds2).isEnabled();
						//boolean odds3 = driver.findElement(xpathpages.odds3).isEnabled();
						
						if(odds001 == true)
						{
							System.out.println("Odds1 is not suspended !");
							WebElement odds01 = driver.findElement(By.xpath("(//div[@class='team-button'])[4]"));
							executor.executeScript("arguments[0].click();", odds01);
							//driver.findElement(cashoutpages.odds1).click();
							System.out.println("Clicked on Bet placing Button 1 !");
							Thread.sleep(2000);
							
							//Open Pre-Match in Table Tennis Tab
						  	
						  	driver.findElement(xpathpages.Prematchtabletennis).click();
						  	System.out.println("Prematch games in table tennis is opened !");
						  	Thread.sleep(3000);
							
							WebElement odds02 = driver.findElement(By.xpath("(//div[@class='team-button'])[4]"));
							executor.executeScript("arguments[0].click();", odds02);
							//driver.findElement(cashoutpages.odds2).click();
							System.out.println("Clicked on Bet placing Button 2 !");
							Thread.sleep(2000);
							
							
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty10.png") ;
							test.log(LogStatus.PASS,"Click to Bet - Multi Bet(Inplay and Prematch Same Game)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
						}
						
						
						else
						{
							System.out.println("Odds1 and Odds2 are suspended, So clicking odds 3 !");
							WebElement odds03 = driver.findElement(By.xpath("(//div[@class='team-button'])[8]"));
							executor.executeScript("arguments[0].click();", odds03);
							//driver.findElement(cashoutpages.odds3).click();
							System.out.println("Clicked on Bet placing Button 3 !");
							Thread.sleep(2000);
							
							//Open Pre-Match in Table Tennis Tab
						  	
						  	driver.findElement(xpathpages.Prematchtabletennis).click();
						  	System.out.println("Prematch games in table tennis is opened !");
						  	Thread.sleep(3000);
							
							WebElement odds01 = driver.findElement(By.xpath("(//div[@class='team-button'])[8]"));
							executor.executeScript("arguments[0].click();", odds01);
							//driver.findElement(cashoutpages.odds1).click();
							System.out.println("Clicked on Bet placing Button 1 !");
							Thread.sleep(2000);
							
							
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty10.png") ;
							test.log(LogStatus.PASS,"Click to Bet - Multi Bet(Inplay and Prematch Same Game)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");}
					
						
					}
					
					catch(Exception f9)
					{
						f9.getMessage();
						System.out.println("Unable to Click on Odds 1 !");
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty10.png") ;
						test.log(LogStatus.FAIL,"Click to Bet - Multi Bet(Inplay and Prematch Same Game)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");}
				}
				
				
				else if(Soccer001 >= 1)
				{
					WebElement soccertab = driver.findElement(By.xpath("//*[text()='Soccer']"));
					executor.executeScript("arguments[0].click();", soccertab);
				    System.out.println("Soccer Game page opened !");
				    Thread.sleep(2000);
				    
				 // Place Multi Bet 
					
					try {
						
						boolean odds001 = driver.findElement(xpathpages.odds1).isEnabled();
						//boolean odds2 = driver.findElement(xpathpages.odds2).isEnabled();
						//boolean odds3 = driver.findElement(xpathpages.odds3).isEnabled();
						
						if(odds001 == true)
						{
							System.out.println("Odds1 is not suspended !");
							WebElement odds01 = driver.findElement(By.xpath("(//div[@class='team-button'])[4]"));
							executor.executeScript("arguments[0].click();", odds01);
							//driver.findElement(cashoutpages.odds1).click();
							System.out.println("Clicked on Bet placing Button 1 !");
							Thread.sleep(2000);
							
							//Open Pre-Match in Soccer Tab
						  	
						  	driver.findElement(xpathpages.Prematchsoccer).click();
						  	System.out.println("Prematch games in soccer is opened !");
						  	Thread.sleep(3000);
							
							WebElement odds02 = driver.findElement(By.xpath("(//div[@class='team-button'])[4]"));
							executor.executeScript("arguments[0].click();", odds02);
							//driver.findElement(cashoutpages.odds2).click();
							System.out.println("Clicked on Bet placing Button 2 !");
							Thread.sleep(2000);
							
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty10.png") ;
							test.log(LogStatus.PASS,"Click to Bet - Multi Bet(Inplay and Prematch Same Game)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
							
							
							
						}
												
						else
						{
							System.out.println("Odds1 and Odds2 are suspended, So clicking odds 3 !");
							WebElement odds03 = driver.findElement(By.xpath("(//div[@class='team-button'])[8]"));
							executor.executeScript("arguments[0].click();", odds03);
							//driver.findElement(cashoutpages.odds3).click();
							System.out.println("Clicked on Bet placing Button 3 !");
							Thread.sleep(2000);
							
							//Open Pre-Match in Soccer Tab
						  	
						  	driver.findElement(xpathpages.Prematchsoccer).click();
						  	System.out.println("Prematch games in soccer is opened !");
						  	Thread.sleep(3000);
							
							WebElement odds01 = driver.findElement(By.xpath("(//div[@class='team-button'])[12]"));
							executor.executeScript("arguments[0].click();", odds01);
							//driver.findElement(cashoutpages.odds1).click();
							System.out.println("Clicked on Bet placing Button 1 !");
							Thread.sleep(2000);
							
							
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty10.png") ;
							test.log(LogStatus.PASS,"Click to Bet - Multi Bet(Inplay and Prematch Same Game)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");}
					
						
					}
					
					catch(Exception f9)
					{
						f9.getMessage();
						System.out.println("Unable to Click on Odds 1 !");
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty10.png") ;
						test.log(LogStatus.FAIL,"Click to Bet - Multi Bet(Inplay and Prematch Same Game)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");}
				}
				
				
				else if(Basketball001 >= 1)
				{
					WebElement basketballtab = driver.findElement(By.xpath("//*[text()='Basketball']"));
					executor.executeScript("arguments[0].click();", basketballtab);
				    System.out.println("Basketball Game page opened !");
				    Thread.sleep(2000);
				    
				 // Place Multi Bet 
					
					try {
						
						boolean odds001 = driver.findElement(xpathpages.odds1).isEnabled();
						//boolean odds2 = driver.findElement(xpathpages.odds2).isEnabled();
						//boolean odds3 = driver.findElement(xpathpages.odds3).isEnabled();
						
						if(odds001 == true)
						{
							System.out.println("Odds1 is not suspended !");
							WebElement odds01 = driver.findElement(By.xpath("(//div[@class='team-button'])[4]"));
							executor.executeScript("arguments[0].click();", odds01);
							//driver.findElement(cashoutpages.odds1).click();
							System.out.println("Clicked on Bet placing Button 1 !");
							Thread.sleep(2000);
							
							//Open Pre-Match in basketball Tab
						  	
						  	driver.findElement(xpathpages.Prematchbasketball).click();
						  	System.out.println("Prematch games in basketball is opened !");
						  	Thread.sleep(3000);
							
							WebElement odds02 = driver.findElement(By.xpath("(//div[@class='team-button'])[4]"));
							executor.executeScript("arguments[0].click();", odds02);
							//driver.findElement(cashoutpages.odds2).click();
							System.out.println("Clicked on Bet placing Button 2 !");
							Thread.sleep(2000);
							
							
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty10.png") ;
							test.log(LogStatus.PASS,"Click to Bet - Multi Bet(Inplay and Prematch Same Game)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
					}
						
						
						else
						{
							System.out.println("Odds1 and Odds2 are suspended, So clicking odds 3 !");
							WebElement odds03 = driver.findElement(By.xpath("(//div[@class='team-button'])[8]"));
							executor.executeScript("arguments[0].click();", odds03);
							//driver.findElement(cashoutpages.odds3).click();
							System.out.println("Clicked on Bet placing Button 3 !");
							Thread.sleep(2000);
							
							//Open Pre-Match in basketball Tab
						  	
						  	driver.findElement(xpathpages.Prematchbasketball).click();
						  	System.out.println("Prematch games in basketball is opened !");
						  	Thread.sleep(3000);
						  	
							WebElement odds01 = driver.findElement(By.xpath("(//div[@class='team-button'])[8]"));
							executor.executeScript("arguments[0].click();", odds01);
							//driver.findElement(cashoutpages.odds1).click();
							System.out.println("Clicked on Bet placing Button 1 !");
							Thread.sleep(2000);
							
							
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty10.png") ;
							test.log(LogStatus.PASS,"Click to Bet - Multi Bet(Inplay and Prematch Same Game)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
						}
					
						
					}
					
					catch(Exception f9)
					{
						f9.getMessage();
						System.out.println("Unable to Click on Odds 1 !");
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty10.png") ;
						test.log(LogStatus.FAIL,"Click to Bet - Multi Bet(Inplay and Prematch Same Game)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
					}
				}
				
				
				else if(Volleyball001 >= 1)
				{
					WebElement volleyballtab = driver.findElement(By.xpath("//*[text()='Volleyball']"));
					executor.executeScript("arguments[0].click();", volleyballtab);
				    System.out.println("volleyball Game page opened !");
				    Thread.sleep(2000);
				    
				 // Place Multi Bet 
					
					try {
						
						boolean odds001 = driver.findElement(xpathpages.odds1).isEnabled();
						//boolean odds2 = driver.findElement(xpathpages.odds2).isEnabled();
						//boolean odds3 = driver.findElement(xpathpages.odds3).isEnabled();
						
						if(odds001 == true)
						{
							System.out.println("Odds1 is not suspended !");
							WebElement odds01 = driver.findElement(By.xpath("(//div[@class='team-button'])[4]"));
							executor.executeScript("arguments[0].click();", odds01);
							//driver.findElement(cashoutpages.odds1).click();
							System.out.println("Clicked on Bet placing Button 1 !");
							Thread.sleep(2000);
							
							//Open Pre-Match in volleyball Tab
						  	
						  	driver.findElement(xpathpages.Prematchvolleyball).click();
						  	System.out.println("Prematch games in volleyball is opened !");
						  	Thread.sleep(3000);
							
							WebElement odds02 = driver.findElement(By.xpath("(//div[@class='team-button'])[4]"));
							executor.executeScript("arguments[0].click();", odds02);
							//driver.findElement(cashoutpages.odds2).click();
							System.out.println("Clicked on Bet placing Button 2 !");
							Thread.sleep(2000);
							
							
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty10.png") ;
							test.log(LogStatus.PASS,"Click to Bet - Multi Bet(Inplay and Prematch Same Game)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
						}
						
						else
						{
							System.out.println("Odds1 and Odds2 are suspended, So clicking odds 3 !");
							WebElement odds03 = driver.findElement(By.xpath("(//div[@class='team-button'])[8]"));
							executor.executeScript("arguments[0].click();", odds03);
							//driver.findElement(cashoutpages.odds3).click();
							System.out.println("Clicked on Bet placing Button 3 !");
							Thread.sleep(2000);
							
							//Open Pre-Match in volleyball Tab
						  	
						  	driver.findElement(xpathpages.Prematchvolleyball).click();
						  	System.out.println("Prematch games in volleyball is opened !");
						  	Thread.sleep(3000);
							
							WebElement odds01 = driver.findElement(By.xpath("(//div[@class='team-button'])[8]"));
							executor.executeScript("arguments[0].click();", odds01);
							//driver.findElement(cashoutpages.odds1).click();
							System.out.println("Clicked on Bet placing Button 1 !");
							Thread.sleep(2000);
							
							
							baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty10.png") ;
							test.log(LogStatus.PASS,"Click to Bet - Multi Bet(Inplay and Prematch Same Game)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
							}
					
						
					}
					
					catch(Exception f9)
					{
						f9.getMessage();
						System.out.println("Unable to Click on Odds 1 !");
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty10.png") ;
						test.log(LogStatus.FAIL,"Click to Bet - Multi Bet(Inplay and Prematch Same Game)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");	
						}
				}
				
				
				//Enter Stake
				

				try {
				
				driver.findElement(xpathpages.stakeamount).click();
				System.out.println("Stake amount is entered !");
				Thread.sleep(1500);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty11.png") ;
				test.log(LogStatus.PASS,"Enter Stake", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty11.png'target=\\\"_blank\\  >Click Here</a>");
				}
				catch(Exception f10)
				{
					System.out.println("Unable to Enter Stake amount");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty11.png") ;
					test.log(LogStatus.FAIL,"Enter Stake", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty11.png'target=\\\"_blank\\  >Click Here</a>");
				}
				

				
				//Click Submit to place bet
				
				try {
					
				WebElement submitbet = driver.findElement(By.className("multibet_submit_btn"));
				executor.executeScript("arguments[0].click();", submitbet);
				//driver.findElement(xpathpages.submitbet).click();
				System.out.println("Submit to place bet is clicked !");
				Thread.sleep(4000);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty12.png") ;
				test.log(LogStatus.PASS,"Submit Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty12.png'target=\\\"_blank\\  >Click Here</a>");
				}
				catch(Exception f12)
				{
					System.out.println("Unable to Click Submit !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty12.png") ;
					test.log(LogStatus.PASS,"Submit Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty12.png'target=\\\"_blank\\  >Click Here</a>");
				}				
				
				
				//Place Multi Bet in Same Market 
				
				
				//Open Livenow in Sportsbook
			  	
				executor.executeScript("arguments[0].click();", livenow1);
				System.out.println("Live Now page Opened !");
				
				//Open any Event / Match
				
				//Open the First game in Live now
			
				wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.openscore));
			  	driver.findElement(xpathpages.openscore).click();
			  	System.out.println("Game Opened !");
			  	Thread.sleep(2000);
			  	
			  	//Place Multi Bet
			  	
			  	try {
					
					boolean odds01 = driver.findElement(xpathpages.odds1).isEnabled();
					//boolean odds2 = driver.findElement(xpathpages.odds2).isEnabled();
					//boolean odds3 = driver.findElement(xpathpages.odds3).isEnabled();
					
					if(odds01 == true)
					{
						System.out.println("Odds1 is not suspended !");
						WebElement odds001 = driver.findElement(By.xpath("(//div[@class='winnerTeamName'])[1]"));
						executor.executeScript("arguments[0].click();", odds001);
						//driver.findElement(cashoutpages.odds1).click();
						System.out.println("Clicked on Bet placing Button 1 !");
						Thread.sleep(2000);
						
						
						
						WebElement odds02 = driver.findElement(By.xpath("(//div[@class='winnerTeamName'])[2]"));
						executor.executeScript("arguments[0].click();", odds02);
						//driver.findElement(cashoutpages.odds2).click();
						System.out.println("Clicked on Bet placing Button 2 !");
						Thread.sleep(2000);
						
						
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty13.png") ;
						test.log(LogStatus.PASS,"Click to Bet - Multi Bet(Same Market)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty13.png'target=\\\"_blank\\  >Click Here</a>");
					}
					
					else
					{
						System.out.println("Odds1 and Odds2 are suspended, So clicking odds 3 !");
						WebElement odds03 = driver.findElement(By.xpath("(//div[@class='winnerTeamName'])[1]"));
						executor.executeScript("arguments[0].click();", odds03);
						//driver.findElement(cashoutpages.odds3).click();
						System.out.println("Clicked on Bet placing Button 3 !");
						Thread.sleep(2000);
						
						
						WebElement odds021 = driver.findElement(By.xpath("(//div[@class='winnerTeamName'])[2]"));
						executor.executeScript("arguments[0].click();", odds021);
						//driver.findElement(cashoutpages.odds1).click();
						System.out.println("Clicked on Bet placing Button 1 !");
						Thread.sleep(2000);
						
						
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty13.png") ;
						test.log(LogStatus.PASS,"Click to Bet - Multi Bet(Same Market)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty13.png'target=\\\"_blank\\  >Click Here</a>");
						}
				
					
				}
				
				catch(Exception f9)
				{
					f9.getMessage();
					System.out.println("Unable to Click on Odds 1 !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty13.png") ;
					test.log(LogStatus.FAIL,"Click to Bet - Multi Bet(Same Market)", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty13.png'target=\\\"_blank\\  >Click Here</a>");	
					}
			  	
			  	
			  	//Close the Event page
			  	
			  	wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.closeevent));
			    driver.findElement(xpathpages.closeevent).click();
			    System.out.println("Event is Closed !");
			  	
					
			
			  	//Verify Error Display
				
				try {
				wait02.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.oddssame1));
				boolean a093 = driver.findElement(xpathpages.oddssame1).isDisplayed();
				if(a093 == true)
				{
				System.out.println("Same Market Error Verified!");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty14.png") ;
				
				
				test.log(LogStatus.PASS,"Same Market Error - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty14.png'target=\\\"_blank\\  >Click Here</a>");
				}
				else
				{
					System.out.println("Same Market Error Verified! - FAIL");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty14.png") ;
					
					
					test.log(LogStatus.FAIL,"Same Market Error - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty14.png'target=\\\"_blank\\  >Click Here</a>");
				}
				}
				catch(Exception f9)
				{
					f9.getMessage();
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\functionactions\\qwerty14.png") ;
					
					
					test.log(LogStatus.FAIL,"Same Market Error - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/functionactions/qwerty14.png'target=\\\"_blank\\  >Click Here</a>");

					
				}

				
				//Switching to Parent Frame
			  	
			  	driver.switchTo().parentFrame();
			  	System.out.println("Switched to Parent Frame !");
			  	
			  	
				
				driver.close();
				System.out.println("Browser is closed !");
			  	
			 
			 
			  	
			  
			  	
				
				
			
	}

	
		
	}


