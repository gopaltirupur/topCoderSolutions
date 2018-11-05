package srm_734_div_1;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TheRoundCityDiv1Test {

	TheRoundCityDiv1 object = new TheRoundCityDiv1();
	
	@Test
	public void test0() {
		Assert.assertEquals(4, object.find(1));
	}
	@Test
	public void test1() {
		Assert.assertEquals(8, object.find(2));
	}
	@Test
	public void test2() {
		Assert.assertEquals(16, object.find(3));
	}
	@Test
	public void test3() {
		Assert.assertEquals(368, object.find(47));
	}
}
