package Page;

import Feature.F01_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_homePageLocators {
   public WebElement getForAuth(){
        return F01_Login.driver.findElement(By.linkText("Form Authentication"));
    }

}
