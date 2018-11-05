package srm_733_div_1;

public class Permute {	
	
	public static void main(String[] args){
		
		int[] currentArray = new int[]{0,1,2,3,4,};
		permute(currentArray,0);
		
		
	}
	
	private static void permute(int[] input,int currentPosition){
		int tmp =0;
		if(currentPosition == input.length){
			for(int i=0;i<input.length;i++){
				System.out.print(input[i]);
			}
			System.out.println("");
		}else{
			for(int i=currentPosition;i<input.length;i++){
				
				tmp = input[i];
				input[i] = input[currentPosition];
				input[currentPosition]=tmp;			
				
				permute(input, currentPosition+1);
				
				tmp = input[i];
				input[i] = input[currentPosition];
				input[currentPosition]=tmp;
				
			}
		}
	}
}
