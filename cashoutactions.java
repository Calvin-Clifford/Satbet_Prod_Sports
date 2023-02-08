package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import Pages.xpathpages;
import source_sports.baseclass;

public class cashoutactions extends baseclass  {
	@Test
	
	public static void cashout() throws Throwable  {
		//public static WebDriver driver = null;
		
	baseclass.invoke();
		
		//For Excel Read
		
		FileInputStream fis = new FileInputStream("D:\\workspace\\SATBET_SPORTS_PROD\\SatbetSportsProdExcel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		test = report.startTest("Cashout - Single - Full / Partial");
		
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
		Thread.sleep(4000);	
		
		
		//Open Sportsbook page
		
		driver.findElement(xpathpages.sportsbookpage).click();
		System.out.println("Sportsbook is opened !");
		Thread.sleep(5000);
		
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
			
				Robot robot = new Robot();
				
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_MINUS);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_MINUS);
				
				
				
				//Finding Cashout Games and Switching to Particular sports 
				
				try {
					
					String Tennis01 = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[3]")).getText();
					Tennis01 = Tennis01.replaceAll("[^0-9]", " ");
					Tennis01 = Tennis01.trim();
					Tennis01 = Tennis01.replaceAll(" + ", " ");
					//Tennis = Tennis.replaceAll("[\\[\\](){}]","");
					Tennis1 =Integer.parseInt(Tennis01);
					System.out.println("Number of games in Tennis" + " = " + Tennis1);
					
					}
					catch(Exception f01)    
					{
						f01.getMessage();
						Tennis1 = 0;
					}
					
					try {
					
					String TableTennis01 = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[4]")).getText();
					TableTennis01 = TableTennis01.replaceAll("[^0-9]", " ");
					TableTennis01 = TableTennis01.trim();
					TableTennis01 = TableTennis01.replaceAll(" + ", " ");
					//TableTennis = TableTennis.replaceAll("[\\[\\](){}]","");
					TableTennis1 =Integer.parseInt(TableTennis01);
					System.out.println("Number of games in Table Tennis" + " = " + TableTennis1);
					}
					catch(Exception f02)
					{
						f02.getMessage();
						TableTennis1 = 0;
					}
					
					try {
			
					String Soccer01 = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[2]")).getText();
					Soccer01 = Soccer01.replaceAll("[^0-9]", " ");
					Soccer01 = Soccer01.trim();
					Soccer01 = Soccer01.replaceAll(" + ", " ");
					//Soccer = Soccer.replaceAll("[\\[\\](){}]","");
					Soccer1 =Integer.parseInt(Soccer01);
					System.out.println("Number of games in Soccer" + " = " + Soccer1);
					
					}
					catch(Exception f03)
					{
						f03.getMessage();
						Soccer1 = 0;
						
					}
					
					try {
				
					String Basketball01 = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[6]")).getText();
					Basketball01 = Basketball01.replaceAll("[^0-9]", " ");
					Basketball01 = Basketball01.trim();
					Basketball01 = Basketball01.replaceAll(" + ", " ");
					//Basketball = Basketball.replaceAll("[\\[\\](){}]","");
					Basketball1 =Integer.parseInt(Basketball01);
					System.out.println("Number of games in Basketball" + " = " + Basketball1);
					
					}
					catch(Exception f04)
					{
						f04.getMessage();
						Basketball1 = 0;
					}
					
					try {
					
						String Volleyball01 = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[13]")).getText();
						Volleyball01 = Volleyball01.replaceAll("[^0-9]", " ");
						Volleyball01 = Volleyball01.trim();
						Volleyball01 = Volleyball01.replaceAll(" + ", " ");
						//Volleyball = Volleyball.replaceAll("[\\[\\](){}]","");
						Volleyball1 =Integer.parseInt(Volleyball01);
						System.out.println("Number of games in Volleyball" + " = " + Volleyball1);
						
						}
						catch(Exception f04)
						{
							f04.getMessage();
							Volleyball1 = 0;
						}
				
				if(Tennis1 >= 2)
				{
					WebElement tennistab = driver.findElement(By.xpath("//*[text()='Tennis']"));
					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", tennistab);
				    System.out.println("Tennis Game page opened !");
				    Thread.sleep(2000);
				}
				else if(TableTennis1 >= 2)
				{
					WebElement tabletennistab = driver.findElement(By.xpath("//*[text()='Table Tennis']"));
					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", tabletennistab);
				    System.out.println("Table Tennis Game page opened !");
				    Thread.sleep(2000);
				}
				
				else if(Soccer1 >= 2)
				{
					WebElement soccertab = driver.findElement(By.xpath("//*[text()='Soccer']"));
					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", soccertab);
				    System.out.println("Soccer Game page opened !");
				    Thread.sleep(2000);
				}
				
				else if(Basketball1 > 2)
				{
					WebElement basketballtab = driver.findElement(By.xpath("//*[text()='Basketball']"));
					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", basketballtab);
				    System.out.println("Basketball Game page opened !");
				    Thread.sleep(2000);
				}
				
				else if(Volleyball1 >= 2)
				{
					WebElement volleyballtab = driver.findElement(By.xpath("//*[text()='Volleyball']"));
					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", volleyballtab);
				    System.out.println("volleyball Game page opened !");
				    Thread.sleep(2000);
				}
				
				else
				{
					WebElement tennistab = driver.findElement(By.xpath("//*[text()='Tennis']"));
					JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", tennistab);
				    System.out.println("Tennis Game page opened !");
				    Thread.sleep(2000);
				}
				
				
				// Place Single Bet 
				
				try {
					
					boolean odds1 = driver.findElement(xpathpages.odds1).isEnabled();
					//boolean odds2 = driver.findElement(xpathpages.odds2).isEnabled();
					//boolean odds3 = driver.findElement(xpathpages.odds3).isEnabled();
					
					if(odds1 == true)
					{
						System.out.println("Odds1 is not suspended !");
						WebElement odds01 = driver.findElement(By.xpath("(//div[@class=\"team-button\"])[4]"));
						JavascriptExecutor executor = (JavascriptExecutor)driver;
						executor.executeScript("arguments[0].click();", odds01);
						//driver.findElement(xpathpages.odds1).click();
						System.out.println("Clicked on Bet placing Button 1 !");
						Thread.sleep(2000);
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty1.png") ;
						test.log(LogStatus.PASS,"Click to Bet - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty1.png'target=\\\"_blank\\  >Click Here</a>");
						
					}
					
					
					else
					{
						System.out.println("Odds1 and Odds2 are suspended, So clicking odds 3 !");
						WebElement odds03 = driver.findElement(By.xpath("(//div[@class=\"team-button\"])[12]"));
						JavascriptExecutor executor = (JavascriptExecutor)driver;
						executor.executeScript("arguments[0].click();", odds03);
						//driver.findElement(xpathpages.odds3).click();
						System.out.println("Clicked on Bet placing Button 3 !");
						Thread.sleep(2000);
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty1.png") ;
						
						test.log(LogStatus.PASS,"Click to Bet - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty1.png'target=\\\"_blank\\  >Click Here</a>");
					}
					
				}
				
				catch(Exception f9)
				{
					f9.getMessage();
					System.out.println("Unable to Click on Odds 1 !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty1.png") ;
					
					test.log(LogStatus.FAIL,"Click to Bet - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty1.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				
				//Enter Stake
				

				try {
				
				driver.findElement(xpathpages.stakeamount).click();
				System.out.println("Stake amount is entered !");
				Thread.sleep(1500);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty2.png") ;
				
				
				test.log(LogStatus.PASS,"Enter Stake", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
				
				}
				catch(Exception f10)
				{
					System.out.println("Unable to Enter Stake amount");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty2.png") ;
					
					
					test.log(LogStatus.FAIL,"Enter Stake", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty2.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				//Click Always allow odd changes
				
				try {
				driver.findElement(xpathpages.alwaysallowoddchange).click();
				System.out.println("Always allow odd changes is clicked !");
				Thread.sleep(4000);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty8.png") ;
				
				
				test.log(LogStatus.PASS,"Click Always allow odd changes", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty8.png'target=\\\"_blank\\  >Click Here</a>");
				
				}
				catch(Exception f11)
				{
					System.out.println("Unable to Allow Odd Changes");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty8.png") ;
					
					
					test.log(LogStatus.FAIL,"Click Always allow odd changes", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty8.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				//Click Submit to place bet
				
				try {
				driver.findElement(xpathpages.submitbet).click();
				System.out.println("Submit to place bet is clicked !");
				Thread.sleep(4000);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty3.png") ;
				
				
				test.log(LogStatus.PASS,"Click Submit to place bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty3.png'target=\\\"_blank\\  >Click Here</a>");
				}
				catch(Exception f12)
				{
					System.out.println("Unable to Click Submit !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty3.png") ;
					
					
					test.log(LogStatus.FAIL,"Click Submit to place bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty3.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				
				//Open Cashout Page
				
				try {
				WebDriverWait wait1 = new WebDriverWait(driver,60);
				//String actual1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.confirmaccept)).getText();
				driver.findElement(xpathpages.opencashout).click();
				System.out.println("Cashout page is opened !");
				Thread.sleep(4000);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty4.png") ;
				
				
				test.log(LogStatus.PASS,"Open Cashout Page", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty4.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				catch(Exception f4)
				{
					System.out.println("Unable to open Cashout page !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty4.png") ;
					
					
					test.log(LogStatus.FAIL,"Open Cashout Page", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty4.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				//Perform Full Cashout for Single Bet
				
				try {
				WebElement fullcashoutsingle = driver.findElement(By.xpath("//*[contains(text(),' Cash Out INR ')]"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", fullcashoutsingle);
				//driver.findElement(xpathpages.fullcashoutsingle).click();
				System.out.println("Full Cashout given for Single Bet !");
				Thread.sleep(4000);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty5.png") ;
				
				
				test.log(LogStatus.PASS,"Click Full Cashout for Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty5.png'target=\\\"_blank\\  >Click Here</a>");
				
				}
				catch(Exception f5)
				{
					System.out.println("Full Cashout given for Single Bet - FAIL !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty5.png") ;
					
					
					test.log(LogStatus.FAIL,"Click Full Cashout for Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty5.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				
				//Click on Confirm Cashout
				
				try {
				
				WebElement confirmcashout1 = driver.findElement(By.xpath("//*[contains(text(),'Cash Out INR ')]"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", confirmcashout1);
				System.out.println("Confirm Cashout given for Single Bet !");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty6.png") ;
				
				
				test.log(LogStatus.PASS,"Click on Confirm Full Cashout - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty6.png'target=\\\"_blank\\  >Click Here</a>");
				
				}
				catch(Exception f6)
				{
					System.out.println("Confirm Cashout given for Single Bet -FAIL !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty6.png") ;
					
					
					test.log(LogStatus.FAIL,"Click on Confirm Full Cashout - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty6.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				
				//Confirm Cashout Success Msg
				
				try {
				WebDriverWait wait1 = new WebDriverWait(driver,60);
				String actual1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.confirmmsg)).getText();
				boolean cashsing = driver.findElement(xpathpages.confirmmsg).isDisplayed();
				if(cashsing == true)
				{
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty7.png") ;
					
					
					test.log(LogStatus.PASS,"Verify Full Cashout - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty7.png'target=\\\"_blank\\  >Click Here</a>");
					System.out.println("Full cashout successfull for Single Bet !");
					Thread.sleep(3000);
				}
				else
				{
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty7.png") ;
					
					
					test.log(LogStatus.FAIL,"Verify Full Cashout - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty7.png'target=\\\"_blank\\  >Click Here</a>");
					System.out.println("Full cashout un-successfull for Single Bet !");
					Thread.sleep(3000);
				}
				}
				catch(Exception f7)
				{
					f7.getMessage();
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty7.png") ;
					
					
					test.log(LogStatus.FAIL,"Verify Full Cashout - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty7.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				
				Thread.sleep(10000);
				
				//open Live Now
				
				WebElement livenow = driver.findElement(By.xpath("//*[text()='Live Now']"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", livenow);
			    System.out.println("Live Now page opened !");
			    Thread.sleep(2000);

				
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
				
					String Basketball11 = driver.findElement(By.xpath("(//div[@class='icons_list icon_desktop un-selection1'])[6]")).getText();
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
				
				
				if(Tennis001 >= 2)
				{
					WebElement tennistab = driver.findElement(By.xpath("//*[text()='Tennis']"));
					//JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", tennistab);
				    System.out.println("Tennis Game page opened !");
				    Thread.sleep(2000);
				}
				else if(TableTennis001 >= 2)
				{
					WebElement tabletennistab = driver.findElement(By.xpath("//*[text()='Table Tennis']"));
					//JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", tabletennistab);
				    System.out.println("Table Tennis Game page opened !");
				    Thread.sleep(2000);
				}
				
				else if(Soccer001 >= 2)
				{
					WebElement soccertab = driver.findElement(By.xpath("//*[text()='Soccer']"));
					//JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", soccertab);
				    System.out.println("Soccer Game page opened !");
				    Thread.sleep(2000);
				}
				
				else if(Basketball001 > 2)
				{
					WebElement basketballtab = driver.findElement(By.xpath("//*[text()='Basketball']"));
					//JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", basketballtab);
				    System.out.println("Basketball Game page opened !");
				    Thread.sleep(2000);
				}
				
				else if(Volleyball001 >= 2)
				{
					WebElement volleyballtab = driver.findElement(By.xpath("//*[text()='Volleyball']"));
					//JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", volleyballtab);
				    System.out.println("volleyball Game page opened !");
				    Thread.sleep(2000);
				}
				
				else
				{
					WebElement tennistab = driver.findElement(By.xpath("//*[text()='Tennis']"));
					//JavascriptExecutor executor = (JavascriptExecutor)driver;
					executor.executeScript("arguments[0].click();", tennistab);
				    System.out.println("Tennis Game page opened !");
				    Thread.sleep(2000);
				}
				
				
				// Place Single Bet 
				
				try {
					
					boolean odds01 = driver.findElement(xpathpages.odds1).isEnabled();
					//boolean odds02 = driver.findElement(xpathpages.odds2).isEnabled();
					//boolean odds03 = driver.findElement(xpathpages.odds3).isEnabled();
					
					if(odds01 == true)
					{
						System.out.println("Odds1 is not suspended !");
						WebElement odds001 = driver.findElement(By.xpath("(//div[@class=\"team-button\"])[4]"));
						//JavascriptExecutor executor = (JavascriptExecutor)driver;
						executor.executeScript("arguments[0].click();", odds001);
						//driver.findElement(xpathpages.odds1).click();
						System.out.println("Clicked on Bet placing Button 1 !");
						Thread.sleep(1000);
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty9.png") ;
						test.log(LogStatus.PASS,"Click to Bet - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty9.png'target=\\\"_blank\\  >Click Here</a>");
						
					}
			
					
					else
					{
						System.out.println("Odds1 and Odds2 are suspended, So clicking odds 3 !");
						WebElement odds003 = driver.findElement(By.xpath("(//div[@class=\"team-button\"])[12]"));
						//JavascriptExecutor executor = (JavascriptExecutor)driver;
						executor.executeScript("arguments[0].click();", odds003);
						//driver.findElement(xpathpages.odds3).click();
						System.out.println("Clicked on Bet placing Button 3 !");
						Thread.sleep(1000);
						baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty9.png") ;
						
						test.log(LogStatus.PASS,"Click to Bet - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty9.png'target=\\\"_blank\\  >Click Here</a>");
					}
					
				}
				
				catch(Exception f9)
				{
					f9.getMessage();
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty9.png") ;
					
					test.log(LogStatus.FAIL,"Click to Bet - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty9.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				//Enter Stake
				

				try {
				
				driver.findElement(xpathpages.stakeamount).click();
				System.out.println("Stake amount is entered !");
				Thread.sleep(1000);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty10.png") ;
				
				
				test.log(LogStatus.PASS,"Enter Stake", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
				
				}
				catch(Exception f10)
				{
					System.out.println("Unable to Enter Stake amount");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty10.png") ;
					
					
					test.log(LogStatus.FAIL,"Enter Stake", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty10.png'target=\\\"_blank\\  >Click Here</a>");
				}
				/*
				
				//Click Always allow odd changes
				
				try {
				driver.findElement(xpathpages.alwaysallowoddchange).click();
				System.out.println("Always allow odd changes is clicked !");
				Thread.sleep(1000);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty11.png") ;
				
				
				test.log(LogStatus.PASS,"Click Always allow odd changes", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty11.png'target=\\\"_blank\\  >Click Here</a>");
				
				}
				catch(Exception f11)
				{
					System.out.println("Unable to Allow Odd Changes");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty11.png") ;
					
					
					test.log(LogStatus.FAIL,"Click Always allow odd changes", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty11.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				*/
				
				//Click Submit to place bet
				
				try {
				driver.findElement(xpathpages.submitbet).click();
				System.out.println("Submit to place bet is clicked !");
				Thread.sleep(4000);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty12.png") ;
				
				
				test.log(LogStatus.PASS,"Click Submit to place bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty12.png'target=\\\"_blank\\  >Click Here</a>");
				}
				catch(Exception f12)
				{
					System.out.println("Unable to Click Submit !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty12.png") ;
					
					
					test.log(LogStatus.FAIL,"Click Submit to place bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty12.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				
				//Open Cashout Page
				
				try {
				WebDriverWait wait1 = new WebDriverWait(driver,60);
				String actual1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.confirmaccept)).getText();
				driver.findElement(xpathpages.opencashout).click();
				System.out.println("Cashout page is opened !");
				Thread.sleep(4000);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty13.png") ;
				
				
				test.log(LogStatus.PASS,"Open Cashout Page", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty13.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				catch(Exception f4)
				{
					System.out.println("Unable to open Cashout page !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty13.png") ;
					
					
					test.log(LogStatus.FAIL,"Open Cashout Page", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty13.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				
				
				//Perform Partial Cashout for Single Bet
				
				try {
					
				driver.findElement(xpathpages.partialcashoutsingle).click();
				System.out.println("Partial Cashout Button clicked for Single Bet");
				Thread.sleep(3000);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty14.png") ;
				
				
				test.log(LogStatus.PASS,"Click Partial Cashout - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty14.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				catch(Exception f14)
				{
					f14.getMessage();
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty14.png") ;
					
					
					test.log(LogStatus.FAIL,"Click Partial Cashout - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty14.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				//Drag the Cashout bar
				
				try {
				WebElement slider = driver.findElement(By.xpath("//*[@id=\"betToggle\"]/div[2]/div[3]/app-cash-out/div/div/app-cash-out-row/div/div/div[5]/div[2]/div/ngx-slider/span[5]"));
				WebElement sliderbase = driver.findElement(By.xpath("//*[@id=\"betToggle\"]/div[2]/div[3]/app-cash-out/div/div/app-cash-out-row/div/div/div[5]/div[2]/div/ngx-slider/span[4]"));
				Actions move = new Actions(driver);
				move.moveToElement(slider).clickAndHold().moveToElement(sliderbase).release().perform();
				System.out.println("Slider is dragged !");
				Thread.sleep(2000);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty15.png") ;
				
				
				test.log(LogStatus.PASS,"Drag the Cashout bar - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty15.png'target=\\\"_blank\\  >Click Here</a>");
				}
				catch(Exception f15)
				{
					f15.getMessage();
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty15.png") ;
					
					
					test.log(LogStatus.FAIL,"Drag the Cashout bar - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty15.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				//Click Confirm Cashout - Partial Cashout - Single Bet
				
				try {
					
				WebElement fullcashoutsingle = driver.findElement(By.xpath("//*[contains(text(),' Cash Out INR ')]"));
				//JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", fullcashoutsingle);	
				//driver.findElement(xpathpages.fullcashoutsingle).click();
				System.out.println("Click Confirm Cashout - Partial Cashout - Single Bet");
				Thread.sleep(2000);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty18.png") ;
				
				
				test.log(LogStatus.PASS,"Click Confirm Cashout for Partial Cashout - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty18.png'target=\\\"_blank\\  >Click Here</a>");
				
				}
				catch(Exception f5)
				{
					System.out.println("Click Confirm Cashout - Partial Cashout - Single Bet - FAIL !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty18.png") ;
					
					
					test.log(LogStatus.FAIL,"Click Confirm Cashout for Partial Cashout - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty18.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				//Click on Confirm Cashout
				
				try {
				WebElement confirmcashout2 = driver.findElement(By.xpath("//*[contains(text(),'Cash Out INR ')]"));
				executor.executeScript("arguments[0].click();", confirmcashout2);
				System.out.println("Confirm Cashout given for Single Bet !");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty16.png") ;
				
				
				test.log(LogStatus.PASS,"Click on Confirm Partial Cashout - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty16.png'target=\\\"_blank\\  >Click Here</a>");
				}
				catch(Exception f6)
				{
					System.out.println("Confirm Cashout given for Single Bet -FAIL !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty16.png") ;
					
					
					test.log(LogStatus.FAIL,"Click on Confirm Partial Cashout - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty16.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				
				//Confirm Cashout Success Msg
				
				try {
				WebDriverWait wait1 = new WebDriverWait(driver,60);
				String actual1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.confirmmsg)).getText();
				boolean cashsing = driver.findElement(xpathpages.confirmmsg).isDisplayed();
				if(cashsing == true)
				{
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty17.png") ;
					
					
					test.log(LogStatus.PASS,"Verify Partial Cashout 1 - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty17.png'target=\\\"_blank\\  >Click Here</a>");
					System.out.println("Partial Cashout 1 successfull for Single Bet !");
					Thread.sleep(3000);
				}
				else
				{
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty17.png") ;
					
					
					test.log(LogStatus.FAIL,"Verify Partial Cashout 1 - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty17.png'target=\\\"_blank\\  >Click Here</a>");
					System.out.println("Partial Cashout 1 un-successfull for Single Bet !");
					Thread.sleep(3000);
				}
				}
				catch(Exception f7)
				{
					f7.getMessage();
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty17.png") ;
					
					
					test.log(LogStatus.FAIL,"Verify Partial Cashout 1 - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty17.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				//Click Confirm Cashout - Partial Cashout 2 - Single Bet
				
				try {
				WebElement fullcashoutsingle = driver.findElement(By.xpath("//*[contains(text(),' Cash Out INR ')]"));
				//JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click();", fullcashoutsingle);	
				//driver.findElement(xpathpages.fullcashoutsingle).click();
				System.out.println("Click Confirm Cashout - Partial Cashout 2 - Single Bet");
				Thread.sleep(2000);
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty19.png") ;
				
				
				test.log(LogStatus.PASS,"Click Confirm Cashout for Partial Cashout 2 - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty19.png'target=\\\"_blank\\  >Click Here</a>");
				
				}
				catch(Exception f5)
				{
					System.out.println("Click Confirm Cashout - Partial Cashout 2 - Single Bet - FAIL !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty19.png") ;
					
					
					test.log(LogStatus.FAIL,"Click Confirm Cashout for Partial Cashout 2- Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty19.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				//Click on Confirm Cashout
				
				try {
				WebElement confirmcashout2 = driver.findElement(By.xpath("//*[contains(text(),'Cash Out INR ')]"));
				executor.executeScript("arguments[0].click();", confirmcashout2);
				System.out.println("Confirm Cashout given for Single Bet 2 !");
				baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty20.png") ;
				
				
				test.log(LogStatus.PASS,"Click on Confirm Partial Cashout 2 - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty20.png'target=\\\"_blank\\  >Click Here</a>");
				}
				catch(Exception f6)
				{
					System.out.println("Confirm Cashout given for Single Bet 2 -FAIL !");
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty20.png") ;
					
					
					test.log(LogStatus.FAIL,"Click on Confirm Partial Cashout 2 - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty20.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				
				//Confirm Cashout Success Msg
				
				try {
				WebDriverWait wait1 = new WebDriverWait(driver,60);
				String actual1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(xpathpages.confirmmsg)).getText();
				boolean cashsing = driver.findElement(xpathpages.confirmmsg).isDisplayed();
				if(cashsing == true)
				{
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty21.png") ;
					
					
					test.log(LogStatus.PASS,"Verify Partial Cashout 2 - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty21.png'target=\\\"_blank\\  >Click Here</a>");
					System.out.println("Partial Cashout 2 successfull for Single Bet !");
					Thread.sleep(3000);
				}
				else
				{
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty21.png") ;
					
					
					test.log(LogStatus.FAIL,"Verify Partial Cashout 2 - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty21.png'target=\\\"_blank\\  >Click Here</a>");
					System.out.println("Partial Cashout 2 un-successfull for Single Bet !");
					Thread.sleep(3000);
				}
				}
				catch(Exception f7)
				{
					f7.getMessage();
					baseclass.takeSnapShot(driver, "D:\\workspace\\SATBET_SPORTS_PROD\\FailedTestsScreenshots\\cashoutactions\\qwerty21.png") ;
					
					
					test.log(LogStatus.FAIL,"Verify Partial Cashout 2 - Single Bet", "To open Screenshots : <a href= 'file:///D:/workspace/SATBET_SPORTS_PROD/FailedTestsScreenshots/cashoutactions/qwerty21.png'target=\\\"_blank\\  >Click Here</a>");
				}
				
				//Switching to Parent Frame
			  	
			  	driver.switchTo().parentFrame();
			  	System.out.println("Switched to Parent Frame !");
			  	
			  	
				
				driver.close();
				System.out.println("Browser is closed !");
					
					
					
				
		
	}

}
