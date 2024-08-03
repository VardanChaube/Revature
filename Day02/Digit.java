import java.util.*;

public class Digit{
	public static void main(String args[]){
		System.out.println("Enter the 5 digit Number:");
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		int ans=0;
		ans=ans+digit%10+digit%10000;
		System.out.println("The answer is:" +ans);
	}
}