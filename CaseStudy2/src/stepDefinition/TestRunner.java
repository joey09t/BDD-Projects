package stepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/scLog"}, glue= {"stepDefinition"}, plugin= {"pretty"})
public class TestRunner {

}
