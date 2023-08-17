package pro1;

import org.testng.annotations.Test;

public class TestCase {

	
	@Test
	public void VerifyLandingPage() {
		SwagLabsa.landingPageTest();
	}
	
	
	@Test
	public void LoginErrormsgTest() {
		SwagLabsa.errormessage();
	}
}
