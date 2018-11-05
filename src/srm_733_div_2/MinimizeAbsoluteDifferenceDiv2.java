package srm_733_div_2;

public class MinimizeAbsoluteDifferenceDiv2 {
	public int[] findTriple(int x0, int x1, int x2){
		int[] input = new int[]{x0,x1,x2};
		int[][] arrayOfArrays  = new int[][]{{0,1,2},{0,2,1},{1,0,2},{1,2,0},{2,0,1},{2,1,0}};
		int[] output = null;
		Double value = null;
		for(int i=0;i<arrayOfArrays.length;i++){
			double tmpValue = Math.abs(((double)input[arrayOfArrays[i][0]]/(double)input[arrayOfArrays[i][1]])
					-(double)input[arrayOfArrays[i][2]]);
			if(value==null||tmpValue<value){
				output = arrayOfArrays[i];
				value = tmpValue;
			}
		}
		return output;
	}
}
