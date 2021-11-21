package Suites;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Base.TestBase;
import Utills.Test_Utills;

@RunWith(Parameterized.class)
public class Login_Testcase extends TestBase{
	
	//Verify and validate login screen
	
String userName;
String password;

public Login_Testcase(String Username,String Password)
{
	userName=Username;
	password=Password;
}


	@Before
	public void pre_Condition() throws IOException {
		doInitialization(); //from Base class
		boolean runCondition= Test_Utills.IsSkip("Login_Testcase");
		if(runCondition==false) {
			Assert.assertTrue(false);
		}
		
	}
	@Test
	public void verify_Login() {
		//1.Open browser		//2.Go to URL 		//3.enter un,psd
   driver.get(prop_Config.getProperty("url"));
  //driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProducts.aspx");
   Test_Utills.doLogin(userName,password);// from utills class
		
		 if(isLoggedin==true) {
			 System.out.println("Logged in Successfully");
		 }
		 
		 else {
			 System.out.println("Logged in UnSuccessfull");
		 }
	}
	
	/*@After
	public void post_Condition() {
		driver.close(); 
	}
	*/

	@Parameters
	public static Collection<String[]> testData(){
		/*String data[][]= new String[1][2];
		data[0][0]="Tester";
		data[0][1]="test";*/
		String data[][]=Test_Utills.getData("Login_Testdata");
			
		return Arrays.asList(data);
	}	

}
