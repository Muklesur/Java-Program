import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		System.out.println("Enter the value of exponent:");
		int exp = sc.nextInt();
		sc.close();
		int result = 1;
		for (int i = 0; i < exp; i++) {
			result = result * number;
		}
		System.out.println(result);

	}
}
