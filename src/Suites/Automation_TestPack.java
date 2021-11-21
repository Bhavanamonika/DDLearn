package Suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Contact_US_TestCase.class, Forgot_Password_Testcase.class, Login_Testcase.class,
		Registration_Testcase.class })
public class Automation_TestPack {

}
