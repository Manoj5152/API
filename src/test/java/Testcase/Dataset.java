package Testcase;

import org.testng.annotations.DataProvider;

public class Dataset {
	
	
	@DataProvider
		public Object[][] dataforpost(){
			
//			Object[][] data= new Object[1][3];
//			
//			data[0][0] = "50000";
//			data[0][1] = "Inners";
//			data[0][2] = "60";
		
		return new Object[][]{
			
			{"28000","Lenein","50"}
		};
			
			//return data;
			
			
			
		}
	
	@DataProvider
	public Object[] delete1() {
		return new Object[] {
					
				4
		
	};
	
	}
}
