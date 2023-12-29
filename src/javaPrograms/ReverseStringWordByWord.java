package javaPrograms;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		
		//2. Input = Guru Nath,  Output = Nath Guru - reverse string word by word
		
		reverseStringByWord("Guru DVG");
		
	}
	
	//Steps: to solve:
	//1.split the string word by word
	//2. then traverse each word one by one
	public static void reverseStringByWord(String s) {
		
		String [] sb = s.split(" ");//spliting the given string by " " (space)
		//3. sb[0]=Guru, sb[1]=Nath
		//4. traverse each word from last to 1st
		
		String rev="";
		for(int i = sb.length-1 ; i >=0 ; i--) {
			
			rev=rev+sb[i]+" ";
			
		}
		
		System.out.println("Reversed String is :"+" "+rev.trim());
	}

}
