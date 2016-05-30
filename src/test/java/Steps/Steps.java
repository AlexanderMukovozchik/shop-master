package Steps;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;




public class Steps {
    private WebDriver driver;
    public void initBrowser()
    {
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


    public void closeDriver()
    {
        driver.close();
    }

    public void logInSecond(String username, String password)
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage("http://shop.by");
        loginPage.logIn(username, password);
    }
    public boolean isLoggedIn()
    {
        LoginPage loginPage = new LoginPage(driver);
        return (loginPage.isLogIn());
    }
    public void logOutSecond(String username, String password){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage("http://shop.by");
        loginPage.logOut(username,password);
    }
    public boolean isLoggedOut()
    {
        LoginPage loginPage = new LoginPage(driver);
        return (loginPage.isLogOut());
    }
    public void changePassorwd(String username, String password)
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage("http://shop.by");
        loginPage.changePassorwd(username, password);
    }
    public boolean ischangePassorwd()
    {
        LoginPage loginPage = new LoginPage(driver);
        return (loginPage.ischangePassorwd());
    }

    public void Search(String searcword){
        Search search = new Search(driver);
        search.openPage("http://shop.by/");
        search.Search(searcword);
    }
    public boolean isSearched()
    {
        Search search = new Search(driver);
        return (search.isSearch());
    }
    public void AddTOFavor() throws InterruptedException {
        AddTOFavor add = new AddTOFavor(driver);
        add.openPage("http://shop.by/");
        add.AddTOFavor();
    }
    public boolean isAddTOFavor()
    {
        AddTOFavor add = new AddTOFavor(driver);
        return (add.isAddTOFavor());

    } public void DelFromFavor() throws InterruptedException {
        AddTOFavor add = new AddTOFavor(driver);
        add.openPage("http://shop.by/");
        add.DelFromFavor();
    }
    public boolean isDelFromFavor()
    {
        AddTOFavor add = new AddTOFavor(driver);
        return (add.isDelFromFavor());
    }



    public void ChangeSettings(){
        ChangeSettings change = new ChangeSettings(driver);
        change.openPage("http://shop.by");
        change.ChangeSettings();
    }
    public boolean isChangeSettings()
    {
        ChangeSettings change = new ChangeSettings(driver);
        return (change.isChangeSettings());
    }

    public void Sort(){
        Sort Sort = new Sort(driver);
        Sort.openPage("http://shop.by");
        Sort.Sort();
    }
    public boolean isSort()
    {
        Sort Sort = new Sort(driver);
        return (Sort.isSort());
    }

    public void Comment(){
        Comment Comment = new Comment(driver);
        Comment.openPage("http://shop.by");
        Comment.Comment();
    }
    public boolean isComment()
    {
        Comment Comment = new Comment(driver);
        return (Comment.isComment());
    }

}


