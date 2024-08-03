import java.util.*;

public class Attendance{
	public static void main(String args[]){
	System.out.println("Number of class held:");
	Scanner sc = new Scanner(System.in);
	int totalclasses = sc.nextInt();
	System.out.println("Number of classes attended:");
	int classattended = sc.nextInt();
	System.out.println("Do you have medical cause:");
	String res = sc.next();
	if(res=="Y")
	System.out.println("You Are allowed to sit in the examination");
	else{
	int ans = (classattended*100/totalclasses);
	if(ans>70)
System.out.println("You Are allowed to sit in the examination");
else
System.out.println("You Are NOT allowed to sit in the examination");
	
}
	
	
	
	}
}
