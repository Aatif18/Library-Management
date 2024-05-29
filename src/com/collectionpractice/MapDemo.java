package com.collectionpractice;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		 Map<String, Integer> map = new HashMap<>();

	        // Adding key-value pairs to the map
	        map.put("One", 1);
	        map.put("Two", 2);
	        map.put("Three", 3);
	        map.put("Four", 4);

	        // Accessing a value by key
	        int value = map.get("Two");
	        System.out.println("Value for key 'Two': " + value);

	        // Checking if a key is present in the map
	        if (map.containsKey("Three")) {
	            System.out.println("Key 'Three' is present in the map.");
	        }

	        // Checking if a value is present in the map
	        if (map.containsValue(4)) {
	            System.out.println("Value 4 is present in the map.");
	        }

	}

}
