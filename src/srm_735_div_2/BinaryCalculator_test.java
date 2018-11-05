package srm_735_div_2;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class BinaryCalculator_test {
	
	BinaryCalculator binaryCalculator = new BinaryCalculator();

	@Test
	public void test0() {
		Assert.assertEquals(3, binaryCalculator.minimumSteps(10, 14));		
	}

	@Test
	public void test1() {
		Assert.assertEquals(0, binaryCalculator.minimumSteps(23, 23));		
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(3, binaryCalculator.minimumSteps(18, 12));		
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(13, binaryCalculator.minimumSteps(23, 62));		
	}
}
