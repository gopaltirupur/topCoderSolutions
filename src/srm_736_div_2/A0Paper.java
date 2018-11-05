package srm_736_div_2;

public class A0Paper {

	public String canBuild(int[] A){
		int value = 1;		
		for(int i = 0;i<A.length;i++){			
			if(value<=A[i]){
				return "Possible";
			}else if(i<A.length-1){
				A[i+1]+=(2*A[i]);
			}
			value = (int) Math.pow(2, i);
		}
		return "Impossible";
	}
	
	public String canBuildNew(int[] A){
		int i;
		for(i=A.length-1;i>0;i--){
			A[i-1]+=A[i]/2;
		}
		return A[i]>0?"Possible":"Impossible";
	}
}
