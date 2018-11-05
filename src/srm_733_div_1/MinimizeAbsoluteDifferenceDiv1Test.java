package srm_733_div_1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MinimizeAbsoluteDifferenceDiv1Test {

	MinimizeAbsoluteDifferenceDiv1 object = new MinimizeAbsoluteDifferenceDiv1();
	@Test
	public void test0() {
		Assert.assertArrayEquals(new int[]{0,1,2,3,}, object.findTuple(new int[]{1,1,1,1,1}));
	}
	@Test
	public void test1() {
		Assert.assertArrayEquals(new int[]{0, 3, 1, 4 }, object.findTuple(new int[]{2,3,5,7,11}));
	}
	@Test
	public void test2() {
		Assert.assertArrayEquals(new int[] {1, 0, 3, 4 }, object.findTuple(new int[]{8, 2, 4, 2, 6}));
	}
	@Test
	public void test3() {
		Assert.assertArrayEquals(new int[]{2, 4, 3, 1 }, object.findTuple(new int[]{124, 182, 9, 33, 70}));
	}
	@Test
	public void test4() {
		Assert.assertArrayEquals(new int[]{1, 4, 3, 0 }, object.findTuple(new int[]{9947, 3, 7, 11, 13}));
	}
	@Test
	public void test5() {
		Assert.assertArrayEquals(new int[]{1, 2, 3, 4 }, object.findTuple(new int[]{10000, 4, 10, 4, 10}));
	}
}
