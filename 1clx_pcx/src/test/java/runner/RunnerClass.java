package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\Vasanthakumar\\eclipse-workspace\\1clx_pcx\\src\\test\\resources\\featureFiles\\PcxLogin.feature",
                 glue="stepDefinitions",
                 dryRun =false,
                 plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","html:report/WebReport.html" ,"json:report/jsonreport.json"} )

public class RunnerClass {
	

}
