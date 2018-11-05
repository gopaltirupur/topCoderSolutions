package srm_734_div_2;

public class TheRoundCityDiv2 {
	public int find(int r){
		if(r==1){
			return 4;
		}
		int intermediate = ((r-1)*2)+1; 
		int output = 4+(intermediate*intermediate-1);
		System.out.println(output);
		return output;
	}
}
