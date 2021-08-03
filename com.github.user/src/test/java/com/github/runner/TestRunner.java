package com.github.runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features={"src/test/resources/featurefile"},
		glue={"com.github.stepdefinition","com.github.hooks"},
		plugin = {"pretty","html:target/cucumber-html-report"},
		tags = "@GitHubUserInfo",
		monochrome = true
		)


public class TestRunner {

}
