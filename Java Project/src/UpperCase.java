
public class UpperCase {

	public static void main(String[] args) {
		String s1="PujaMukul";
		String s2=" ";
		for(int i=0;i<=s1.length()-1;i++)
		{
			String s3=" "+s1.charAt(i);
			if(i%2==0)
			{
				s2+=s3.toUpperCase();
				
			}
			else
			{
				s2+=s3.toLowerCase();
			}
		}
		System.out.println(s2);
	}

}
