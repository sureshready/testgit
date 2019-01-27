package Playsmartbabe;

public class sentenceinreversewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence ="i am in hyderabad";
		
		//char[] rev=sentence.toCharArray();
		
		String result="";
		
		String[] str = sentence.split(" ");
		
		
		for(int i=(str.length)-1;i>=0;i--)
		{
			
			result=result+str[i]+" ";
		}
	
		
	
		
	System.out.println(result);	
		
		
		
		
	}
	
	

}
