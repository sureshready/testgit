package Playsmartbabe;

public class PrimeSeries {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x=100;
		int count;
	
		for(int i=2;i<x;i++)
		{
			count=0;
			for(int j=1;j<=i/2;j++)
			{
				
				
				if(i%j==0)
				{
					count++;
					
				}
				
			}
			
			
			if((count<2))
			{
				
				System.out.println(i);
			}
			
			
		}
		
		
		
	}

}
