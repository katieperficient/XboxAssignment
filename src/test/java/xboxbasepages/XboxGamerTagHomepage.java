package xboxbasepages;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.FunctionUtil;
import util.Page;
import util.SystemUtil;
import util.TestCaseBase;
import util.Waiting;



public class XboxGamerTagHomepage extends Page {
	
	@FindBy(xpath = ".//[a@href-'/leaderboards']")
	public WebElement gamertagSearch;
	public static String TITLE="Xbox";
	public static String URL="https://www.xboxgamertag.com/";
	
	
	

	public XboxGamerTagHomepage open() throws Exception {
		//read the url from property file
		Properties PROPERTIES_RESOURCES = SystemUtil
				.loadPropertiesResources("/testdata_xbox.properties");
		String URL = PROPERTIES_RESOURCES.getProperty("xbox.baseURL");
		TestCaseBase.threadDriver.get().navigate().to(URL);

		return this;
	}

	//goto sign in page
	public XboxGamerTagLeaderboardPage gotoLeaderBoardPage() throws Exception {
		Waiting.until(login);
		login.click();
		
		return new XboxGamerTagLeaderboardPage();
	}
	

	
	//use this method to wait until the page loads. 
	//usually it is not the page loads but a specific element loads
	//here we use loginLink, because our test cases need to use this link
	//so if this link is visible, the test cases can continue
	public XboxGamerTagHomepage waitPageLoad() throws InterruptedException {
		//Thread.sleep(2000);
		//Waiting.implicitly(2);
		
		if (FunctionUtil.isExist(pageLoad)) {
			Waiting.until(pageLoad,5000);
		} else if (FunctionUtil.isExist(pageLoad_symbol_failure)) {
			Waiting.until(pageLoad_symbol_failure,5000);
		} else if (FunctionUtil.isExist(pageLoad_goofy)) {
			Waiting.until(pageLoad_goofy,5000);
		} 		
		
		return this;
	}
	
	public XboxGamerTagHomepage search (String search) {
		Waiting.until(searchInput);
		searchInput.clear();
		searchInput.sendKeys(search);
		
		return this;
	}
	
	public XboxGamerTagSearchResults gotoXboxGamerTagSearchResultsPage() {
		Waiting.until(searchSubmit);
		searchSubmit.click();
		
		return new XboxGamerTagSearchResults();
	}