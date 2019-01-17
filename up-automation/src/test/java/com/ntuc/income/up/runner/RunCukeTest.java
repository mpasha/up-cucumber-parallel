package com.ntuc.income.up.runner;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
glue = "com/ntuc/income/up/steps",
tags = { "@facebook_proto" },
dryRun = false,
strict = true,
monochrome = true,
plugin = {
		"pretty", 
		"html:target/cucumber_regression", 
		"com.cucumber.listener.ExtentCucumberFormatter:output/report_regression.html",
		"html:target/cucumber-html-report_regression",
		"json:target/cucumber_regression.json",
		"pretty:target/cucumber-pretty_regression.txt",
		"usage:target/cucumber-usage_regression.json",
		"junit:target/cucumber-results_regression.xml"
		})
public class RunCukeTest {

	@AfterClass
	public static void teardown() {
		Reporter.loadXMLConfig(new File("src/test/java/extent-config.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}

	@BeforeClass
	public static void setup() {
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		extentProperties.setReportPath("output/myreport.html");
	}
}
