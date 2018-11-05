package srm_734_div_1;

public class TheRoundCityDiv1 {

	public long find(int r){
		return findAll(r)-findAll(r-1);
	}
	public int findAll(int r){
		if(r==0){
			return 0;
		}
		if(r==1){
			return 4;
		}
		int intermediate = ((r-1)*2)+1; 
		int output = 4+(intermediate*intermediate-1);
		System.out.println(output);
		return output;
	}
}
