package srm_735_div_1;

public class Main {
	public static void main(String[] args){
		PalindromeSubsequence object = new PalindromeSubsequence();
		String input = "bababba";
		long time1 = System.nanoTime();
		object.optimalPartition(input);		
		System.out.println(System.nanoTime()-time1);
				
	}
}
