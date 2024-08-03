import java.util.*;

public class DigitReverse{
	public static void main(String args[]){
		System.out.println("Enter the 3 digit Number:");
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		int ans=0;
		while(digit>0){
		ans=ans*10 + digit%10;
		digit=digit/10;
}
		System.out.println("The answer is:" +ans);
	}
}