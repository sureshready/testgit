package Playsmartbabe;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=1516;
		
		int count=0;
		
		for(int i=0;i<x/2;i++)
		{
			if(x%2==0)
			{
				
				count++;
			}
		
		}
		
		if(count<=2)
		{
			
			System.out.println("the number is prime");
		}
		
		else
		{
			
			System.out.println("the number is other than prime");
		}
	}

}
