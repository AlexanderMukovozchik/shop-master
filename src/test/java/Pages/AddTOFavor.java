package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddTOFavor extends AbstractPage{

    @FindBy(xpath ="//div[@id='Header__Authentication']/div/span/div/div/span")
    public WebElement signInentrance;

    @FindBy(id = "LLoginForm_email")
    public WebElement signInLogin;

    @FindBy(id = "LLoginForm_password")
    public WebElement signInPassword;

    @FindBy(name = "yt2")
    public WebElement signInLoginbutton;

    public AddTOFavor(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void AddTOFavor() throws InterruptedException {
        signInentrance.click();
        signInLogin.clear();
        signInLogin.sendKeys("AlexxxanderN13@gmail.com");
        signInPassword.clear();
        signInPassword.sendKeys("123456789");
        signInLoginbutton.click();
        driver.findElement(By.cssSelector("span.Catalog__LinkTextBlock")).click();
        driver.findElement(By.cssSelector("a.VisitSection__LinkRecipesName")).click();
        driver.findElement(By.cssSelector("a.ModelList__LinkModel > span")).click();
        driver.findElement(By.cssSelector("span.Page__DotLink")).click();
    }

    public void DelFromFavor() throws InterruptedException {
        signInentrance.click();
        signInLogin.clear();
        signInLogin.sendKeys("AlexxxanderN13@gmail.com");
        signInPassword.clear();
        signInPassword.sendKeys("123456789");
        signInLoginbutton.click();
        driver.findElement(By.cssSelector("div.Header__BlockNameUser")).click();
        driver.findElement(By.linkText("Мои закладки")).click();
        driver.findElement(By.id("cid_0")).click();
        driver.findElement(By.linkText("Удалить выбранное")).click();
    }

    public boolean isAddTOFavor(){
        return  driver.findElement(By.cssSelector("span.Page__DotLink")).isDisplayed();
    }

    public boolean isDelFromFavor(){
        return  true;
    }


}