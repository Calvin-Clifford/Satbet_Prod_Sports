package Pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import source_sports.baseclass;

public class xpathpages extends baseclass {
	
	//Login Module
	
	public static By loginbutton = By.xpath("//*[@id=\"loginbutton\"]");
	public static By username = By.xpath("//*[@id=\"loginForm\"]/div[2]/input");
	public static By password = By.xpath("//*[@id=\"user-password\"]");
	public static By submit = By.xpath("//*[@id=\"loginForm\"]/button");
	
	//Sports page
	
	public static By sportsbookpage = By.xpath("/html/body/div[1]/header/div[2]/div/div[3]/ul/li[2]/a");
	
	
	//Stake Related 
	
	public static By stakeamount = By.className("stakeInputButtondiv");
	public static By stakeamount1 = By.xpath("(//div[@class=\"stakeInputButtondiv\"])[5]");
	public static By maxstake = By.xpath("(//div[@class=\"stakeInputButtondiv\"])[6]");
	
	
	//Bet Placing
	
	public static By alwaysallowoddchange = By.xpath("//*[@id=\"commonbetslips\"]/app-single-bet-container/div/div/div/div[3]/div[2]/div[2]/input");
	public static By submitbet = By.className("bet_submit_btn");
	
	//Odds for Bet
	
	public static By odds1 = By.xpath("(//div[@class='team-button'])[4]");
	public static By odds2 = By.xpath("(//div[@class='team-button'])[8]");
	public static By odds3 = By.xpath("(//div[@class='team-button'])[12]");
	
	//Alerts
	
	public static By insuffalert = By.xpath("//*[contains(text(),'Insufficient sports balance. Please add sports balance.')]");
	public static By maxstakealert = By.xpath("//*[contains(text(),'Max Stake not available for this bet')]");
	
	//Close Events
	
	public static By closeevent = By.xpath("/html/body/app-root/app-game/div/div[2]/div[3]/app-market-details-panel/div/div/div/app-market-details-header/div[1]/div/div[1]");
	
	//Favourite Button and Name
	
	public static By favouriteinlivenow = By.className("event-header-container");
	public static By favouriteinlivenowname = By.className("events-list-name-txt");
	
	//Favourite Tab shift and Favourite click
	
	public static By openfavouritestab = By.xpath("//*[contains(text(),'Favourites')]");
	public static By openlivenowtab = By.xpath("/html/body/app-root/app-game/div/div[2]/div[3]/app-market-panel/div/div[1]/app-sports-icon-panel/div/div/div[1]/div");
	
	public static By Prematchtoday = By.xpath("/html/body/app-root/app-game/div/div[2]/div[3]/app-market-panel/div/div[2]/div[1]/div/app-market-events-list[1]/div/div[1]/div[1]");
	public static By Prematchfav = By.xpath("/html/body/app-root/app-game/div/div[2]/div[3]/app-market-panel/div/div/app-market-panel-header/div/div/div/div[2]");
	
	public static By tomorrowtennis = By.xpath("/html/body/app-root/app-game/div/div[2]/div[3]/app-market-panel/div/div/app-market-upcoming-panel/div/div/div/div[2]");
	public static By tomorrowfav = By.xpath("/html/body/app-root/app-game/div/div[2]/div[3]/app-market-panel/div/div/app-market-upcoming-panel/div/div/div/div[2]");
	
	public static By futuretennis = By.xpath("/html/body/app-root/app-game/div/div[2]/div[3]/app-market-panel/div/div/app-market-upcoming-panel/div/div/div/div[3]");
	public static By futurefav = By.xpath("/html/body/app-root/app-game/div/div[2]/div[3]/app-market-panel/div/div/app-market-upcoming-panel/div/div/div/div[3]");
	
	//Favourite Message
	
	public static By noeventavailable = By.className("no-event-message");
	
	//Favourites Pre-match Tab
	
	public static By Prematchtennis = By.xpath("/html/body/app-root/app-game/div/div[2]/div[3]/app-market-panel/div/div/app-market-panel-header/div/div/div/div[2]");
	public static By Prematchtabletennis = By.xpath("/html/body/app-root/app-game/div/div[2]/div[3]/app-market-panel/div/app-market-panel-header/div/div/div/div[2]");
	public static By Prematchsoccer = By.xpath("/html/body/app-root/app-game/div/div[2]/div[3]/app-market-panel/div/app-market-panel-header/div/div/div/div[2]");
	public static By Prematchbasketball = By.xpath("/html/body/app-root/app-game/div/div[2]/div[3]/app-market-panel/div/app-market-panel-header/div/div/div/div[2]");
	public static By Prematchvolleyball = By.xpath("/html/body/app-root/app-game/div/div[2]/div[3]/app-market-panel/div/app-market-panel-header/div/div/div/div[2]");
	
	
	//Favourites Pre-match
	
	public static By favouriteinlivenowname2 = By.className("events-list-name-txt");
	public static By favouriteinprematchname1 = By.className("events-list-name-txt");
	
	//Bet slip close 
	
	
	
	public static By closebetslip = By.xpath("//*[@id='commonbetslips']/app-single-bet-container/div/div/div/div[1]/app-single-bet-row/div/div[2]/div/div[1]/div[1]/span");
	public static By closemultibetslip1 = By.xpath("//*[@id=\"commonbetslips\"]/div/app-multi-bet-container/div/div/div/div/div[1]/app-multi-bet-row[1]/div/div/div[1]/div[3]/span");
	public static By closemultibetslip2 = By.xpath("//*[@id=\"commonbetslips\"]/app-single-bet-container/div/div/div/div[1]/app-single-bet-row/div/div[2]/div[2]/div[1]/div[1]/span");
	
	//Open Cashout 
	
	public static By opencashout = By.xpath("//*[@id=\"betToggle\"]/app-betslip-header-tabs/div/div[5]");
	
	//Cashout Single and Multi
	
	public static By slider = By.className("ngx-slider-span ngx-slider-pointer ngx-slider-pointer-min");
	public static By fullcashoutsingle = By.xpath("//*[contains(text(),' Cash Out INR ')]");
	public static By partialcashoutsingle = By.xpath("//*[@id=\"betToggle\"]/div[2]/div[3]/app-cash-out/div/div/app-cash-out-row/div/div/div[5]/div[1]/div[1]");
	public static By partialcashoutmulti = By.xpath("//*[@id=\"betToggle\"]/div[2]/div[3]/app-cash-out/div/div/app-cash-out-row/div/div/div[6]/div/div[1]");
	
	//Cashout confirm
	
	public static By confirmcashout1 = By.xpath("//*[contains(text(),'Cash Out INR ')]");
	public static By confirmmsg = By.xpath("//*[contains(text(),'Cash Out Sucessful')]");
	
	//Cashout Text affirmations
	
	public static By confirmaccept = By.xpath("//*[contains(text(),'Accepted!')]");
	public static By cashoutunavailable = By.xpath("//*[contains(text(),'Cash out Unavailable')]");
	
	//Bet History Module
	
	public static By bettime = By.xpath("//*[@id=\"betToggle\"]/div[2]/div[4]/app-bet-history/div/div[2]/div/div/div[1]/div/div[1]/div[3]");
	public static By settled1 = By.xpath("//*[@id=\"betToggle\"]/div[2]/div[4]/app-bet-history/div/div/div[1]/div[2]");
	public static By settleddrop = By.xpath("//*[@id=\"betToggle\"]/div[2]/div[4]/app-bet-history/div/div/div[2]/div/div/div/div[2]");
	
	public static By alldrop = By.xpath("//*[@id=\"betToggle\"]/div[2]/div[4]/app-bet-history/div/div[1]/div[2]/div/div/div[2]/div[1]");
	public static By hr24indrop = By.xpath("//*[@id=\"betToggle\"]/div[2]/div[4]/app-bet-history/div/div[1]/div[2]/div/div/div[2]/div[2]");
	public static By days3indrop = By.xpath("//*[@id=\"betToggle\"]/div[2]/div[4]/app-bet-history/div/div[1]/div[2]/div/div/div[2]/div[3]");
	public static By days7indrop = By.xpath("//*[@id=\"betToggle\"]/div[2]/div[4]/app-bet-history/div/div[1]/div[2]/div/div/div[2]/div[4]");
	
	//Functions Related
	
	public static By scorecard = By.className("banner_container");
	public static By refnum = By.className("reference_num");
	public static By openscore= By.className("matchinfo");
	
	public static By pending= By.xpath("//*[contains(text(),'Pending')]");
	public static By accepted= By.xpath("//*[contains(text(),'Accepted')]");

	public static By oddssame1 = By.xpath("//*[contains(text(),' Markets from same match cannot be combined in the same multi bet ')]");
	public static By oddssame2 = By.xpath("//*[contains(text(),'even')]");
	public static By closematch = By.xpath("/html/body/app-root/app-game/div/div[2]/div[3]/app-market-details-panel/div/div/app-market-details-header/div[1]/div/div[1]");
	
	//History Page Related
	
	public static By transactionhistory = By.xpath("/html/body/div[1]/div[7]/div/div/ul/li[7]/a");
	public static By gamehistory = By.xpath("/html/body/div[1]/div[8]/div/ul/li[4]/a");
	public static By deposit = By.xpath("/html/body/div[1]/header/div[1]/div/div/ul/li[4]/div/a/div");
	public static By bethistory = By.xpath("//*[@id=\"betToggle\"]/app-betslip-header-tabs/div/div[3]");
	public static By verifytranshist = By.xpath("//*[contains(text(),'Win')]");
	public static By verifygamehist = By.xpath("//*[contains(text(),'sports')]");
	public static By gamehistdrop = By.id("categoryId");
	public static By search = By.className("submit-btn");
	
	
	//Chat Icon close
	
	public static By closechat = By.xpath("//*[@id=\"tawk-mpreview-close\"]");
	public static By closechat1 = By.xpath("//*[@id=\"tawk-bubble-container\"]/div/i");
	
	//Logout Module
	
	public static By logoutbutton1 = By.xpath("//*[@id=\"main-header\"]/div[4]/a[1]");
	public static By logoutbutton2 = By.xpath("//*[contains(text(),'You have been successfully logged out.')]");

}
