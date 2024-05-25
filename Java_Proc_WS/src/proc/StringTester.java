package proc;
import java.util.*;
public class StringTester {
	public static void main(String[] args) {
		//String s1 = "getting good at coding needs a lot of practice";
		/*Approach - 1 - Reverse words in a given string*/
		/*StringBuffer sBuffer = new StringBuffer(s1);
		sBuffer.reverse();
		String[] sArray = sBuffer.toString().split(" ");
		String s2 = "";
		for (String str : sArray) {
			StringBuffer sBuffStr = new StringBuffer(str).reverse();
			s2 = s2 + sBuffStr.toString() + " ";
		}
		System.out.println(s2.trim());*/

		/* Approach - 2 Reverse words in a given string*/
		/*String s2 = "";
		String[] strArray = s1.split(" ");
		for (int i = strArray.length - 1 ; i >= 0 ; i--) {
			s2 = s2 + strArray[i] + " ";
		}
		System.out.println(s2.trim()); */
		
		/*Longest Common Prefix using Sorting*/
		String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
		//String[] input = {"Himanshu", "Himanshi", "Himu"};
		/* sort the array of strings */
		Arrays.sort(input);

		/* find the minimum length from first and last string */
		int end = Math.min(input[0].length(), input[input.length - 1].length());

		/* find the common prefix between the first and
		last string */
		int i = 0;
		while (i < end && input[0].charAt(i) == input[input.length - 1].charAt(i) )
			i++;

		String pre = input[0].substring(0, i);
		System.out.println("Common Prefix: " + pre);
	}
}

