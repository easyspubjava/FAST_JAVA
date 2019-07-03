package ifexample;

import java.util.Scanner;

public class SwitchCaseEx2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int day;
		
		switch(month) {
			case 1:	case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 2:
				day = 28;
				break;
			case 4: case 6: case 11:
				day = 30;
				break;
			default:
				System.out.println("Error");
				day = 0;
		
		}
		
		System.out.println(month + "월은 " +day + "일입니다.");
	}

}
