package loopexample;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {

		int input;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			input = scanner.nextInt();
			sum += input;
			
		}while(input != 0);
		System.out.println(sum);
	}

}
