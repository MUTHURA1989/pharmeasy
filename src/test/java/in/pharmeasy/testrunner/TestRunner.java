package in.pharmeasy.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\MUTHURA\\eclipse-workspace\\CGT\\Pharmeasy\\src\\test\\resources\\pharmeasy.feature",

glue="in.pharmeasy.step",
//tags= {"@productname"},

plugin= {"html:target","json:target/report.json"}

)

public class TestRunner {

}

