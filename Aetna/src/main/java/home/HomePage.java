package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static home.HomePageWebElement.*;

public class HomePage {

    @FindBy (how= How.XPATH,using =aetnaLoginButtonXp)
    public WebElement aetnaLoginButton ;






}
