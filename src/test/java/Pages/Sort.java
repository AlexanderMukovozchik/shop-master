package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Sort extends AbstractPage{



    public Sort(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void Sort()
    {
        driver.findElement(By.cssSelector("span.Catalog__LinkTextBlock")).click();
        driver.findElement(By.cssSelector("a.VisitSection__LinkRecipesName")).click();
        driver.findElement(By.id("minnum_45")).clear();
        driver.findElement(By.id("minnum_45")).sendKeys("1 000 000");
        driver.findElement(By.id("maxnum_45")).clear();
        driver.findElement(By.id("maxnum_45")).sendKeys("10 000 000");
        driver.findElement(By.xpath("//span[@onclick=\"javascript:document.getElementById('ModelFilter__Submit').click();\"]")).click();


    }

    public boolean isSort(){
        boolean serInIsTrue=false;
        if(driver.findElement(By.xpath(".//*[text()='Сопутствующие товары']/..")).isDisplayed()) serInIsTrue=true;
        driver.quit();
        return  serInIsTrue;


    }


}