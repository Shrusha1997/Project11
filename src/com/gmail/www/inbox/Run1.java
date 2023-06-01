package com.gmail.www.inbox;
class Dog
{
	
}
public class Run1
{

	public static void main(String[] args)
	{
	Dog d1 = new Dog();
	Dog d2 = d1;
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(d1.equals(d2));

	}

}
