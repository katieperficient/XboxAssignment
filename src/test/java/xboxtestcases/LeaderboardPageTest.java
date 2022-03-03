package LeaderboardPageTest;
import java.util.HashMap;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;


import util.FunctionUtil;
import util.TestCaseBase;
import xboxbasepages.XboxHomePage;
import xboxbasepages.XboxLeaderBoardsPage;

public class LeadboardPageTest extends TestCaseBase {

		HashMap<String, String> expectedValues= new HashMap<String,String>()
				
				@Test(groups = { "firefox", "ChromeWin32", "IEWin32"})
@BeforeMethod	
		public void loadExpectedValuesh()  {
		XboxHomePage xboxHomePage = new XBoxHomePage();
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
}package xboxtestcases;

public class LeaderboardPageTest {

}
