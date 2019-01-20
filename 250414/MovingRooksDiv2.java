import java.io.*;

public class MovingRooksDiv2
{
	
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		int[] Y1;
		int[] Y2[];
		
		s1 = s1.substring(1,s1.length()-1);		
		s2 = s2.substring(1,s2.length()-1)	;	
		String s1_arr[] = s1.split(",");
		String s2_arr[] = s2.split(",");
		int i;
		
		for(i=0;i<s1_arr.length;i++)
		{
			
			
		}
		
		
	}
	
	public String move(int[] Y1,int[] Y2)
	{
		int length = Y1.length;
		int i,j;
		
		for(i=0;i<length;i++)
		{
			if(Y1[i] != Y2[i])
				break;
			return "Possible";			
		}
		
		
		for(i=0;i<length-1;i++)
		{
			for(j=i+1;j<length;j++)
			{
				
			
			
			}
		}	
		return "PENDING";
	}	
	
	public int check(int[] Y)
	{
		int length = Y.length;
		int i,j;
		for(i=0;i<length-1;i++)
		{
			for(j=i+1;j<length;j++)
			{
					if(Y[i] == Y[j])
						return 0;			
			}			
		}
		return 1;		
	}
	
}
