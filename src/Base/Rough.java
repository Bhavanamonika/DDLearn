package Base;

public class Rough {

	public static void main(String[] args) {
	
	Xls_Reader data=new Xls_Reader("D:\\Automation Testing\\JAVA PROGRAMS\\Learning_Data_Driven_Approach\\src\\Inputs\\AutomationSuite.xlsx");
	
	System.out.println(data.getCellData("TestCases", 1, 1));
	int rowCount=data.getRowCount("TestCases");
	int columnCount=data.getColumnCount("TestCases");
	System.out.println("Number of rows :"+ rowCount);
	System.out.println("Number of Columns :"+ columnCount);
	
	//String inputTestCase="Login_Testcase";
	String inputTestCase="Registration_Testcase";
	
	for(int rowNumber=2;rowNumber<=rowCount;rowNumber++ ) {
		
		if(inputTestCase.equals(data.getCellData("TestCases",0, rowNumber))) {
			
			if(data.getCellData("TestCases",2,rowNumber).equals("Y")) {
				System.out.println("Run the TestCase");
				
			}
			else {
				System.out.println("Skip the TestCase");
				
			}
			
		
			}
		}

		
	}
	
	
	}


