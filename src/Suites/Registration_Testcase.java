package Suites;

import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.TestBase;
import Utills.Test_Utills;

public class Registration_Testcase extends TestBase {
	
	@Before
	public void pre_Condition() throws IOException {
		doInitialization(); 
		
		boolean runCondition= Test_Utills.IsSkip("Registration_Testcase");
		if(runCondition==false) {
			Assert.assertTrue(false);
		}
		
	}
	
	
	
	@Test
	public void do_Registration() throws InterruptedException {
	 driver.get(prop_Config.getProperty("url"));
		Test_Utills.doLogin("Tester","test");
		//we can initialize WebElement in Base class
		
		WebElement Orders=  get_Objects("order");
		Orders.click();
		
		Thread.sleep(1000);
		
		WebElement products=get_Objects("pd");
		products.sendKeys("ScreenSaver");
		  
		   WebElement qt=get_Objects("qt");
			qt.sendKeys("2");
			
			WebElement cn= get_Objects("cn");
		   cn.sendKeys("Moni");
		   WebElement st= get_Objects("st");
		   st.sendKeys("Tiruchanoor");
		   WebElement city=get_Objects("city");
		   city.sendKeys("Tirupati");
		   WebElement zip =get_Objects("zip");
		   zip.sendKeys("517503");
		   WebElement card=get_Objects("card");
			card.click();
			WebElement cardnum=get_Objects("cardnum");
			cardnum.sendKeys("12345678901234");
			WebElement exp=get_Objects("exp");
			exp.sendKeys("23/23");
		 WebElement pr=get_Objects("pr");
		  pr.click();
		  WebElement s=get_Objects("s");
			
			if(s.isDisplayed())
			{
				System.out.println("Order processed");
				
			}
			
			else
			{
				System.out.println("Order not processed");
			}
		
		
	}
	
	/*@After
	public void Post_Condition() {
		driver.close();
	}*/
	

}
