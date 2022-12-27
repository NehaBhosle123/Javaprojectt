package com.velocity.demoo;

import java.util.ArrayList;

public class ArrayListDemoo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Shyam");
		list.add("Mohan");
		list.add("vinod");
		
		list.stream().forEach(x->System.out.println(x));
	}

}
