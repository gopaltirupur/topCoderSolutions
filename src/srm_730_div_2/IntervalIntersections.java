package srm_730_div_2;

//IntervalIntersections 
public class IntervalIntersections {
	public int minLength(int x1, int y1, int x2, int y2){
		if((x2<=y1&&x2>=x1)||(x1<=y2&&x1>=x2)){
			return 0;
		}else if(x2>y1){
			return x2-y1;
		}else if(x1>y2){
			return x1-y2;
		}
		return 1;
	}
}
