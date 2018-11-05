import java.io.*;


public class LongWordsDiv2
{
	
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		LongWordsDiv2 obj = new LongWordsDiv2();
		while(s!=null)
		{
			System.out.println(obj.find(s));
			
			s=br.readLine();
		}
		
	}
	
	public String find(String word	)
	{
		String s = word,output="Likes";
		int length = s.length(),i,j,k,l;
		
		
		for(i=0;i<length;i++)
		{
			if(s.charAt(i)<'A'||s.charAt(i)>'Z')
			{
			//	System.out.println("*");
				output="Dislikes";	
				return output;		
			}
			
		}
		for(i=0;i<length-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
			//	System.out.println("**");
				output="Dislikes";			
				return output;
			}
		}
		
		for(i=0;i<length-3;i++)
		{
			for(j=i+1;(j<length-2) && (i!=j);j++)
			{
					for(k=j+1;k<length-1;k++)
					{
						for(l=k+1;(l<length) && (k!=l) ;l++)
						{
								if( (s.charAt(i) == s.charAt(k)) && (s.charAt(j) == s.charAt(l)) )
								{									
									System.out.println(s+" : "+s.charAt(i)+" "+s.charAt(j)+" "+s.charAt(k)+" "+s.charAt(l));
									output = "Dislikes";		
									return output;					
								}
						}						
					}				
			}			
		}	
		
		
		return output;
	}	
}


