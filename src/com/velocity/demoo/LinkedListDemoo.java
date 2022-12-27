package com.velocity.demoo;

import java.util.LinkedList;

public class LinkedListDemoo {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
list.stream().forEach(x->System.out.println(x));
	}

}
