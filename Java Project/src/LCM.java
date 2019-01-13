import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter First Number:");
		int a=sc.nextInt();
		System.out.println("Enter Second Number:");
		int b=sc.nextInt();
		int lcm;
        if(a>b) {
        	lcm=a;
        }
        else {
        	lcm=b;
        }
        while(true)
        {
            if( lcm % a == 0 && lcm % b == 0 )
            {
                System.out.printf("The LCM of %d and %d is %d.", a, b, lcm);
                break;
            }
            ++lcm;
        }
    }

}
