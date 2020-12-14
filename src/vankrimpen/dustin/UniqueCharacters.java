package vankrimpen.dustin;

import java.util.Arrays;
import java.util.BitSet;

/*
 * A) Implement an algorithm to determine if a string has all unique characters. 
 * B) What if you cannot use additional data structures?
 */
public class UniqueCharacters {

	// Solution A) using additional data structure (BitSet) to map whether each character has been found or not 
	private static boolean isUniqueA(String s){
		BitSet set = new BitSet(256);
		char[] chars = s.toCharArray();
		for(char c: chars) {
			if(set.get(c)) {
				return false;
			}
			set.flip(c);
		}
		return true;
		
	}
	
	// Solution B) not using additional data structure 
	private static boolean isUniqueB(String s) {
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		
		char prev = 0;
		for(char c: chars) {
			if(prev == c) {
				return false;
			}
			prev = c;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Solution A:");
		System.out.printf("The word \"True\" has all unique characters: %b \n", isUniqueA("True"));
		System.out.printf("The word \"Hello\" has all unique characters: %b \n", isUniqueA("Hello"));
		
		System.out.println("\nSolution B:");
		System.out.printf("The word \"True\" has all unique characters: %b \n", isUniqueB("True"));
		System.out.printf("The word \"Hello\" has all unique characters: %b \n", isUniqueB("Hello"));
		
	}

}
