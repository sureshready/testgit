package Playsmartbabe;

public class ReverseaString {
	
	
	public static void main(String[] args) {

		
		
		String s="sosr";
		
		
		char[] words = new char[s.length()];
		
		words=s.toCharArray();
		char[] revwords = new char[s.length()];
	
		for(int i=s.length()-1;i>=0;i--)
		{
		//System.out.println(words[i]);
		
			revwords[(s.length()-1)-i]=words[i];
		}
		
		System.out.println(new String(revwords));
		
	}

}
