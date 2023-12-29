package javaPrograms;

public class ReverseStringWhereWordsAreInSamePlace {

	public static void main(String[] args) {
		
		//3. Input = Guru Nath,  Output = uruG htaN - reverse string where words are in same place
		reverseStringInPlace("Guru Nath");
		
	}
	
	//below method is to reverse a string:
	public static String reverseOriginal(String s) {
		
		String rev="";
		
		for(int i=s.length()-1 ; i >= 0; i--) {
			
			rev=rev+s.charAt(i);
			
		}
		
		System.out.println(rev);
		
		return rev;
	
	}
	
	//Steps to solve this probles is:
	//step1. split the string with the help of space (" ")
	//step2. traverse word one by one
	
	public static void reverseStringInPlace(String s) {
	String rev="";
	String sb[] = s.split(" ");//optput- sb[0]=Guru, sb[1]=Nath
		
	for(int i =0; i<sb.length; i++) {
		
		String sb1 = reverseOriginal(sb[i]);
		rev=rev+sb1+" ";
	}
	
	System.out.println("Reversed String is : "+" "+rev.trim());
	
	}
	
}
