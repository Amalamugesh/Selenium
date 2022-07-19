package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features\\Google.feature", 
glue = {"com.Stepdefinitions","hook"},
dryRun = true
)
public class Google_runner {

}
