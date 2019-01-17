package com.ntuc.income.up.pages;

import com.ntuc.income.up.utilities.ReusableLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    ReusableLibrary rs;
    WebDriver driver;
    public RegisterPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        rs = new ReusableLibrary(driver);
        this.driver = driver;
    }

    @FindBy(how= How.XPATH, using="//input[@id='email']")
    public static WebElement txtUserName;

    @FindBy(how= How.XPATH, using="//input[@id='pass']")
    public static WebElement txtPassword;

    @FindBy(how= How.XPATH, using="//input[@value='Log In']")
    public static WebElement btnSubmit;

    @FindBy(how= How.XPATH, using="//input[@name='firstname']")
    public static WebElement txtFirstName;

    @FindBy(how= How.XPATH, using="//input[@name='lastname']")
    public static WebElement txtLastName;

    @FindBy(how= How.XPATH, using="//input[@name='reg_email__']")
    public static WebElement txtMobileOrEmail;

    @FindBy(how= How.XPATH, using="//input[@name='reg_passwd__']")
    public static WebElement txtSignupPassword;

    public void enterSignUpInfo(String firstName,String lastName,String emailOrMobile,String signUpPassword){
        rs.logSendKeys(txtFirstName,firstName);
        rs.logSendKeys(txtLastName,lastName);
        rs.logSendKeys(txtMobileOrEmail,emailOrMobile);
        rs.logSendKeys(txtSignupPassword,signUpPassword);
    }

    public void clearSignUpInfo(){
        txtFirstName.clear();
        txtLastName.clear();
        txtMobileOrEmail.clear();
        txtSignupPassword.clear();
    }

    public void waitForFacebookPage(WebDriver driver){
        rs.WaitforElementtoLoad(driver,"//input[@name='firstname']");
    }
}
