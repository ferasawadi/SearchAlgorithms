package com.yafatek;public class reverseInteger {	public static void main(String[] args) {		/**		 *  using While Loop.		 */		System.out.println("Reversed Number: " + reverse(5436));		/**		 *  reverse using For Loop.		 */		int num = 1234567, reversed = 0;		for (; num != 0; num /= 10) {			int digit = num % 10;			reversed = reversed * 10 + digit;		}//		System.out.println("Reversed Number: " + reversed);	}	private static int reverse(int input) {		int reversed = 0;		while (input != 0) {			reversed = reversed * 10 + input % 10;			if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE)				return 0;			else input /= 10;		}		return reversed;	}}