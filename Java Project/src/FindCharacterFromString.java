import java.util.Scanner;

public class FindCharacterFromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1=sc.next();
		System.out.println("Enter the Character");
		char ch=sc.next().charAt(0);
		sc.close();
		for(int i=0;i<=s1.length()-1;i++) {
			if(s1.charAt(i)==ch) {
				System.out.println("Found");
				break;
				}
			
		}
	}

}
