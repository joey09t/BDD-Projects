package stepDefiniton1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/datatable"}, glue= {"stepDefiniton1"})
public class TestRunner {

}
