#totalMarks and percentage

class Percentage{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks scored by Robert in three subject:");
	 
	int sub1 = sc.nextInt();
	int sub2 = sc.nextInt();
	int sub3 = sc.nextInt();
	
	int totalMarks = sub1+sub2+sub3;
	int percentage = totalMarks/3;
	System.out.println("Total Marks scored by Robert is:"+ totalMarks);	
	System.out.println("Percentage Scored by Robert is:"+ percentage);
	
}
}