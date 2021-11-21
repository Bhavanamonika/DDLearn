package Utills;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.TestBase;
import Base.Xls_Reader;

public class Test_Utills extends TestBase {
//readily Available function for common/repeated/most used tasks
//Commonly used functionalities 

//First Login Function
//Inherit TestBase Class to use the Properties of that class
	
public static void doLogin(String usernameData, String passwordData ) {	
	 WebElement username=  get_Objects("username");
     username.sendKeys(usernameData);
     WebElement password=get_Objects("password");
	 password.sendKeys(passwordData);
	 WebElement login =get_Objects("login");
	 login.click();
List<WebElement>Order=driver.findElements(By.xpath(prop_Object.getProperty("order")));
if(Order.size()!=0) {
	isLoggedin=true;
}
else
{
	
isLoggedin=false;
}


		
	 //WebElement order=get_Objects("order");
		
		/*if(order.isDisplayed())
		{
			//System.out.println("Login is done successfully");
			isLoggedin=true;
		}
		else
		{
			
				//System.out.println("Login failed");
			isLoggedin=false;
		}*/
	
	
}

public static boolean IsSkip(String inputTestCase ) {
	//System.out.println(data.getCellData("TestCases", 1, 1));
	int rowCount=data.getRowCount("TestCases");
	int columnCount=data.getColumnCount("TestCases");
	//System.out.println("Number of rows :"+ rowCount);
	//System.out.println("Number of Columns :"+ columnCount);
	
	for(int rowNumber=2;rowNumber<=rowCount;rowNumber++ ) {
		
		if(inputTestCase.equals(data.getCellData("TestCases",0, rowNumber))) {
			
			if(data.getCellData("TestCases",2,rowNumber).equals("Y")) {
				
				return true;
				
			}
			else {
				return false;
				
			}
			
		
			}
		}
	return false;
}

public static String [][] getData(String sheetName){
data=new Xls_Reader("D:\\Automation Testing\\JAVA PROGRAMS\\Learning_Data_Driven_Approach\\src\\Inputs\\AutomationSuite.xlsx");
	
	int rowCount=data.getRowCount(sheetName);
	int colCount=data.getColumnCount(sheetName);
	System.out.println("SheetName is: " +sheetName);
	System.out.println("Number of rows:" +rowCount);
	System.out.println("Number of columns:" +colCount);
	String testCaseData[][]=new String[rowCount-1][colCount];
	
	//testCaseData[0][0]="Tester";
	
	for(int rowNumber=2;rowNumber<=rowCount;rowNumber++) {
		for(int colnumber=0;colnumber<colCount;colnumber++) {
			
		testCaseData[rowNumber-2][colnumber]=data.getCellData(sheetName, colnumber, rowNumber);	
			
		}
		
	}
	return testCaseData;
	
}



}
