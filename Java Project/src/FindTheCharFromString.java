import java.util.Scanner;

public class FindTheCharFromString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String word=sc.nextLine();
		System.out.println("Enter Character");
		char ch=sc.next().charAt(0);
		sc.close();
		for(int i=0;i<=word.length()-1;i++)
		{
			if(word.charAt(i)==ch) 
			{
				System.out.println("The character found at the position of "+i);
				System.exit(0);
			}
		}
		for(int j=0;j<=word.length()-1;j++)
		{
			if(word.charAt(j)!=ch) 
			{
				System.out.println("not Found ");
				break;
				
			}
		
		}
			
		}
}
