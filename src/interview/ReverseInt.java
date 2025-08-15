package interview;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number");
		//int num = scan.nextInt();
		int reverse = 0;
		if(scan.hasNextInt())
		{
			int num = scan.nextInt();
		while(num>0)
		{
			int a =num%10;
			reverse = reverse*10+a;
			num = num/10-a/10;
			
			
			
		}
		
		System.out.println(reverse);
		}
		else {
			System.out.println("Enter valid input");
		}
		

	}

}
