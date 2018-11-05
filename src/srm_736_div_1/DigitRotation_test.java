package srm_736_div_1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class DigitRotation_test {

	DigitRotation digitRotation = new DigitRotation();	
	
	@Test
	public void testSumRotations0() {		
		Assert.assertEquals(312, digitRotation.sumRotations("123"));
	}
	@Test
	public void testSumRotations1() {		
		Assert.assertEquals(10407, digitRotation.sumRotations("3570"));
	}
	@Test
	public void testSumRotations2() {		
		Assert.assertEquals(21208, digitRotation.sumRotations("5545"));
	}
	@Test
	public void testSumRotations3() {		
		Assert.assertEquals(867286291, digitRotation.sumRotations("1283749218734901238749213847902"));
	}
	@Test
	public void testSumRotations4() {		
		Assert.assertEquals(0, digitRotation.sumRotations("4"));
	}
}
