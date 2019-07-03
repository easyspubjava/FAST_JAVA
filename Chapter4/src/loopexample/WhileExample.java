package loopexample;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {

		int num = 0;
		int sum = 0;
		
		while( num <= 100 ) {
			sum += num;
			num += 2;
		}
			
		System.out.println(sum);
		System.out.println(num);
		
		
		/*int input;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		while(input != 0) {
			sum += input;
			input = scanner.nextInt();
		}
		
		System.out.println(sum);*/
	}

}
