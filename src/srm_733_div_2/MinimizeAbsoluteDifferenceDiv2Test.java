package srm_733_div_2;

import static org.junit.Assert.*;


import org.junit.Assert;
import org.junit.Test;

public class MinimizeAbsoluteDifferenceDiv2Test {

	MinimizeAbsoluteDifferenceDiv2 object = new MinimizeAbsoluteDifferenceDiv2();
	
	@Test
	public void test0() {
		Assert.assertArrayEquals(new int[]{0,1,2,}, object.findTriple(1, 1, 1));
	}
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[]{1,2,0,}, object.findTriple(1,2,3));
	}
	@Test
	public void test2() {
		Assert.assertArrayEquals(new int[]{1,0,2,}, object.findTriple(7,20,5));
	}
	@Test
	public void test3() {
		Assert.assertArrayEquals(new int[]{0,1,2,}, object.findTriple(6,2,3));
	}
	@Test
	public void test4() {
		Assert.assertArrayEquals(new int[]{2,1,0,}, object.findTriple(10,11,111));
	}
	

}
