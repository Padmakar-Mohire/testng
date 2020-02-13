package TestNGP;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataparameterized {
	
	@Test (dataProvider="testData")
	public void RegisterUser(String FirstName,String Lastname,String Email,String Password) {
		System.out.println(FirstName);
		System.out.println(Lastname);
		System.out.println(Email);
		System.out.println(Password);
	}	
	
		@DataProvider             //(name="Data")
		public Object[][] testData(){
			Object[][] obj=new Object[3][4];
			
			
			obj[0][0]="rajesh";
			obj[0][1]="sathe";
			obj[0][2]="e@gmail.com";
			obj[0][3]="123";
			

			obj[1][0]="jesh";
			obj[1][1]="sane";
			obj[1][2]="e23@gmail.com";
			obj[1][3]="123456";
			

			obj[2][0]="rani";
			obj[2][1]="kumar";
			obj[2][2]="456@gmail.com";
			obj[2][3]="456";
			return obj;
			
			
		}
		
	

}
