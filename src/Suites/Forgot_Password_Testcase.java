package Suites;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Base.TestBase;
import Utills.Test_Utills;

public class Forgot_Password_Testcase extends TestBase {
	
	@Before
		public void pre_Condition() throws IOException {
		doInitialization(); //from Base class
		
		boolean runCondition= Test_Utills.IsSkip("Forgot_Password_Testcase");
		if(runCondition==false) {
			Assert.assertTrue(false);
		}
		
	}
	
	

@Test
public void forgotPassword() {
	
	System.out.println("Forgot Password");
	
}
	
}
