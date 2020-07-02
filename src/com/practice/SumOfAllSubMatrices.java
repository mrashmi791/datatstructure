package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumOfAllSubMatrices {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		int k = 2;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < list.size(); i++) {
			map.put(list.get(i), list.get(i));
		}
		int counter = 0;
		
		for(int i = 0; i < list.size(); i++) {
			if(map.containsKey(list.get(i) + k)) {
				counter = counter + 1;
				map.remove(list.get(i) + k);
			}
		}
		
		System.out.println(counter);
		
	}

}
