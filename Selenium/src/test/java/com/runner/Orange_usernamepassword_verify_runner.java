package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features\\Orange_usernamepassword_Verify.feature", 
glue = {"com.Stepdefinitions","hook"},
dryRun = false)

public class Orange_usernamepassword_verify_runner {

}
