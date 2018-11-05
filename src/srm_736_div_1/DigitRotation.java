package srm_736_div_1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class DigitRotation {

	public int sumRotations(String X){
		if(X.length()<3)
			return 0;
		int modulo = 998244353;
		BigInteger bigInteger = new BigInteger("0"); 
		int length = X.length();
		char[] charArr = X.toCharArray();
		for(int i=0;(i<length-2);i++){			
			for(int j=i+1;(j<length-1);j++){				
				for(int k=j+1;k<length;k++){
					if(!(i==0&&(charArr[k]=='0'))){						
						bigInteger = bigInteger.
								add(new BigInteger(provideRequiredString(X, i, j, k)));	
					}					
				}
			}
		}
		return Integer.valueOf(bigInteger.mod(new BigInteger(modulo+"")).toString());
	}
	
	private String provideRequiredString(String inputString,int i,int j,int k){
		char[] charArr = inputString.toCharArray();
		String output = "";
		char charAtI = charArr[i];
		char charAtJ = charArr[j];
		char charAtK = charArr[k];
		charArr[i] = charAtK;
		charArr[j] = charAtI;
		charArr[k] = charAtJ;		
		for(int l=0;l<charArr.length;l++){
			output+=charArr[l];
		}		
		return output;		
	}	
}
