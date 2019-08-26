package rivision;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Hello";
		String str1 = "";
		char[] a=str.toCharArray();
		for(int i=0;i<a.length;i++)
		{
		       str1=a[i]+str1;
		}
		
		System.out.println(str1);

	}

}
