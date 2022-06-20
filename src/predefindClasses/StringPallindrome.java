package predefindClasses;import java.time.format.ResolverStyle;

public class StringPallindrome  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		String Pallindrome = "NAYAN";

		String Str = "";
		for (int i=Pallindrome.length()-1;i>=0;i-- )
		{
		Str = Str+Pallindrome.charAt(i);
		}
if (Str.equals(Pallindrome))
{	System.out.println("Its Pallindroem String");
} else {
	System.out.println("Not");
	}
}
}