package srm_730_div_2;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class IntervalIntersectionsTest {

	IntervalIntersections intervalIntersections = new IntervalIntersections();
	
	@Test
	public void test000() {
		Assert.assertEquals(1, intervalIntersections.minLength(3,6,1,2));
	}
	
	@Test
	public void test001() {
		Assert.assertEquals(1, intervalIntersections.minLength(1,2,3,6));
	}
	@Test
	public void test002() {
		Assert.assertEquals(0, intervalIntersections.minLength(1,10,2,5));
	}
	@Test
	public void test003() {
		Assert.assertEquals(0, intervalIntersections.minLength(4,5,1,4));
	}
	@Test
	public void test004() {
		Assert.assertEquals(999999, intervalIntersections.minLength(1,1,1000000,1000000));
	}
}
