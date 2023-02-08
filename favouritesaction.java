package Actions;

import org.openqa.selenium.By;
import java.io.FileInputStream;
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
import source_sports.baseclass;
import Pages.xpathpages;



public class favouritesaction extends baseclass{

	@Test
	
	public static void favourites() throws Throwable {
		
		baseclass.invoke();
		
		//For Excel Read
		
		FileInputStream fis = new FileInputStream("D:\\workspace\\SATBET_SPORTS_PROD\\SatbetSportsProdExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		test = report.startTest("Favourites");
		
		
		String A = null;
		String Prematchtoday2 = null;
		String Prematchtoday3 = null;
		//Click Login for New User
		
		try {
		driver.findElement(xpathpages.loginbutton).click();
		System.out.println("Login Button is clicked for new User !");
		Thread.sleep(4000);
		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty1.png") ;
		
		test.log(LogStatus.PASS,"Click Login Button", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty1.png'target=\\\"_blank\\  >Click Here</a>");
		}
		catch(Exception f1)
		{
			f1.getMessage();
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty1.png") ;
			
			test.log(LogStatus.FAIL,"Click Login Button", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty1.png'target=\\\"_blank\\  >Click Here</a>");
		}
		
		
		//Enter User name
		
		try {
		Row row11 = sheet.getRow(1);
		Cell cell11 = row11.getCell(2);
		String cellval11 = cell11.getStringCellValue();
		driver.findElement(xpathpages.username).sendKeys(cellval11);
		Thread.sleep(4000);
		System.out.println("User name is Entered");
		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty2.png") ;
		
		test.log(LogStatus.PASS,"Enter User name", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
		}
		
		catch(Exception f2)
		{
			f2.getMessage();
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty2.png") ;
			
			test.log(LogStatus.FAIL,"Enter User name", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
		}
	
		
		//Enter Password
		
		try {
		Row row12 = sheet.getRow(2);
		Cell cell12 = row12.getCell(2);
		String cellval12 = cell12.getStringCellValue();
		driver.findElement(xpathpages.password).sendKeys(cellval12);
		Thread.sleep(2000);	
		System.out.println("Password is Entered");
		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty3.png") ;
		
		test.log(LogStatus.PASS,"Enter Password", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty3.png'target=\\\"_blank\\  >Click Here</a>");	
		}
		catch(Exception f3)
		{
			f3.getMessage();
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty3.png") ;
			
			test.log(LogStatus.FAIL,"Enter Password", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty3.png'target=\\\"_blank\\  >Click Here</a>");	
			
		}
		
		//Click Submit
		
		try {
		driver.findElement(xpathpages.submit).click();
		System.out.println("Submit button is clicked !");
		Thread.sleep(7000);	
		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty4.png") ;
		
		test.log(LogStatus.PASS,"Click Submit", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty4.png'target=\\\"_blank\\  >Click Here</a>");	
		}
		catch(Exception f4)
		{
			f4.getMessage();
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty4.png") ;
			
			test.log(LogStatus.FAIL,"Click Submit", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty4.png'target=\\\"_blank\\  >Click Here</a>");	
		}
		
		
		
		//Open Sportsbook page
		
		try {
		driver.findElement(xpathpages.sportsbookpage).click();
		System.out.println("Sportsbook is opened !");
		Thread.sleep(8000);
		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty6.png") ;
		
		test.log(LogStatus.PASS,"Open Sportsbook page", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty6.png'target=\\\"_blank\\  >Click Here</a>");	
		}
		catch(Exception f6)
		{
			f6.getMessage();
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty6.png") ;
			
			test.log(LogStatus.FAIL,"Open Sportsbook page", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty6.png'target=\\\"_blank\\  >Click Here</a>");
			
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
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty7.png") ;
				
				test.log(LogStatus.PASS,"Switch to Sports iFrame", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty7.png'target=\\\"_blank\\  >Click Here</a>");	
			} 
				else 
				{
				System.out.println("Unable to navigate to frame with element "+ frameElement);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty7.png") ;
				
				test.log(LogStatus.FAIL,"Switch to Sports iFrame", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty7.png'target=\\\"_blank\\  >Click Here</a>");
			}	
				
		}
		catch(Exception f7)
		{
			f7.getMessage();
		}
			
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_MINUS);
		
		
		//Click on Favourite in Live Now Match
		
		try {
			
		driver.findElement(xpathpages.favouriteinlivenow).click();
		System.out.println("Favourite is Clicked in Live Now Match !");
		Thread.sleep(2000);
		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty8.png") ;
		
		test.log(LogStatus.PASS,"Click on Favourite in Live Now", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty8.png'target=\\\"_blank\\  >Click Here</a>");
		
		A = driver.findElement(xpathpages.favouriteinlivenowname).getText();
		System.out.println(A);
		Thread.sleep(2000);
		
		}
		catch(Exception f8)
		{
			System.out.println("Unable to click Favourite in Live Now Match !");
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty8.png") ;
			
			test.log(LogStatus.FAIL,"Click on Favourite in Live Now", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty8.png'target=\\\"_blank\\  >Click Here</a>");
		}
	
		//Open Favourites tab
		
		try {
		driver.findElement(xpathpages.openfavouritestab).click();
		System.out.println("Favourites Tab is opened !");
		Thread.sleep(2000);
		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty9.png") ;
		
		test.log(LogStatus.PASS,"Open Favourites tab", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty9.png'target=\\\"_blank\\  >Click Here</a>");
		
		
		}
		catch(Exception f9)
		{
			System.out.println("Unable to open Favourites Tab !");
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty9.png") ;
			
			test.log(LogStatus.FAIL,"Open Favourites tab", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty9.png'target=\\\"_blank\\  >Click Here</a>");
		}
		
		
		//Verify if that name of game is matching in Favourites page
		
		try {
		String B = driver.findElement(xpathpages.favouriteinlivenowname2).getText();
		System.out.println(B);
		Thread.sleep(3000);
		if(A.equals(B))
		{
			
		System.out.println("Game Names Match");
		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty10.png") ;
		
		test.log(LogStatus.PASS,"Game Name Match - Live ", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
		}
		else
		{
			System.out.println("Game Names does not Match");
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty10.png") ;
			
			test.log(LogStatus.FAIL,"Game Name Match - Live ", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
		}
		}
		catch(Exception f10)
		{
			f10.getMessage();
			System.out.println("Favourite not selected , So Verification 1 Failed");
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty10.png") ;
			
			test.log(LogStatus.FAIL,"Verify if Game Name Match ", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
		}
		
		
		//Click on Un -Select Favourite Set in Live Now Match
		
		try {
		driver.findElement(xpathpages.favouriteinlivenow).click();
		System.out.println("Un - Favourite is Clicked in Live Now Match !");
		Thread.sleep(2000);
		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty11.png") ;
		
		test.log(LogStatus.PASS,"Un -Select Favourite in Live Match", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty11.png'target=\\\"_blank\\  >Click Here</a>");
		
		}
		catch(Exception f11)
		{
			System.out.println("unable to click Un - Favourite in Live Now Match !");
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty11.png") ;
			
			test.log(LogStatus.FAIL,"Un -Select Favourite in Live Match", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty11.png'target=\\\"_blank\\  >Click Here</a>");
		}
		 
		 
		//Verify if Un-Favourite is Working
		
		try {
		String Expected1 = "No events are available.";
		String C = driver.findElement(xpathpages.noeventavailable).getText();
		System.out.println(C);
		if(Expected1.equals(C))
		{
			System.out.println("Un-Favourite Working Fine !");
			Thread.sleep(2000);
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty12.png") ;
			
			test.log(LogStatus.PASS,"Verify if Un-Favourite is Working", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty12.png'target=\\\"_blank\\  >Click Here</a>");
		}
		
		else
		{
			System.out.println("Un-Favourite is not Working !");
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty12.png") ;
			
			test.log(LogStatus.FAIL,"Verify if Un-Favourite is Working", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty12.png'target=\\\"_blank\\  >Click Here</a>");
		}
		
		
		}
		catch(Exception f12)
		{
			System.out.println("Un-Favourite is not Working !");
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty12.png") ;
			
			test.log(LogStatus.FAIL,"Verify if Un-Favourite is Working", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty12.png'target=\\\"_blank\\  >Click Here</a>");
		}
		
		
		
		//Scroll to See Cricket on top
		
		try
		{
		WebElement crickettab = driver.findElement(By.xpath("//*[text()='Cricket']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", crickettab);
	    System.out.println("cricket Game page opened !");
	    Thread.sleep(2000);
	   
		}
		catch(Exception f14)
		{
			System.out.println("Unable to open cricket Game !");
			f14.getMessage();
		}
		
		

		
	  //Open Pre-Match in cricket
		
		try {
	  	driver.findElement(xpathpages.Prematchtennis).click();
	  	System.out.println("Prematch games - Today in cricket is opened !");
	  	Thread.sleep(2000);
		}
		catch(Exception f15)
		{
			System.out.println("Unable to Open Prematch games - Today in cricket !");
		}
		
	  	
	  //Verify if Today matches are available
	  	
		try {
	  	if(driver.findElement(xpathpages.noeventavailable).isDisplayed())
		  {
			  System.out.println("Today Prematch Games are not available !");
		  }
	  
	  	else
	  	{
	  	
	  //Click on Favourite in pre Match Today
		
	  	try {
	  	driver.findElement(xpathpages.favouriteinlivenow).click();
	  	System.out.println("Favourite is Clicked in Today - Prematch !");
	  	Thread.sleep(2000);
	  	baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty13.png") ;
		
		test.log(LogStatus.PASS,"Favourite - Pre Match Today", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty13.png'target=\\\"_blank\\  >Click Here</a>");
	  	}
	  	catch(Exception f13)
	  	{
	  		f13.getMessage();
	  		System.out.println("Unable to Click Favourite in Today - Prematch !");
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty13.png") ;
			
			test.log(LogStatus.FAIL,"Favourite - Pre Match Today", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty13.png'target=\\\"_blank\\  >Click Here</a>");
	  	}
	  	
	  	String Prematchtoday1 = driver.findElement(xpathpages.favouriteinlivenowname).getText();
	  	System.out.println(Prematchtoday1);
	  	Thread.sleep(2000);
	  	
	  //Open Favourites tab
		
	  	driver.findElement(xpathpages.openfavouritestab).click();
	  	System.out.println("Favourites Tab is opened !");
	  	Thread.sleep(2000);
	  	
	  //Open Pre-Match - Today in Favourites Tab
		
	  	driver.findElement(xpathpages.Prematchfav).click();
	  	System.out.println("Pre-Match - Today in Favourites Tab is opened !");
	  	Thread.sleep(2000);
	  	
	  //Verify if that name of game is matching in Favourites page
		
	  	try {
	  		
	  	String C2 = driver.findElement(xpathpages.favouriteinprematchname1).getText();
	  	System.out.println(C2);
	  	Thread.sleep(2000);
	  	
	  	if(C2.equals(Prematchtoday1))
	  	{
	  		
	  	System.out.println("Game Names Match for Pre-Match - Today");
	  	baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty14.png") ;
		
		test.log(LogStatus.PASS,"Game Name Match - Prematch - Today", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty14.png'target=\\\"_blank\\  >Click Here</a>");
	  	
	  	}
	  	else
	  	{
	  		System.out.println("Game Names do not Match for Pre-Match - Today");
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty14.png") ;
			
			test.log(LogStatus.FAIL,"Game Name Match - Prematch - Today", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty14.png'target=\\\"_blank\\  >Click Here</a>");
	  	}
	  	}
	  	catch(Exception f14)
	  	{
	  		f14.getMessage();
	  		
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty14.png") ;
			
			test.log(LogStatus.SKIP,"Game Name Match - Prematch - Today", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty14.png'target=\\\"_blank\\  >Click Here</a>");
	  	}
	  	
	  	
	  //Click on Un -Select Favourite Set in Pre-Match Today
		
	  	try {
	  		
	  	driver.findElement(xpathpages.favouriteinlivenow).click();
	  	System.out.println("Un - Favourite is Clicked in Live Now Match !");
	  	Thread.sleep(2000);
	  	baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty15.png") ;
		
		test.log(LogStatus.PASS,"Un -Select Favourite Set in Pre-Match Today", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty15.png'target=\\\"_blank\\  >Click Here</a>");
	  	
	  	}
	  	catch(Exception f15)
	  	{
	  		f15.getMessage();
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty15.png") ;
			
			test.log(LogStatus.FAIL,"Un -Select Favourite Set in Pre-Match Today", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty15.png'target=\\\"_blank\\  >Click Here</a>");
	  	}
	  		
	  //Verify if Un-Favourite is Working
	  	
	  	try {
	  	String Expected2 = "No events are available.";
	  	String D = driver.findElement(xpathpages.noeventavailable).getText();
	  	System.out.println(D);
	  	if(Expected2.endsWith(D))
	  	{
	  		System.out.println("Un-Favourite Working Fine !");
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty16.png") ;
			
			test.log(LogStatus.PASS,"Verify - Un-Favourite Pre-Match Today", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty16.png'target=\\\"_blank\\  >Click Here</a>");
		  	Thread.sleep(2000);
	  	}
	  	else
	  	{
	  		System.out.println("Un-Favourite not Working Fine !");
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty16.png") ;
			
			test.log(LogStatus.FAIL,"Verify - Un-Favourite Pre-Match Today", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty16.png'target=\\\"_blank\\  >Click Here</a>");
	  	}
	  	
	  	
	  	}
	  	catch(Exception f16)
	  	{
	  		f16.getMessage();
	  	}
	  	}
		}
		catch(Exception f16)
		{
			f16.getMessage();
			
		}
	  	
		
	  //Scroll to See cricket on top
		
		try {
	  	WebElement crickettab1 = driver.findElement(By.xpath("//*[text()='Cricket']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", crickettab1);
	    System.out.println("cricket Game page opened !");
	    Thread.sleep(2000);
	    
		}
		catch(Exception f17)
		{
			f17.getMessage();
			System.out.println("Unable to open cricket Game !");
		}
	  
		
		
	  //Open Pre-Match in cricket
	  	
	  	driver.findElement(xpathpages.Prematchtennis).click();
	  	System.out.println("Prematch games in cricket is opened !");
	  	Thread.sleep(5000);
	  	
	  //Open Tomorrow in Pre-Match
	  	
	  	driver.findElement(xpathpages.tomorrowtennis).click();
	  	System.out.println("Prematch games -Tomorrow in cricket is opened !");
	  	Thread.sleep(5000);
	  	
	  	
	  //Verify if Tomorrow matches are available
	  	
	  	
	  	if(driver.findElement(xpathpages.noeventavailable).isDisplayed())
		  {
			  System.out.println("Tomorrow Games are not available !");
			  baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty18.png") ;
				
				test.log(LogStatus.FAIL,"Availability - Pre-Match Tomorrow", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty18.png'target=\\\"_blank\\  >Click Here</a>");
		  }
	  
	  	else
	  	{
	  	
	  		System.out.println("Tomorrow Games are available !");
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty18.png") ;
			
			test.log(LogStatus.PASS,"Availability - Pre-Match Tomorrow", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty18.png'target=\\\"_blank\\  >Click Here</a>");
	  	
	  //Click on Favourite in pre Match Tomorrow
		
		try {
	  	driver.findElement(xpathpages.favouriteinlivenow).click();
	  	System.out.println("Favourite is Clicked in Tomorrow - Prematch !");
	  	Thread.sleep(2000);
	  	baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty19.png") ;
		
		test.log(LogStatus.PASS,"Click on Favourite in pre Match Tomorrow", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty19.png'target=\\\"_blank\\  >Click Here</a>");
	  	Prematchtoday2 = driver.findElement(xpathpages.favouriteinlivenowname).getText();
	  	System.out.println(Prematchtoday2);
	  	Thread.sleep(1000);
	  	
		}
		catch(Exception f19)
		{
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty19.png") ;
			
			test.log(LogStatus.FAIL,"Click on Favourite in pre Match Tomorrow", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty19.png'target=\\\"_blank\\  >Click Here</a>");
		}
	  	
	  //Open Favourites tab
		
		driver.findElement(xpathpages.openfavouritestab).click();
	  	System.out.println("Favourites Tab is opened !");
	  	Thread.sleep(2000);
	  	
	  //Open Pre-Match in Favourites Tab
		
	  	driver.findElement(xpathpages.Prematchfav).click();
	  	System.out.println("Pre-Match in Favourites Tab is opened !");
	  	Thread.sleep(2000); 
	  	
	  //Open Pre-Match - Tomorrow in Favourites Tab
		
	  	driver.findElement(xpathpages.tomorrowfav).click();
	  	System.out.println("Pre-Match - Tomorrow in Favourites Tab is opened !");
	  	Thread.sleep(2000);
	  	
	  //Verify if that name of game is matching in Favourites page
		
	  	String C3 = driver.findElement(xpathpages.favouriteinlivenowname).getText();
	  	System.out.println(C3);
	  	if(C3.equals(Prematchtoday2))
	  	{
	  		System.out.println("Game names match for Prematch -Tomorrow");
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty20.png") ;
			
			test.log(LogStatus.PASS,"Click on Favourite in pre Match Tomorrow", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty20.png'target=\\\"_blank\\  >Click Here</a>");
	  	}
	  	else {
	  		System.out.println("Game names do not match for Prematch -Tomorrow");
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty20.png") ;
			
			test.log(LogStatus.FAIL,"Click on Favourite in pre Match Tomorrow", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty20.png'target=\\\"_blank\\  >Click Here</a>");
	  	}
	  		
	  	
	  	Thread.sleep(1000);
	  	
	  //Click on Un -Select Favourite Set in Live Now Match
		
	  	try {
	  	driver.findElement(xpathpages.favouriteinlivenow).click();
	  	System.out.println("Un - Favourite is Clicked in Pre -  Match Tomorrow !");
	  	baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty21.png") ;
		
		test.log(LogStatus.PASS,"Click Un-Favourite - pre Match Tomorrow", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty21.png'target=\\\"_blank\\  >Click Here</a>");
	  	Thread.sleep(2000);
	  	
	  	}
	  	catch(Exception f21)
	  	{
	  		System.out.println("Unable to Un - Favourite in Pre -  Match Tomorrow !");
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty21.png") ;
			
			test.log(LogStatus.FAIL,"Click Un-Favourite - pre Match Tomorrow", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty21.png'target=\\\"_blank\\  >Click Here</a>");
	  	}
	  	
	  //Verify if Un-Favourite is Working
	  		
	  	String Expected3 = "No events are available.";
	  	String E = driver.findElement(xpathpages.noeventavailable).getText();
	  	System.out.println(E);
	  	if(E.equals(Expected3))
	  	{
	  		System.out.println("Game names match for Pre match Tomorrow!");
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty22.png") ;
			
			test.log(LogStatus.PASS,"Verify Un-Favourite - pre Match Tomorrow", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty22.png'target=\\\"_blank\\  >Click Here</a>");
	  	}
	  	else
	  	{
	  		System.out.println("Game names do not match for Pre match Tomorrow!");
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty22.png") ;
			
			test.log(LogStatus.FAIL,"Verify Un-Favourite - pre Match Tomorrow", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty22.png'target=\\\"_blank\\  >Click Here</a>");
	  	}
	  	
	  	Thread.sleep(2000);
	  	
	  }
	  		
	  //Scroll to See cricket on top
		
	  	WebElement crickettab3 = driver.findElement(By.xpath("//*[text()='Cricket']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", crickettab3);
	    System.out.println("cricket Game page opened !");
	    Thread.sleep(2000);
	    
		
	  	    
	  //Open Pre-Match in cricket
	    
	  	driver.findElement(xpathpages.Prematchtennis).click();
	  	System.out.println("Prematch games in cricket is opened !");
	  	Thread.sleep(2000);
	  	
	  //Open Future in Pre-Match Tennis Tab
	  	
	  	driver.findElement(xpathpages.futuretennis).click();
	  	System.out.println("Prematch games - Future in cricket is opened !");
	  	Thread.sleep(2000);
	  	
	  //Check if Future Games or Available or not
	  
	  	if(driver.findElement(xpathpages.noeventavailable).isDisplayed())
		  {
			  System.out.println("Future Games are not available !");
			  baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty23.png") ;
				
			  test.log(LogStatus.INFO,"Not Available - Pre Match Future", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty23.png'target=\\\"_blank\\  >Click Here</a>");
			  
		  }
	  
	  	else
	  	{
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty23.png") ;
			
			test.log(LogStatus.PASS,"Availability - Pre Match Future", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty23.png'target=\\\"_blank\\  >Click Here</a>");
	  	
	  //Click on Favourite in pre Match Future
		
		try {
	  	driver.findElement(xpathpages.favouriteinlivenow).click();
	  	System.out.println("Favourite is Clicked in Future - Prematch !");
	  	Thread.sleep(2000);
	  	baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty24.png") ;
		
		test.log(LogStatus.PASS,"Click on Favourite  - Pre Match Future", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty24.png'target=\\\"_blank\\  >Click Here</a>");
	  	Prematchtoday3 = driver.findElement(xpathpages.favouriteinprematchname1).getText();
	  	System.out.println(Prematchtoday3);
	  	Thread.sleep(1000);
		}
		catch(Exception f24)
		{
			baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty24.png") ;
			
			test.log(LogStatus.FAIL,"Click on Favourite  - Pre Match Future", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty24.png'target=\\\"_blank\\  >Click Here</a>");
		}
	  	
	  //Open Favourites tab
		
	  	driver.findElement(xpathpages.openfavouritestab).click();
	  	System.out.println("Favourites Tab is opened !");
	  	Thread.sleep(2000);
	  	
	  	
	  //Open Pre-Match in Favourites Tab
		
	  	driver.findElement(xpathpages.Prematchfav).click();
	  	System.out.println("Pre-Match in Favourites Tab is opened !");
	  	Thread.sleep(2000);
	  	
	  //Open Future in Favourites Tab
	  	
	  	driver.findElement(xpathpages.futurefav).click();
	  	System.out.println("Pre-Match - Future in Favourites Tab is opened !");
	  	Thread.sleep(2000);
	  	
	  //Verify if that name of game is matching in Favourites page
		
	  	String C4 = driver.findElement(xpathpages.favouriteinprematchname1).getText();
	  	System.out.println(C4);
	  	if(C4.equals(Prematchtoday3))
	  	{
	  		System.out.println("Game Names Match for Favourites - Pre Match Future");
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty25.png") ;
			
			test.log(LogStatus.PASS,"Click on Favourite  - Pre Match Future", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty25.png'target=\\\"_blank\\  >Click Here</a>");
	  	}
	  	else {
	  		
	  		System.out.println("Game Names do not Match for Favourites - Pre Match Future");
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty25.png") ;
			
			test.log(LogStatus.FAIL,"Click on Favourite  - Pre Match Future", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty25.png'target=\\\"_blank\\  >Click Here</a>");
	  	}
	  	Thread.sleep(1000);
	  	
	  //Click on Un -Select Favourite Set in Live Now Match
		
	  	try {
	  	driver.findElement(xpathpages.favouriteinlivenow).click();
	  	System.out.println("Un - Favourite is Clicked in Pre -  Match Future !");
	  	Thread.sleep(2000);
  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty26.png") ;
		
		test.log(LogStatus.PASS,"Un-Favourite  - Pre Match Future", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty26.png'target=\\\"_blank\\  >Click Here</a>");
	  	}
	  	catch(Exception f26)
	  	{
	  		System.out.println("Unable to Un - Favourite in Pre -  Match Future !");
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty26.png") ;
			
			test.log(LogStatus.FAIL,"Un-Favourite  - Pre Match Future", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty26.png'target=\\\"_blank\\  >Click Here</a>");
	  	}
	  		
	  //Verify if Un-Favourite is Working
	  	
	  	
	  	String Expected4 = "No events are available.";
	  	String F = driver.findElement(xpathpages.noeventavailable).getText();
	  	System.out.println(F);
	  	if(F.equals(Expected4))
	  	{
	  		System.out.println("Game names match for Pre Match Future ");
	  	
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty27.png") ;
			
			test.log(LogStatus.PASS,"Un-Favourite  - Pre Match Future", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty27.png'target=\\\"_blank\\  >Click Here</a>");
	  	}
	  	else
	  	{
	  		System.out.println("Game names do not match for Pre Match Future ");
		  	
	  		baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\favourites\\qwerty27.png") ;
			
			test.log(LogStatus.FAIL,"Un-Favourite  - Pre Match Future", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/favourites/qwerty27.png'target=\\\"_blank\\  >Click Here</a>");
	  	}
	  	Thread.sleep(1000);
	  
	  	}
	  
	  //Switching to Parent Frame
	  	
	  	driver.switchTo().parentFrame();
	  	System.out.println("Switched to Parent Frame !");
	  	
	  
		
		
		
		driver.close();
		System.out.println("Browser is closed !");
	  	
	  
	  	}
	  
	  	}
	  	
	  	
	  
	  	
	
	  	
	
	


	


