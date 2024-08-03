import java.util.*;

public class DigitSum{
	public static void main(String args[]){
		System.out.println("Enter the 3 digit Number:");
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		int ans=0;
		ans=ans+digit%10+digit%100+digit%1000;
		System.out.println("The answer is:" +ans);
	}
}