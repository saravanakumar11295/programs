package com.ios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Saravanaalagar
 *
 */
public class Hello {
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(34);
		numbers.add(23);
		numbers.add(23);
		
		numbers.sort(new Intcomparator());
		
		System.out.println("ok");
		System.out.println(numbers);
	}

}

class Intcomparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - o2;
	}
	
}
