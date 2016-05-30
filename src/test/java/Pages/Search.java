package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search extends AbstractPage{


    public Search(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void Search(String searcworld)
    {
        driver.findElement(By.cssSelector("input.Header__FindTxtInput")).clear();
        driver.findElement(By.cssSelector("input.Header__FindTxtInput")).sendKeys("велосипед");
        driver.findElement(By.cssSelector("input.Header__SearchButLink.glyphicon")).click();

    }

    public boolean isSearch(){
        return driver.findElement(By.cssSelector("div.PanelSetUp__CountBlockItem")).getText().contains("Товаров:");
    }


}
