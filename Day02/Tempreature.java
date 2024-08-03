import java.util.*;
public class Tempreature{
	public static void main(String args[]){
	System.out.println("Enter the temperature in farhenite:");
	Scanner sc == new Scanner(System.in);
	int temp = sc.nextInt();
	int ans =(temp-32)*5/9;
	System.out.println("The temperature in Celsius is:" + ans);
	}
}