package interview;

import java.util.Scanner;

public class FindingVowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = scan.nextLine();
		for( int i=0; i<str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i) == 'a' || str.charAt(i)=='o' || str.charAt(i)=='u')
					{
				 System.out.println("given string contains "+str.charAt(i)+" at the index "+i);
			
			}
			
		}
		scan.close();

	}

}


	


