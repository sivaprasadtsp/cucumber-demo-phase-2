package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sivap\\eclipse-workspace\\Lesson5-CucumberDemo\\src\\test\\java\\features\\starhealth.feature",
   				 glue= {"steps"},
				dryRun=false,
				plugin={"pretty",
						"html:target/cucumberreport.html"},
			//	tags="@all" // all the scenarios of feature file will be executed
			//	tags="@login" // only login will run
		     //   tags="@login and @logout"  // only scenarios having both the tags login and logout should run
		   //   tags = "@login or @logout"  
		    		// only scenarios having any of  the tags login or logout should run
		 //  tags = "not @logout" // avoid logout scenario and run the rest of the scenarios
		// tags = "@regression or @smoke or @functional" 
				tags="@training or @simplilearn"
				// all scenarios with tag regression will run
		
		
		
		)
public class TestRunner {
	// A Cucumber runner file is used to build a communication between your feature files and step definition file
		// whenever we have to run multiple features or multiple steps, then we use Cucumber runner file
		// whenever have to generate reports as mentioned below, we will use Cucumber runner file
		/*  - cucumber reports
		    - Extend Reports
		    - Cucmber reprots in PDF format
		    - HTML reports
		    - TestNG reports */
		// Whenever we want to generate console output in a different format, a readable format we will use Cucumber runner file
		// If we have to set want to do below mentioned tasks , we use 
		// cucumber run options
		/*
		 * > set strict conditions for step mapping in feature file and step definition
		 * file, > execute few test steps > ignore or include few test stpes (tagging or
		 * groupping)
		 */
	/* Various Cucumber options or properties:
	 * features :comma separated paths to feature files. 
	 * dryRun=true : it will check if every steps has an step defintion method implemented
	 * When dryRun=true, it doesnot execute the cucumber step defintion file, it just matched and check every steps has a glued code
	 * glue : comma separated package names of step defintion files
	 * plugin = pretty : more details output and a more understanble format
	 * Tags will come under plugin property, and they will be mentione din the runner file
	 */
}
