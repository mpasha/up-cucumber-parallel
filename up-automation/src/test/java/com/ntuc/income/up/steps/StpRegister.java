package com.ntuc.income.up.steps;

import com.ntuc.income.up.base.BaseUtil;
import com.ntuc.income.up.model.RegisterOuterClass;
import com.ntuc.income.up.pages.RegisterPage;
import com.ntuc.income.up.utilities.EnvironmentData;
import com.ntuc.income.up.utilities.ProtoMapper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

public class StpRegister {
    private BaseUtil base;
    private RegisterPage registerPage;
    public RegisterOuterClass.Register register;

    public StpRegister(BaseUtil base) {
        this.base = base;
        registerPage = new RegisterPage(this.base.Driver);
    }



    @Given("^user launches the facebook$")
    public void user_launches_the_facebook() throws Throwable {
//        new EnvironmentData("Register");
        registerPage.waitForFacebookPage(this.base.Driver);
    }

    @Given("^user launches the facebook \"(.*?)\",\"(.*?)\"$")
    public void user_launches_the_facebook(String sheetName, String scenarioName) throws Throwable {
        List<Map<String, String>> excelMap = new EnvironmentData(sheetName).getRowsData(scenarioName);
        register = (RegisterOuterClass.Register) ProtoMapper.transposeAndCast(excelMap, RegisterOuterClass.Register.getDefaultInstance()).get(0);
    }

    @When("^user enters signup information \"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\"$")
    public void user_enters_signup_information(String firstName, String lastName, String emailOrMobile, String signUpPassword) throws Throwable {
        registerPage.waitForFacebookPage(this.base.Driver);
        registerPage.enterSignUpInfo(firstName, lastName, emailOrMobile, signUpPassword);
    }

    @When("^user clears sign up information$")
    public void user_clears_sign_up_information() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        registerPage.clearSignUpInfo();
    }
//    @Then("^sign up info is cleared$")
//    public void sign_up_info_is_cleared() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }

    @When("^user enters signup information$")
    public void user_enters_signup_information() throws Throwable {
//        registerPage.waitForFacebookPage(driver);
//        RegisterPage.enterSignUpInfo(hashMap.get("FirstName"), hashMap.get("LastName"),hashMap.get("EmailOrMobile"),hashMap.get("SignUpPassword"));

        registerPage.enterSignUpInfo(register.getFirstName(), register.getLastName(), register.getEmailOrMobile(), register.getSignUpPassword());

    }

}
