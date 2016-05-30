package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Comment extends AbstractPage{

    @FindBy(xpath ="//div[@id='Header__Authentication']/div/span/div/div/span")
    public WebElement signInentrance;

    @FindBy(id = "LLoginForm_email")
    public WebElement signInLogin;

    @FindBy(id = "LLoginForm_password")
    public WebElement signInPassword;

    @FindBy(name = "yt2")
    public WebElement signInLoginbutton;




    public Comment(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void Comment()
    {
        signInentrance.click();
        signInLogin.clear();
        signInLogin.sendKeys("AlexxxanderN13@gmail.com");
        signInPassword.clear();
        signInPassword.sendKeys("123456789");
        signInLoginbutton.click();
        driver.findElement(By.cssSelector("span.Catalog__LinkTextBlock")).click();
        driver.findElement(By.cssSelector("a.VisitSection__LinkRecipesName")).click();
        driver.findElement(By.cssSelector("a.ModelList__LinkModel > span")).click();
        driver.findElement(By.xpath("//a[3]/span")).click();
        driver.findElement(By.id("Review_content")).clear();
        driver.findElement(By.id("Review_content")).sendKeys("Отличные шины!");
        driver.findElement(By.id("Review_positive")).clear();
        driver.findElement(By.id("Review_positive")).sendKeys("Их очень много");
        driver.findElement(By.id("Review_negative")).clear();
        driver.findElement(By.id("Review_negative")).sendKeys("Их нету");
        driver.findElement(By.xpath("//span[@id='cont_Review_mark']/span[5]")).click();
        driver.findElement(By.name("yt0")).click();


    }

    public boolean isComment(){
        boolean serInIsTrue=false;
        if(driver.findElement(By.xpath(".//*[text()='Спасибо! Ваш отзыв будет опубликован после проверки модератором.']/..")).isDisplayed()) serInIsTrue=true;
        driver.quit();
        return  serInIsTrue;


    }


}