package westfooter;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static westfooter.WebElementFooter.*;

public class HomePageFooter extends WebAPI {
    @FindBy(how= How.XPATH, using = airportInfo )
    public WebElement airport;
    public void checkAirportInfoFeature(){
        airport.click();
    }
    @FindBy(how=How.XPATH,using = changeFlight)
    public WebElement flightchange;
    public void checkChangeFlight(){
        flightchange.click();
    }

    @FindBy(how=How.XPATH,using = cancelflight)
    public WebElement cancel;
    public void checkCancelFlightFeature(){
        cancel.click();
    }

    @FindBy(how = How.ID, using = Search)
    public WebElement search;
    public void checkSearchButton(){
        search.click();
    }

    @FindBy(how=How.ID, using = LearnMore)
    public WebElement learn;
    public void checkLearnMore(){
        learn.click();
    }

    @FindBy(how = How.XPATH,using = whatWeARe)
    public WebElement what;
    public void checkWhatAreWeFeature(){
        what.click();
    }

    @FindBy(how= How.XPATH,using = BookNow)
    public WebElement Book;
    public void checkBookNowFeature(){
        Book.click();
    }

    @FindBy(how=How.XPATH,using = oneway )
    public WebElement way;
    public void checkOneWay(){
       way.click();
    }

    @FindBy(how = How.XPATH, using = RoundTrip)
    public WebElement round;
    public void checkRoundTripFeaturte(){
        round.click();
    }
    @FindBy(how= How.XPATH,using = Hotels)
    public WebElement hotel;
    public void checkHotelsFeature(){
        hotel.click();
    }

    @FindBy(how = How.XPATH, using = Vacations)
    public WebElement vacation;
    public void checkVacationsFeature(){
        vacation.click();
    }
}
