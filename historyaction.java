package Actions;

import java.io.FileInputStream;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.support.ui.Select;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.awt.Robot;	
import java.awt.event.KeyEvent;
import Pages.xpathpages;
import source_sports.baseclass;

public class historyaction extends baseclass {
	@Test
	
	public static void historyvalidation() throws Throwable  {
		//public static WebDriver driver = null;
		
		baseclass.invoke();
		
		FileInputStream fis = new FileInputStream("D:\\workspace\\SATBET_SPORTS_PROD\\SatbetSportsProdExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		test = report.startTest("Transaction History / Game History");
		
		
		//Click Login for New User
		
		WebDriverWait wait1 = new WebDriverWait(driver,60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.loginbutton));
		driver.findElement(xpathpages.loginbutton).click();
		System.out.println("Login Button is clicked for new User !");
		
		
		//Enter User name
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.username));
		Row row11 = sheet.getRow(1);
		Cell cell11 = row11.getCell(2);
		String cellval11 = cell11.getStringCellValue();
		driver.findElement(xpathpages.username).sendKeys(cellval11);
		System.out.println("User name is Entered");
	
		//Enter Password
	
		wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.password));
		Row row12 = sheet.getRow(2);
		Cell cell12 = row12.getCell(2);
		String cellval12 = cell12.getStringCellValue();
		driver.findElement(xpathpages.password).sendKeys(cellval12);	
		System.out.println("Password is Entered");
			
		
		//Click Submit
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.submit));
		driver.findElement(xpathpages.submit).click();
		System.out.println("Submit button is clicked !");
		
		
		//Open Deposit page
		
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.deposit));
		driver.findElement(xpathpages.deposit).click();
		System.out.println("Deposit button is clicked !");
		
		
		/*
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_MINUS);
		
		Thread.sleep(1000);
		
		*/
		//Open Transaction History page
		
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.transactionhistory));
		driver.findElement(xpathpages.transactionhistory).click();
		System.out.println("Transaction History page is Opened !");
		
		//Verify Transaction History
		
		try {
		wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.verifytranshist));
		boolean a093 = driver.findElement(xpathpages.verifytranshist).isDisplayed();
		if(a093 == true)
		{
		System.out.println("Transaction History Verified!");
		baseclass.takeSnapShot(driver, "D:\\workspace\\BOLLYBET_SPORTS_PROD\\FailedTestsScreenshots\\historyactions\\qwerty1.png") ;
		
		
		test.log(LogStatus.PASS,"Transaction History - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/BOLLYBET_SPORTS_PROD/FailedTestsScreenshots/historyactions/qwerty1.png'target=\\\"_blank\\  >Click Here</a>");
		}
		else
		{
			System.out.println("Transaction History Verified! - FAIL");
			baseclass.takeSnapShot(driver, "D:\\workspace\\BOLLYBET_SPORTS_PROD\\FailedTestsScreenshots\\historyactions\\qwerty1.png") ;
			
			
			test.log(LogStatus.FAIL,"Transaction History - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/BOLLYBET_SPORTS_PROD/FailedTestsScreenshots/historyactions/qwerty1.png'target=\\\"_blank\\  >Click Here</a>");
		}
		}
		catch(Exception f9)
		{
			f9.getMessage();
			System.out.println("Transaction History Verified! - Unable to Execute");
			baseclass.takeSnapShot(driver, "D:\\workspace\\BOLLYBET_SPORTS_PROD\\FailedTestsScreenshots\\historyactions\\qwerty1.png") ;
			
			
			test.log(LogStatus.FAIL,"Transaction History - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/BOLLYBET_SPORTS_PROD/FailedTestsScreenshots/historyactions/qwerty1.png'target=\\\"_blank\\  >Click Here</a>");

			
		}
		
		
		//Open Game History page
		
		
			wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.gamehistory));
			driver.findElement(xpathpages.gamehistory).click();
			System.out.println("Game History page is Opened !");
			
			/*
		//Select Sports from Dropdown
			
			wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.gamehistdrop));
			Select select01 = new Select(driver.findElement(xpathpages.gamehistdrop));
			select01.selectByVisibleText("Sports");
			Thread.sleep(3000);
			System.out.println("Sports is selected in Dropdown !");
			
		//Click Search Button
			
			wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.search));
			driver.findElement(xpathpages.search).click();
			System.out.println("Search is Clicked !");
			
			*/
		
		//Verify Game History
			
			try {
			wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.verifygamehist));
			boolean a093 = driver.findElement(xpathpages.verifygamehist).isDisplayed();
			if(a093 == true)
			{
			System.out.println("Game History Verified!");
			baseclass.takeSnapShot(driver, "D:\\workspace\\BOLLYBET_SPORTS_PROD\\FailedTestsScreenshots\\historyactions\\qwerty2.png") ;
			
			
			test.log(LogStatus.PASS,"Game History - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/BOLLYBET_SPORTS_PROD/FailedTestsScreenshots/historyactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
			}
			else
			{
				System.out.println("Game History Verified! - FAIL");
				baseclass.takeSnapShot(driver, "D:\\workspace\\BOLLYBET_SPORTS_PROD\\FailedTestsScreenshots\\historyactions\\qwerty2.png") ;
				
				
				test.log(LogStatus.FAIL,"Game History - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/BOLLYBET_SPORTS_PROD/FailedTestsScreenshots/historyactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
			}
			}
			catch(Exception f9)
			{
				f9.getMessage();
				System.out.println("Game History Verified! - Unable to Execute");
				baseclass.takeSnapShot(driver, "D:\\workspace\\BOLLYBET_SPORTS_PROD\\FailedTestsScreenshots\\historyactions\\qwerty2.png") ;
				
				
				test.log(LogStatus.FAIL,"Game History - Verify", "To open Screenshots : <a href= 'file:///D:/workspace/BOLLYBET_SPORTS_PROD/FailedTestsScreenshots/historyactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");

				
			}
			
			
			//Switching to Parent Frame
		  	
		  	driver.switchTo().parentFrame();
		  	System.out.println("Switched to Parent Frame !");
		  	
		  	//Logout Button is clicked
			
			try {
			driver.findElement(xpathpages.logoutbutton1).click();
			System.out.println("Logout button is clicked !");
		
			
			}
			catch(Exception f14)
			{
				System.out.println("Unable to click Logout button !");
			
			}
			
			//Confirm Logout
			
			try {
			
				
			boolean logsuc = driver.findElement(xpathpages.logoutbutton2).isDisplayed();
			if (logsuc == true)
			{
			System.out.println("Logout Success !");
			
			Thread.sleep(2000);
			
			}
			else {
				
				System.out.println("Logout Success !");
				
			}
			}
			catch(Exception f15)
			{
				f15.getMessage();
			}
			
			driver.close();
			System.out.println("Browser is closed !");
		
			
	
		         
			
		
	}
}

