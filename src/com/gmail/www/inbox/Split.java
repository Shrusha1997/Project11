package com.gmail.www.inbox;

public class Split 
{

	public static void main(String[] args)
	{
     String str ="Rocky is cool";
     String[] arr = str.split(" ");
     for (int i = arr.length-1;i>=0;i--)
     {
    	 System.out.print(arr[i]+" ");
     }
	}
	

}
