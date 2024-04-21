package test;

import java.util.Map;

import org.testng.annotations.Test;

import mobilePages.LoginPage;

public class TestUsingXmlFile extends MobileBaseTest{
	
	@Test
	public void testUsingXmlFile(Map<String,String>data) throws InterruptedException {
		
		new LoginPage().getUserNameTextField("standard_user").getPasswordTextField("secret_sauce").getLoginButton();
		
		Thread.sleep(3000);
	}

}
