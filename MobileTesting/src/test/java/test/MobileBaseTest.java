package test;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import mobileDriver.MobileDriver;

public class MobileBaseTest {
	@BeforeMethod
	public void setUp() throws IOException, ParseException {
		
		
		MobileDriver.initDriver();
		
	}
	@AfterMethod
	public void tearDown() {
		MobileDriver.quitDriver();
		
	}

}
