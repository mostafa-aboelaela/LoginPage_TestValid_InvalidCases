package Feature;

import Page.P01_homePageLocators;
import Page.P02_loginPageLocators;
import Page.P03_loginAssertionPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class F01_Login {

    P01_homePageLocators hlocs = new P01_homePageLocators();
    P02_loginPageLocators llocs = new P02_loginPageLocators();
    P03_loginAssertionPage AssertionLocs = new P03_loginAssertionPage();
   public static ChromeDriver driver;
      @BeforeMethod
    void Setup(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        hlocs.getForAuth().click();

    }
    @Test // valid
    void test_a(){
       llocs.getUsernameLoc() .sendKeys("tomsmith");
       llocs.getpassLoc().sendKeys("SuperSecretPassword!");
       llocs.btnClick().click();
       boolean C1 = AssertionLocs.getLogoutLoc().isDisplayed();
        Assert.assertTrue(C1);

        boolean C2 = AssertionLocs.getYoulog().isDisplayed();
        Assert.assertTrue(C2);

    }

    @Test //invalid
    void test_b(){
        llocs.getUsernameLoc() .sendKeys("tomsmit");
        llocs.getpassLoc().sendKeys("1234567");
        llocs.btnClick().click();
        AssertionLocs.getYoulogInvalid();
    }

    @AfterMethod
    void Setoff(){
        driver.quit();


    }
}
