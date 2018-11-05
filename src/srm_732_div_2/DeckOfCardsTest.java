package srm_732_div_2;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class DeckOfCardsTest {

	DeckOfCards object = new DeckOfCards();
	String perfect = "Perfect";
	String notPerfect = "Not perfect";
	
	@Test
	public void test0() {
		Assert.assertEquals(perfect, object.IsValid(1, new int[]{10}, "z"));
	}
	@Test
	public void test1() {
		Assert.assertEquals(perfect, object.IsValid(3, new int[]{1,2,3,}, "hhh"));
	}
	@Test
	public void test2() {
		Assert.assertEquals(perfect, object.IsValid(4, new int[]{2,3,2,3,}, "hcch"));
	}
	@Test
	public void test3() {
		Assert.assertEquals(notPerfect, object.IsValid(3, new int[]{1,1,1,}, "hch"));
	}
	@Test
	public void test4() {
		Assert.assertEquals(notPerfect, object.IsValid(4, new int[]{1,2,3,4}, "hhcc"));
	}

}
