package Playsmartbabe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.poi.hpsf.Array;

public class lastsecondnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] numbers ={1,9,6,4,3,8,7,2};
		
		
		int [] u = new int[10];
		
		u[0]=10;
		u[1]=11;
		
		
		
		System.out.println(u.length);
		
		Integer[] z = {1,2,3,4,6,7,8,9,5,0,1};
		
		
		int l = z.length;
		
		
		String [] x = {"om","NamoShiva"};
		
		int c=x.length;
		
		
		//Arrays.sort(z);
		
	ArrayList<Integer> tr= new ArrayList<Integer>(Arrays.asList(z));
		
		
		
		System.out.println("after sorting"+z[z.length-2]);
		
		
	List<String> li= new ArrayList<String>();
	
	
		li.add("om");
		li.add("Sai");
		li.add("Shiv");
		int temp=0;
		
		System.out.println("the list size is"+li.size());
		
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[j]>numbers[i])
				{
					
				temp=numbers[j];
				
				numbers[j]=numbers[i];
				numbers[i]=temp;
					
					
				}
				
				
			}
			
			
		}
		
		for(int k=0;k<numbers.length;k++)
		{
		System.out.println(numbers[k]);
		}

	}

}
