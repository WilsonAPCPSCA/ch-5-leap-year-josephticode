import java.util.Scanner;
public class leapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input a year to be determined as a leap year (or not).");
		int year = in.nextInt();
		boolean answer = isLeapYear(year);
		System.out.println(answer);
		
	}
	public static boolean isLeapYear (int year) {
		boolean leap = false;
		if ((year >= 1582) && (year %4 == 0) && (year %400 == 0)) {
			leap = true;
		}
		else if (year %100 == 0) {
			 leap = false;
		} 
		return leap;
	}

}
