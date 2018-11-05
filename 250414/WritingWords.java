import java.io.*;


public class WritingWords
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = 	br.readLine();
		
		WritingWords obj = new WritingWords();
		while(s!=null)
		{
			System.out.println(s + " "+ obj.write(s));
			s = br.readLine();
		}
		
		
	}
	
	public int write(String word)
	{
		String s = word;
		int i,output=0;
		int length = s.length();
		
		for(i=0;i<length;i++)
		{
			output = output+(s.charAt(i)-'A'+1);			
		}
		return output;	
		
	}	
	
	
	
}
