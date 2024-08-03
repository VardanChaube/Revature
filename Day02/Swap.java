public class Swap{
	public static void main(String args[]){
	
	int a= 6;
	int b= 8;
	int temp=a;
	a=b;
	b=temp;
	System.out.println("Value of a now is:" + a);
	System.out.println("Value of b now is:" + b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Value of a now is:" + a);
	System.out.println("Value of b now is:" + b);

	}
}