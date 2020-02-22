package com.ios;

import java.util.ArrayList;

public class geeks {
	static void checking(char a[], char b[], int len1, int len2) {
		int count = 0, j = 0;
		for (int i = 0; i < len1; i++) {

			if (a[i] == b[j]) { //&& (i+len2)<=len1) {
				for (int k = i; k < (i + len2); k++) {
					if (a[k] == b[j]) {
						j++;
						count++;
					}
				}
				if (count == len2) {
					System.out.println("yes");
                    break;
				}
				else
				{
					System.out.println("no");
					break;
				}

			}
		}
	}

	public static void main(String args[]) {
		String s1 = "geeksforgeeks";
		char[] c = s1.toCharArray();
		int len = c.length;
		System.out.println(len);
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        
        ArrayList<Integer> al2 =new ArrayList<Integer>();
        al2.addAll(al);
		
		
		String s2 = "ghhggfgf";
		char[] ch = s2.toCharArray();
		int lens = ch.length;
		System.out.println(lens);
        System.out.println("Value   "+al2);
		checking(c, ch, len, lens);
	}
}
