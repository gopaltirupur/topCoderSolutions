package srm_736_div_2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class A0PaperTest {

	A0Paper aoPaper = new A0Paper();
	
	String possible = "Possible";
	String impossible = "Impossible";	
	
	@Test
	public void test1() {
		int[] input  = {0,1,2};
		long time1 = System.nanoTime();
		Assert.assertEquals(aoPaper.canBuildNew(input  ), possible);
		long time2 = System.nanoTime();
		System.out.println(time2-time1);
	}
	@Test
	public void test2() {
		int[] input  = {0,0,0,0,15};
		long time1 = System.nanoTime();
		Assert.assertEquals(aoPaper.canBuildNew(input), impossible);
		long time2 = System.nanoTime();
		System.out.println(time2-time1);
	}

	@Test
	public void test3() {
		int[] input  = {2,0,0,0,0,0,0,3,2,0,0,5,0,3,0,0,1,0,0,0,5};
		long time1 = System.nanoTime();
		Assert.assertEquals(aoPaper.canBuildNew(input  ), possible);
		long time2 = System.nanoTime();
		System.out.println(time2-time1);
	}
}
