package srm_731_div_2;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class RingLex_Test {

	private RingLex ringLex = new RingLex(); 
	@Test
	public void test000() {
		Assert.assertEquals("abc", ringLex.getmin("cba"));
	}

	@Test
	public void test001() {
		Assert.assertEquals("abc", ringLex.getmin("acb"));
	}

	@Test
	public void test002() {
		Assert.assertEquals("aaaabcb", ringLex.getmin("abacaba"));
	}

	@Test
	public void test003() {
		Assert.assertEquals("aabab", ringLex.getmin("aaabb"));
	}

	@Test
	public void test004() {
		Assert.assertEquals("abazabaz", ringLex.getmin("azzzabbb"));
	}

	@Test
	public void test005() {
		Assert.assertEquals("aaaaaa", ringLex.getmin("abbaac"));
	}
	
	@Test
	public void test006() {
		Assert.assertEquals("dehifsfsoy", ringLex.getmin("fsdifyhsoe"));
	}
}
