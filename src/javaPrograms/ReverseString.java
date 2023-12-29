package javaPrograms;

public class ReverseString {

	//1. Input = Guru Nath,  Output = htaN uruG - reverse full string
	//2. Input = Guru Nath,  Output = Nath Guru - reverse string word by word
	//3. Input = Guru Nath,  Output = uruG htaN - reverse string where words are in same place
	
	public static void main(String[] args) {

		//reverseString1("Guru Nath");
		reverseString2("Guru Nath");
		//reverseString3("Guru Nath");
		//reverseString4("Guru Nath");
	}
	
	//1. Input = Guru Nath,  Output = htaN uruG - reversing the full string

/*	
	//Approach 1 : using charAt() method with string
	public static void reverseString1(String s) {
		
		String reversedString="";
		//traverse from last to 1st and start the for loop from last like int i=length()-1
		for(int i = s.length()-1 ; i >= 0; i--) {
			
			reversedString=reversedString+s.charAt(i);
			
		}
		
		System.out.println("Reversed String is : " +" "+reversedString);
		
	}
*/	
	

	//Approach 2 : Conver the string to char[] and then traverse
	public static void reverseString2(String s) {
		
		String reversedString="";
		//traverse from last to 1st and start the for loop from last like int i=length()-1
		//convert string to char[] array using string.toCharArray()
		char ch[] = s.toCharArray();
		
		for(int i = s.length()-1 ; i >= 0; i--) {
			reversedString=reversedString+ch[i];
		}
		
		System.out.println("Reversed String is : " +" "+reversedString);
		
	}

	/*
	//Approch 3 : Using StringBuffer - converthe string to StringBUffer and reverse using reverse() method
	
	public static void reverseString3(String s){
		//converst the string to StringBuffer - pass string s to the StringBuffer() constructor
		StringBuffer sb = new StringBuffer(s);
		System.out.println("Reversed String is :+" "+sb.reverse());
	}
*/	
	
/*
 		//Approch 4 : Using StringBuilder - converthe string to StringBuilder and reverse using reverse() method
		public static void reverseString4(String s){
			//converst the string to StringBuffer - pass string s to the StringBuffer() constructor
			StringBuilder sb1 = new StringBuilder(s);
			System.out.println("Reversed String is :+" "+sb1.reverse());
		}
	
	*/
}
