package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage{

    @FindBy(xpath ="//div[@id='Header__Authentication']/div/span/div/div/span")
    public WebElement signInentrance;

    @FindBy(id = "LLoginForm_email")
    public WebElement signInLogin;

    @FindBy(id = "LLoginForm_password")
    public WebElement signInPassword;

    @FindBy(name = "yt2")
    public WebElement signInLoginbutton;

    public LoginPage(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage(String URL)
    {
        driver.navigate().to(URL);
    }

    public void logIn(String username, String password)
    {
        signInentrance.click();
        signInLogin.clear();
        signInLogin.sendKeys(username);
        signInPassword.clear();
        signInPassword.sendKeys(password);
        signInLoginbutton.click();
    }


    public void logOut(String username, String password){
        signInentrance.click();
        signInLogin.clear();
        signInLogin.sendKeys(username);
        signInPassword.clear();
        signInPassword.sendKeys(password);
        signInLoginbutton.click();
        signInentrance.click();
        driver.findElement(By.id("yt0")).click();
    }

    public void changePassorwd(String username, String password)
    {
        signInentrance.click();
        signInLogin.clear();
        signInLogin.sendKeys(username);
        signInPassword.clear();
        signInPassword.sendKeys(password);
        signInLoginbutton.click();
        signInentrance.click();
        driver.findElement(By.xpath(".//*[text()='Изменение пароля']/..")).click();
        driver.findElement(By.id("LPasswordChangeForm_password")).sendKeys(password);
        driver.findElement(By.id("LPasswordChangeForm_password_repeat")).sendKeys(password);
        driver.findElement(By.xpath(".//*[text()='Сохранить']/..")).click();
    }

    public boolean isLogOut(){
        boolean logOutIsTrue=false;
        if(driver.findElement(By.xpath(".//*[text()='Войти']/..")).isDisplayed()) logOutIsTrue=true;
        driver.quit();
        return  logOutIsTrue;
    }

    public boolean isLogIn(){
        boolean logInIsTrue=false;
        if(driver.findElement(By.xpath(".//*[text()='AlexxxanderN13']/..")).isDisplayed()) logInIsTrue=true;
        driver.quit();
        return  logInIsTrue;
    }

    public boolean ischangePassorwd(){
        boolean t=false;
        if(driver.findElement(By.name("yt0")).isDisplayed()) t=true;
        driver.quit();
        return  t;
    }
}