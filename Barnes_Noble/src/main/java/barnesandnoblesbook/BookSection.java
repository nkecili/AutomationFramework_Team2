package barnesandnoblesbook;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static barnesandnoblesbook.WebElementBooks.*;

public class BookSection extends WebAPI {

    @FindBy(how = How.XPATH,using = webAll)
    public WebElement weball;
    public void allFeature(){
        weball.click();
    }

    @FindBy(how = How.XPATH, using = webBook)
    public WebElement webook;
    public void bookFeature(){
        webook.click();
    }

    @FindBy(how = How.XPATH, using = webbookAnnex)
    public WebElement bookannex;
    public void bookAnnexFeature(){
        bookannex.click();
    }

    @FindBy(how = How.XPATH,using = webMember)
    public WebElement webmem;
    public void membershipFeature(){
        webmem.isDisplayed();
    }

    @FindBy(how = How.XPATH,using = webEducator)
    public WebElement educator;
    public void educatorFeature(){
      educator.isDisplayed();
    }

    @FindBy(how = How.XPATH, using = webexplorenow)
    public WebElement explorenow;
    public void exploreNowFeature(){
       explorenow.isDisplayed();
    }

    @FindBy(how = How.XPATH, using = WEbNewRelease)
    public WebElement newrelease;
    public void newReleaseFeature(){
        newrelease.isDisplayed();
    }

    @FindBy(how = How.XPATH, using = webFindStore)
    public WebElement findstore;
    public void findStoreFeature(){
        findstore.sendKeys("Brooklyn NY");
    }

    @FindBy(how = How.XPATH, using = webAllType)
    public WebElement alltype;
    public void allTypeFeature(){
        alltype.click();
    }


}
