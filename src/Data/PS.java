package Data;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {

	
	public void S2()
	{
		System.out.println("Hello This is Test");
	}
	
	@BeforeMethod
	public void S3()
	{
		System.out.println("Clear the cooki");

	}
	
	@AfterMethod
	public void S4()
	{
		System.out.println("It's Completed");

	}
}
