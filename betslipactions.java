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
import org.openqa.selenium.JavascriptExecutor;
import source_sports.baseclass;
import Pages.xpathpages;



public class betslipactions extends baseclass {
	@Test
	
	public static void betslip() throws Throwable  {
		//public static WebDriver driver = null;
		
		baseclass.invoke();
		
		//For Excel Read
		
		FileInputStream fis = new FileInputStream("D:\\workspace\\SATBET_SPORTS_PROD\\SatbetSportsProdExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		test = report.startTest("Bet Slip Actions");
		
		String SBetname01 = null;
		String SBetname02 = null;
		String Betslipname1 = null;
		String Betslipname2 = null;
		
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
				
		
		//Verify if Bet Slip is Empty
			
			try {		
			WebElement emptybetslip = driver.findElement(By.xpath("//*[@id=\"commonbetslips\"]/app-single-bet-container/div/div/div"));
			String A1 = emptybetslip.getText();
			System.out.println(A1);
			String Expected1 = "BET SLIP IS EMPTY.";
			if(Expected1.equals(A1))
			{
			System.out.println("Bet Slip is Empty before any Bets Are Placed !");
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty1.png") ;
			
			test.log(LogStatus.PASS,"Verify if Bet Slip is Empty", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty1.png'target=\\\"_blank\\  >Click Here</a>");
			Thread.sleep(1000);
			
			}
			else {
				System.out.println("Bet Slip is not Empty before any Bets Are Placed !");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty1.png") ;
				
				test.log(LogStatus.FAIL,"Verify if Bet Slip is Empty", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty1.png'target=\\\"_blank\\  >Click Here</a>");
			}
			}
			catch(Exception f1)
			{
				f1.getMessage();
			}
			
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
					WebElement Betname01 = driver.findElement(By.xpath(("(//div[@class=\"teamName\"])[2]")));
					SBetname01 = Betname01.getText();
					System.out.println(SBetname01);
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty2.png") ;
					test.log(LogStatus.PASS,"Click to Bet - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
					
				}
				
				else
				{
					System.out.println("Odds1 and Odds2 are suspended, So clicking odds 3 !");
					driver.findElement(xpathpages.odds3).click();
					System.out.println("Clicked on Bet placing Button 3 !");
					Thread.sleep(2000);
					WebElement Betname01 = driver.findElement(By.xpath(("(//div[@class=\"teamName\"])[6]")));
					SBetname01 = Betname01.getText();
					System.out.println(SBetname01);
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty2.png") ;
					
					test.log(LogStatus.PASS,"Click to Bet - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
			}
			
			catch(Exception f9)
			{
				f9.getMessage();
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty2.png") ;
				
				test.log(LogStatus.FAIL,"Click to Bet - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
			/*
			//Verify if Game Names Match
			
			try {
				Betslipname1 = driver.findElement(By.className("outcomeName")).getText();
				System.out.println(Betslipname1);
				if(Betslipname1.contains(SBetname01))
				{
					System.out.println("Game Name Matches - Single Bet - Verified !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty4.png") ;
					
					test.log(LogStatus.PASS,"Game Name Matches - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty4.png'target=\\\"_blank\\  >Click Here</a>");
				}
				else
				{
					System.out.println("Game Name Matches - Single Bet - Failed !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty4.png") ;
					
					test.log(LogStatus.FAIL,"Game Name Matches - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty4.png'target=\\\"_blank\\  >Click Here</a>");
				}
			
			}
			catch(Exception f4)
			{
				System.out.println("Game Name Matches - Single Bet - Failed !");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty4.png") ;
				
				test.log(LogStatus.FAIL,"Game Name Matches - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty4.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
			*/
			
		//Check if Close Button is working in Betslip for Single Bet
			
			try {
			WebDriverWait wait01 = new WebDriverWait(driver,30);
			driver.findElement(By.className("bet_close")).click();
			System.out.println("Single Bet - Betslip is closed !");
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty3.png") ;
			
			test.log(LogStatus.PASS,"Click Close BetSlip - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty3.png'target=\\\"_blank\\  >Click Here</a>");
			Thread.sleep(2000);	
			}
			catch(Exception f3)
			{
				f3.getMessage();
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty3.png") ;
				
				test.log(LogStatus.FAIL,"Click Close BetSlip - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty3.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
		
		
	    //Verify Bet Slip - Close
		  	
			try {
				WebElement emptybetslip = driver.findElement(By.xpath("//*[@id=\"commonbetslips\"]/app-single-bet-container/div/div/div"));
				String A3 = emptybetslip.getText();
				System.out.println(A3);
				String Expected1 = "BET SLIP IS EMPTY.";
				if(Expected1.equals(A3))
			{
			System.out.println("Bet Slip - Single Bet is Closed - Verified !");
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty5.png") ;
			
			test.log(LogStatus.PASS,"Verify Close Bet Slip - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty5.png'target=\\\"_blank\\  >Click Here</a>");
			Thread.sleep(2000);
			}
			else
			{
				System.out.println("Bet Slip - Single Bet is Closed - Failed !");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty5.png") ;
				
				test.log(LogStatus.FAIL,"Verify Close Bet Slip - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty5.png'target=\\\"_blank\\  >Click Here</a>");
			}
			}
			catch(Exception f5)
			{
				f5.getMessage();
				System.out.println("Bet Slip - Single Bet is Closed - Failed !");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty5.png") ;
				
				test.log(LogStatus.FAIL,"Verify Close Bet Slip - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty5.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
			//Place MultiBet
			
			try {
				
				boolean odds1 = driver.findElement(xpathpages.odds1).isEnabled();
				//boolean odds2 = driver.findElement(xpathpages.odds2).isEnabled();
				//boolean odds3 = driver.findElement(xpathpages.odds3).isEnabled();
				
				if(odds1 == true)
				{
					System.out.println("Odds1 is not suspended !");
					driver.findElement(xpathpages.odds1).click();
					System.out.println("Click to MultiBet 1 - in Live Game 1");
					Thread.sleep(2000);
					WebElement Betname01 = driver.findElement(By.xpath(("(//div[@class=\"teamName\"])[2]")));
					SBetname01 = Betname01.getText();
					System.out.println(SBetname01);
					
					
					
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty6.png") ;
					test.log(LogStatus.PASS,"Click to MultiBet 1 - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty6.png'target=\\\"_blank\\  >Click Here</a>");
					
				}
				
				
				else
				{
					System.out.println("Odds1 and Odds2 are suspended, So clicking odds 3 !");
					driver.findElement(xpathpages.odds3).click();
					System.out.println("Click to MultiBet 1 - in Live Game 3");
					Thread.sleep(2000);
					WebElement Betname01 = driver.findElement(By.xpath(("(//div[@class=\"teamName\"])[6]")));
					SBetname01 = Betname01.getText();
					System.out.println(SBetname01);
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty6.png") ;
					
					test.log(LogStatus.PASS,"Click to MultiBet 1 - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty6.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
			}
			
			catch(Exception f9)
			{
				f9.getMessage();
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty6.png") ;
				
				test.log(LogStatus.FAIL,"Click to MultiBet 1 - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty6.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
			
			//Switch to any Sport with Live Games
			
			try {
			
			String Tennis = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[3]")).getText();
			Tennis = Tennis.replaceAll("[^0-9]", " ");
			Tennis = Tennis.trim();
			Tennis = Tennis.replaceAll(" + ", " ");
			System.out.println(Tennis);
			int Tennis1 =Integer.parseInt(Tennis);
			System.out.println(Tennis1);
			
			String TableTennis = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[4]")).getText();
			TableTennis = TableTennis.replaceAll("[^0-9]", " ");
			TableTennis = TableTennis.trim();
			TableTennis = TableTennis.replaceAll(" + ", " ");
			System.out.println(TableTennis);
			int TableTennis1 =Integer.parseInt(TableTennis);
			System.out.println(TableTennis1);
			
			if(Tennis1 > 1)
			{
				//Scroll to See Tennis on top
				
				WebElement tennistab = driver.findElement(By.xpath("//*[text()='Tennis']"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", tennistab);
			    System.out.println("Tennis Game page opened !");
			    Thread.sleep(2000);
			   
			}
			
			else if (TableTennis1 > 1)
				
			{
				//Scroll to See Table Tennis on top
				
				WebElement tabletennistab = driver.findElement(By.xpath("//*[text()='Table Tennis']"));
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", tabletennistab);
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", tabletennistab);
			    System.out.println("Table Tennis Game page opened !");
			    Thread.sleep(2000);
			    
			    
			}
			
			else
				
			{
				//Scroll to See Cricket on top
				
				WebElement crickettab = driver.findElement(By.xpath("//*[text()='Cricket']"));
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", crickettab);
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", crickettab);
			    System.out.println("cricket Game page opened !");
			    Thread.sleep(2000);
			}
			
			}
			catch(Exception f10)
			{
				f10.getMessage();
				
				System.out.println("Unable to Switch Between Available Sports");
			}
			
			
			//Clicking for Multibet 2
			
			try {
				
				boolean odds1 = driver.findElement(xpathpages.odds1).isEnabled();
				//boolean odds2 = driver.findElement(xpathpages.odds2).isEnabled();
				//boolean odds3 = driver.findElement(xpathpages.odds3).isEnabled();
				
				if(odds1 == true)
				{
					System.out.println("Odds1 is not suspended !");
					driver.findElement(xpathpages.odds1).click();
					System.out.println("Click to MultiBet 2 - in Live Game 1");
					Thread.sleep(2000);
					WebElement Betname01 = driver.findElement(By.xpath(("(//div[@class='teamName'])[4]")));
					SBetname02 = Betname01.getText();
					System.out.println(SBetname02);
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty7.png") ;
					test.log(LogStatus.PASS,"Click to MultiBet 2 - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty7.png'target=\\\"_blank\\  >Click Here</a>");
					
				}
				
				
				else
				{
					System.out.println("Odds1 and Odds2 are suspended, So clicking odds 3 !");
					driver.findElement(xpathpages.odds3).click();
					System.out.println("Click to MultiBet 2 - in Live Game 3");
					Thread.sleep(2000);
					WebElement Betname01 = driver.findElement(By.xpath(("(//div[@class='teamName'])[4]")));
					SBetname02 = Betname01.getText();
					System.out.println(SBetname02);
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty7.png") ;
					
					test.log(LogStatus.PASS,"Click to MultiBet 2 - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty7.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
			}
			
			catch(Exception f9)
			{
				f9.getMessage();
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty7.png") ;
				
				test.log(LogStatus.FAIL,"Click to MultiBet 2 - in Live Game", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty7.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
			/*
			//Verify if Game Names Match for MultiBet
			
			try {
				Betslipname1 = driver.findElement(By.xpath("(//div[@class=\"outcomeName\"])[1]")).getText();
				System.out.println(Betslipname1);
				Betslipname2 = driver.findElement(By.xpath("(//div[@class=\"outcomeName\"])[2]")).getText();
				System.out.println(Betslipname2);
				if(Betslipname1.contains(SBetname02) || Betslipname2.contains(SBetname01))
				{
					System.out.println("Game Name Matches - Multi Bet - Verified !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty8.png") ;
					
					test.log(LogStatus.PASS,"Game Name Matches - Multi Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty8.png'target=\\\"_blank\\  >Click Here</a>");
				}
				else
				{
					System.out.println("Game Name Matches - Multi Bet - Failed !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty8.png") ;
					
					test.log(LogStatus.FAIL,"Game Name Matches - Multi Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty8.png'target=\\\"_blank\\  >Click Here</a>");
				}
			
			}
			catch(Exception f4)
			{
				System.out.println("Game Name Matches - Multi Bet - Failed !");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty8.png") ;
				
				test.log(LogStatus.FAIL,"Game Name Matches - Multi Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty8.png'target=\\\"_blank\\  >Click Here</a>");
			}
			*/
			
			
			//Check if Close Button is working in Betslip for Multi Bet
			
			try {
			WebDriverWait wait01 = new WebDriverWait(driver,30);
			wait01.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.closemultibetslip1));
			driver.findElement(xpathpages.closemultibetslip1).click();
			System.out.println("Multi Bet - Betslip is closed 1 !");
			Thread.sleep(2000);
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty9.png") ;
			
			test.log(LogStatus.PASS,"Click Close BetSlip - Multi Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty9.png'target=\\\"_blank\\  >Click Here</a>");	
			
			
			}
			catch(Exception f3)
			{
				f3.getMessage();
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\betslipactions\\qwerty9.png") ;
				
				test.log(LogStatus.FAIL,"Click Close BetSlip - Multi Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/betslipactions/qwerty9.png'target=\\\"_blank\\  >Click Here</a>");
			}
			
				
		  	 //Switching to Parent Frame
		  	
		  	driver.switchTo().parentFrame();
		  	System.out.println("Switched to Parent Frame !");
		  	
		  
			
			driver.close();
			System.out.println("Browser is closed !");
			
	
	
	}
}
