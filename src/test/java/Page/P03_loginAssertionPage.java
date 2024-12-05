package Page;

import Feature.F01_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P03_loginAssertionPage   {
   public WebElement getLogoutLoc(){
        return  F01_Login.driver.findElement(By.id("flash"));
    }

   public WebElement getYoulog(){
        return  F01_Login.driver.findElement(By.xpath("//a[@class=\"button secondary radius\"]"));
    }
   public WebElement getYoulogInvalid(){
        return  F01_Login.driver.findElement(By.id("flash"));
    }
}
