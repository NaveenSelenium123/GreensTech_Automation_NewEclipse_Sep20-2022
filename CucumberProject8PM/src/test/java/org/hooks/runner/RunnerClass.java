package org.hooks.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\FacebookHooks.feature",glue="org.hooks.stepdef",
dryRun=false)
public class RunnerClass {

}
