package rivision;

public class CountNumberOfAlphabets {

	public static void main(String[] args) {
		
		String str = "Siddharth";
		char[] a=str.toCharArray();
		int count = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='A' && a[i]<='Z' || a[i]>='a' && a[i]<='z')
			{
				count++;
			}
		}
		
		System.out.println("the number of characters is:"+count);
	}
}
