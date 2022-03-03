package xboxtestgamertagsearch;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import xboxbasepages.PerficientHomePage;
import util.FunctionUtil;
import util.TestCaseBase;
import xboxbasepages.XboxGamerTagHomepage;
import xboxbasepages.XboxGamerTagLeaderboardPage;


public class xboxgamertagtestcasesearch {
	@Test(groups = { "firefox", "ChromeWin32", "IEWin32"})
	public void testSearch() throws Exception {
		XboxGamerTagHomepage xboxHomePage = new YahooHomePage();
		yahooHomePage.open();
		yahooHomePage.waitPageLoad();
		Assert.assertTrue(yahooHomePage.titleIs(YahooHomePage.TITLE));
		
		yahooHomePage.search("perficient");
		YahooSearchResultsPage yahooSearchResultsPage = yahooHomePage.gotoYahooSearchResultsPage();
		yahooSearchResultsPage.waitPageLoad();
		Assert.assertTrue(yahooSearchResultsPage.titleIs("perficient - Yahoo Search Results"));
		
		PerficientHomePage perficientHomePage = yahooSearchResultsPage.clickFirstLink();
		
		perficientHomePage.waitPageLoad();
		Assert.assertTrue(perficientHomePage.titleIs(PerficientHomePage.TITLE));
	}
}
