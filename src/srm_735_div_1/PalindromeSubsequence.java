package srm_735_div_1;

public class PalindromeSubsequence {
	public int[] optimalPartition(String s){
		int length = s.length();
		char[] charArray = s.toCharArray();
		int[] array = new int[length];		
		if(isPalindrome(charArray, length)){
			for(int i=0;i<length;i++){
				array[i] = 1;
			}
		}else{
			for(int i=0;i<length;i++){
				array[i]=charArray[i]=='a'?1:2;								
			}
		}
		return array;
	}
	
	private boolean isPalindrome(char[] charArray,int n){
		for(int i=0;i<n-i-1;i++){
			if(charArray[i]!=charArray[n-i-1]){
				return false;
			}
		}
		return true;
	}
}

 