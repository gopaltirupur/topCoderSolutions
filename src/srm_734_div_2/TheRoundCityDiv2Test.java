package srm_734_div_2;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TheRoundCityDiv2Test {

	TheRoundCityDiv2 object = new TheRoundCityDiv2();
	@Test
	public void test0() {
		Assert.assertEquals(4,object.find(1));
	}
	@Test
	public void test1() {
		Assert.assertEquals(12,object.find(2));
	}
	@Test
	public void test2() {
		Assert.assertEquals(28,object.find(3));
	}
	@Test
	public void test3() {
		Assert.assertEquals(8652,object.find(47));
	}

}
