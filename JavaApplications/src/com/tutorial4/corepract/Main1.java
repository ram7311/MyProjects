package com.tutorial4.corepract;

public class Main1
{
	public static void main(String[] args) 
	{
	    /*Question Input: samples[] = {345, 604, 321, 433, 704, 470, 808, 718, 517, 811}, 
	    ranges[] = {{300, 380}, {400, 700}}
        Output: 2 4*/
	    int[] samples = {345,604,321,433,704,470,808,718,517,811};
	    int[][] ranges = {{300,380},{400,700}};
	    int a=0,b=0;
	    for(int i=0;i<samples.length;i++)
	    {
	        if(ranges[0][0]<=samples[i] && samples[i]<=ranges[0][1])
	        {
	            a++;
	        }
	        if(ranges[1][0]<=samples[i] && samples[i]<=ranges[1][1])
	        {
	            b++;
	        }
	        
	    }
		System.out.println(a+" "+b);
		
		
		/*Question: Print the first N terms of the series 6, 28, 66, 120, 190, 276, …
		formula : k*(2*k-1)*/
		
		int k=2,n=10;
		for(int i=0;i<=n;i++)
		{
		    System.out.print(k*(2*k-1)+" ");
		    k+=2;
		}
		System.out.println();
		
		//Question: Amstrong number or not ext:153
		
		int Amstrong=153;
		int t=0,c=0;
		while(Amstrong>0)
		{
		    t=Amstrong%10;
		    c=c+(t*t*t);
		    Amstrong=Amstrong/10;
		    
		}
		System.out.println(c);//153
		
		
	}//main close
}//class close
