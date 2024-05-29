package com.collectionpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(10);
		l.add("Aatif");
		l.add('c');
		
		//System.out.println(l);
		Iterator itr = l.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		

	}

}
