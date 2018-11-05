package srm_731_div_1;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TreesAndBracketsTest {

	private TreesAndBrackets treesAndBrachket = new TreesAndBrackets();
	private static String possible = "Possible";
	private static String impossible = "Impossible";
	
	@Test
	public void test000() {
		Assert.assertEquals(possible, treesAndBrachket.check("(())", "()"));
	}
	@Test
	public void test001() {
		Assert.assertEquals(possible, treesAndBrachket.check("()", "()"));
	}
	@Test
	public void test002() {
		Assert.assertEquals(impossible, treesAndBrachket.check("(()()())", "((()))"));
	}
	@Test
	public void test003() {
		Assert.assertEquals(possible, treesAndBrachket.check("((())((())())())", "(()(())())"));
	}
	@Test
	public void test004() {
		Assert.assertEquals(impossible, treesAndBrachket.check("((())((())())())", "((()()()()()))"));
	}

}
