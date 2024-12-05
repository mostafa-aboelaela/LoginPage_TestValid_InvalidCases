package Page;

import Feature.F01_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_loginPageLocators {
   public WebElement getUsernameLoc(){
        return F01_Login.driver.findElement(By.id("username"));

    }

    public WebElement  getpassLoc(){
        return F01_Login.driver.findElement(By.name("password"));
    }

    public WebElement btnClick(){
        return  F01_Login.driver.findElement(By.className("fa-sign-in"));
    }
}
