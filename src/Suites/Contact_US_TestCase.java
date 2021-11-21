package Suites;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Base.TestBase;
import Utills.Test_Utills;

public class Contact_US_TestCase extends TestBase {
	
	@Before 
	public void pre_Condition() throws IOException {
		doInitialization(); //from Base class
		boolean runCondition= Test_Utills.IsSkip("Contact_US_TestCase");
		if(runCondition==false) {
			Assert.assertTrue(false);
		}
		
	}
	
	
	@Test
	public void ContactUs() {
		System.out.println("Contact US Page");
	}

}
