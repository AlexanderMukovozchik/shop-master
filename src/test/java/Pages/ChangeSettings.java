package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ChangeSettings extends AbstractPage{



    public ChangeSettings(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void ChangeSettings()
    {
        driver.findElement(By.cssSelector("div.Header__Regions.Page__SelectOnBg")).click();
        driver.findElement(By.xpath(".//*[text()='�������']/..")).click();
    }

    public boolean isChangeSettings(){
        boolean serInIsTrue=false;
        if(driver.findElement(By.xpath(".//*[text()='�������']/..")).isDisplayed()) serInIsTrue=true;
        driver.quit();
        return  serInIsTrue;
    }


}