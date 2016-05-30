package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Steps.Steps;

public class AutoTests {
    private Steps steps;
    private final String USERNAME = "AlexxxanderN13@gmail.com";
    private final String PASSWORD = "123456789";
    private final String searchworld = "���������";




    @BeforeMethod(description = "Init Browser")
    public void setUp(){
        steps=new Steps();
        steps.initBrowser();
    }

    //����
    @Test(description = "Login to shop.by")
    public void logInSecond() {
        steps.logInSecond(USERNAME, PASSWORD);
        Assert.assertTrue(steps.isLoggedIn());
        System.out.println("Login to shop.by");
    }
    //�����
    @Test(description = "LogOut to shop.by")
    public void logOutSecond(){
        steps.logOutSecond(USERNAME, PASSWORD);
        Assert.assertTrue(steps.isLoggedOut());
        System.out.println("LogOut to shop.by");
    }
    //��������� ������
    @Test(description = "changePassorwd shop.by")
    public void changePassorwd(){
        steps.changePassorwd(USERNAME, PASSWORD);
        Assert.assertTrue(steps.ischangePassorwd());
        System.out.println("changePassorwd shop.by");
    }

    //�����
    @Test(description = "Search shop.by")
    public void Search(){
        steps.Search(searchworld);
        Assert.assertTrue(steps.isSearched());
        System.out.println("Search shop.by");
    }


    //�������� � ��������
    @Test(description = "AddTOFavor  shop.by")
    public void AddTOFavor() throws InterruptedException {
        steps.AddTOFavor();
        Assert.assertTrue(steps.isAddTOFavor());
        System.out.println("AddTOFavor shop.by");
    }
//������� �� ��������
    @Test(description = "DelFromFavor  shop.by")
    public void DelFromFavor() throws InterruptedException {
        steps.DelFromFavor();
        Assert.assertTrue(steps.isDelFromFavor());
        System.out.println("DelFromFavor shop.by");
    }

    //��������� ������
    @Test(description = "ChangeSettings shop.by")
    public void ChangeSettings() {
        steps.ChangeSettings();
        Assert.assertTrue(steps.isChangeSettings());
        System.out.println("ChangeSettings shop.by");
    }
    //���������� �� ����������
    @Test(description = "Sort shop.by")
    public void Sort(){
        steps.Sort();
        Assert.assertTrue(steps.isSort());
        System.out.println("Sort shop.by");
    }
    //�����
    @Test(description = "Comment shop.by")
    public void Comment(){
        steps.Comment();
        Assert.assertTrue(steps.isComment());
        System.out.println("Comment shop.by");
    }


}
