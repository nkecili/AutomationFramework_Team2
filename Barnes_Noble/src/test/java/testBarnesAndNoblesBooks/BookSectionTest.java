package testBarnesAndNoblesBooks;
import barnesandnoblesbook.BookSection;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BookSectionTest extends WebAPI {
    static BookSection Book;
    public void iniElement(){ Book = PageFactory.initElements(driver, BookSection.class);}

    @Test(priority = 1)
    public void testAllFeature(){
        iniElement();
        Book.allFeature();
    }

    @Test(priority = 2)
    public void testBookFeature(){
        iniElement();
        Book.allFeature();
        Book.navigateForward();
        Book.bookFeature();
    }

    @Test(priority = 3)
    public void testBookAnnexFeature(){
        iniElement();
        Book.allFeature();
        Book.navigateForward();
        Book.bookFeature();
        Book.bookAnnexFeature();
    }

    @Test(priority = 4)
    public void testMembershipFeature(){
        iniElement();
        Book.allFeature();
        Book.navigateForward();
        Book.bookFeature();
        Book.membershipFeature();
    }

    @Test(priority = 5)
    public void testLogoFeature(){
        iniElement();
        Book.allFeature();
        Book.navigateForward();
        Book.bookFeature();
        Book.educatorFeature();

    }

    @Test(priority = 6)
    public void testExploreNowFeature(){
        iniElement();
        Book.allFeature();
        Book.navigateForward();
        Book.bookFeature();
        Book.exploreNowFeature();
    }

    @Test(priority = 7)
    public void testNewReleaseFeature(){
        iniElement();
        Book.allFeature();
        Book.navigateForward();
        Book.bookFeature();;
        Book.newReleaseFeature();
    }

    @Test(priority = 8 )
    public void testFindStoreFeature() {
        iniElement();
        Book.allFeature();
        Book.navigateForward();
        Book.bookFeature();
        Book.findStoreFeature();
        driver.navigate().forward();
    }

    @Test(priority = 9)
    public void testAllTypeFeature(){
        iniElement();
        Book.allFeature();
        Book.navigateForward();
        Book.bookFeature();
        Book.allTypeFeature();


    }















}
