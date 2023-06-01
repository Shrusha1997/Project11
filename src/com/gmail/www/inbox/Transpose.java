package com.gmail.www.inbox;

public class Transpose
{

	public static void main(String[] args) 
	{
    int[][] original = {{10,20,30}, {11,21,31}, {111,222,333}};
    {
    	for(int i=0;i<=original.length-1;i++)
    	{
    		for(int j=0;j<=original.length-1;j++)
    		{
    			System.out.print(original[i][j]+"\t");
    		}
    		System.out.println(" ");
    	}
    int[][] transpose=new int[original.length][original[0].length];
    	for(int i=0;i<=transpose.length-1;i++)	
    	{
    	for(int j=0;j<=transpose[0].length-1;j++)	
    		{
    			transpose[i][j]=original[i][j];
    		}
    	}
   System.out.println("After transpose"); 
   for(int i=0;i<=transpose.length-1;i++)
   {
	   for(int j=0;j<=transpose[0].length-1;j++)  
	   {
   System.out.print(transpose[i][j]+"\t");
    }
System.out.println(" ");
	}

}
	}
}

