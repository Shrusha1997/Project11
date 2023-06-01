package com.gmail.www.inbox;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) 
	{
	List l1 = new ArrayList<>();
	l1.add("Bangalore");
	l1.add(10);
	l1.add(true);
	l1.add(10.0214);
	l1.add(false);
	System.out.println(l1);
	// data modification to remove data
	l1.remove(true);
	l1.remove(false);
System.out.println(l1);
	}

}
