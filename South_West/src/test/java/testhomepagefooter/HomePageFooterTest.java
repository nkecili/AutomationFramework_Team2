package testhomepagefooter;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import westfooter.HomePageFooter;

public class HomePageFooterTest extends WebAPI {

    static HomePageFooter homepage ;

    public void initEl(){
        homepage = PageFactory.initElements(driver,HomePageFooter.class); }

    @Test(priority = 1)
    public void testAboutSouthWestFeature(){
        initEl();
        homepage.checkAirportInfoFeature();
    }

    @Test(priority = 2)
    public void testflightchangeFeature(){
        initEl();
        homepage.checkChangeFlight();
    }

    @Test(priority = 3)
    public void testCancelFlightFeature(){
        initEl();
        homepage.checkCancelFlightFeature();
    }

    @Test(priority = 4)
    public void testSearchButton(){
        initEl();
        homepage.checkSearchButton();
    }
    @Test(priority = 5)
    public void testLearnMoreFeature(){
        initEl();
        homepage.checkLearnMore();
    }

    @Test(priority = 6)
    public void testWhatAreWeFeature(){
        initEl();
        homepage.checkWhatAreWeFeature();
    }

    @Test(priority = 7)
    public void testBookNowFeature(){
        initEl();
        homepage.checkBookNowFeature();
    }

    @Test(priority = 8)
    public void testOneWayFeature(){
        initEl();
        homepage.checkOneWay();
    }

    @Test(priority = 9)
    public void testRoundTripFeature(){
        initEl();
        homepage.checkRoundTripFeaturte();
    }

    @Test(priority = 10)
    public void testHotelsFeature(){
        initEl();
        homepage.checkHotelsFeature();
    }

    @Test(priority = 11)
    public void testVacatiosFeature(){
        initEl();
        homepage.checkVacationsFeature();
    }
}
