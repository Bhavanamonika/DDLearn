package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop_Object;
	public static Properties prop_Config;
	public static boolean isLoggedin; //
	public static Xls_Reader data;
	
//Common;y used variables
//Store all Variables in TestBase class only, which can be used across the automation Pack
//Declare and initialize the Variables in TestBase class line Web driver, Properties, Excel,Db

public static void doInitialization() throws IOException {
	if(driver==null) {
data=new Xls_Reader("D:\\Automation Testing\\JAVA PROGRAMS\\Learning_Data_Driven_Approach\\src\\Inputs\\AutomationSuite.xlsx");
		
	
FileInputStream fis_Object=new FileInputStream("D:\\Automation Testing\\JAVA PROGRAMS\\Learning_Data_Driven_Approach\\src\\Configuration\\ObjectRepository.properties");
FileInputStream fis_Config=new FileInputStream("D:\\Automation Testing\\JAVA PROGRAMS\\Learning_Data_Driven_Approach\\src\\Configuration\\Config.properties");
prop_Object=new Properties();
prop_Config=new Properties();
prop_Object.load(fis_Object);
prop_Config.load(fis_Config);
//browsername=Chrome
String browserName=prop_Config.getProperty("browsername");
if(browserName.equals("Chrome".trim())) {
	System.setProperty("webdriver.chrome.driver","D:\\Automation Testing\\Webdriver jars\\chromedriver.exe");
	driver=new ChromeDriver();
	
}	

else if(browserName.equals("ie")){
System.setProperty("webdriver.ie.driver","C:\\Users\\HP\\Documents\\IEDriverServer.exe");
	driver=new InternetExplorerDriver();
	
	
}

}
}

public static WebElement get_Objects(String xpathValue) {
	//this method will return a WebElement
	return driver.findElement(By.xpath(prop_Object.getProperty(xpathValue)));
	
}

}

