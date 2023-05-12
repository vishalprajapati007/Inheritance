package Data;

import org.testng.annotations.Test;

public class PS1 extends PS {

	@Test
	public void S1()	
	{
		PS2 ps2 = new PS2(4);
		int a=4;
	    System.out.println(ps2.increment());	
		System.out.println(ps2.decrement());
	   // PS3 ps3 = new PS3(4);
	    System.out.println( ps2.MultiplayThree());
	    S2();//parent class
	}
}
