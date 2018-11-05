package srm_735_div_2;

public class BinaryCalculator {

	public int minimumSteps(int a,int b){
	
		int difference = b-a;				
		if(difference>=0){						
			return (difference / 3)+((difference%3)*2);
		}else{
			return -((difference / 2)-((difference%2)));
		}
	}
}
