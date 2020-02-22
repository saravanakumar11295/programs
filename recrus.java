package com.ios;

class number {
	int sum = 0, c = 0;

	int reverses(int n) {
		while (n != 0) {
			System.out.println("" + n);
			c = n % 10;
			sum = sum * 10 + c;
			// System.out.println("sum"+sum);
			n = n / 10;
			System.out.println("num" + n);

		}
		return sum;
		// System.out.println(sum);
	}

}

public class recrus {
	public static void main(String args[]) {
		int c = 1234;
		System.out.println("--------------------");
		number sr = new number();
		int s = sr.reverses(c);
		// int s =1/10;
		System.out.println(s);

	}

}
