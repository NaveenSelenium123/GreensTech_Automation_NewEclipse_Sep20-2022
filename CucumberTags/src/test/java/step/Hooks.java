package step;



import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends base.BaseClass {
	@Before
	public void beforeScenario() {
	browserConChrome();
	openApplication("https://www.facebook.com");
	maximizeWindow();
	}
	@After
	public void afterScenario() throws InterruptedException {
		Thread.sleep(3000);
		closeBrowser();
	}
}
