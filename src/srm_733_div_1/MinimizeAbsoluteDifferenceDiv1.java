package srm_733_div_1;

import java.util.ArrayList;
import java.util.List;

public class MinimizeAbsoluteDifferenceDiv1 {
	List<int[]> listOfPermutations = new ArrayList<>();
	public int[] findTuple(int[] x){
		int[] output = null;
		double[] xDouble = new double[x.length];
		for(int i=0;i<xDouble.length;i++){
			xDouble[i] = x[i]+0.0;
		}
		int[] indexArray = new int[x.length];
		for(int i=0;i<x.length;i++){
			indexArray[i] = i;
		}
		permute(indexArray,0);
		Double value = null;
		for(int[] currentArray : listOfPermutations){			
			double currentValue = Math.abs((xDouble[currentArray[0]]/xDouble[currentArray[1]])
					-(xDouble[currentArray[2]]/xDouble[currentArray[3]]));
			if((value==null)||(currentValue<value)){
				value = currentValue;
				output = currentArray;
			}
		}
		return new int[]{output[0],output[1],output[2],output[3],};
	}
	
	private void permute(int[] input,int currentPosition){
		int tmp = 0;
		if(currentPosition==input.length){
			listOfPermutations.add(input.clone());
		}else{
			for(int i=currentPosition;i<input.length;i++){
				tmp = input[i];
				input[i] = input[currentPosition];
				input[currentPosition] = tmp;
				permute(input, currentPosition+1);
				tmp = input[i];
				input[i] = input[currentPosition];
				input[currentPosition] = tmp;
			}
		}
	}
}
