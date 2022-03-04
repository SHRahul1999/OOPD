
import java.util.*;
class EaD
{
	Scanner sc=new Scanner(System.in);
	public void encrypt()
	{
		System.out.println("Enter a message to Encrypt:");
		String message=sc.nextLine();
		for(int i=0;i<message.length();i++)
		{
			int asciivalue=message.charAt(i);
			System.out.print(asciivalue+"\t");
		}
	}
	public void decrypt()
	{
		int[] arr=new int[500];
		System.out.println("\nEnter Encrypted message to Decrypt:");
		for(int i=0;i<=200;i++)
		{
			arr[i]=sc.nextInt();
			System.out.print((char)arr[i]+"\t");
		}
	}
}
public class EncryptandDecrypt {
	public static void main(String args[])
	{
		EaD a=new EaD();
		a.encrypt();
		a.decrypt();
	}
}
