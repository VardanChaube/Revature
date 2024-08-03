import java.util.*;

class Program1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the count of numbers:");
	int n= sc.nextInt();
	int[] arr = new int[n];
        for(int i=0;i<n;i++){
		arr[i]= sc.nextInt();
}
        String operator = sc.next();

        int result =calculate(arr operator);
    }

    public static int calculate(int[]  arr, String operator){
	int ans=0;
        if(operator=="+"){
for(int i=0;i<n;i++){
ans+=arr[i];
}
return ans;
}
        
        if(operator=="-"){
for(int i=0;i<n;i++){
ans-=arr[i];
}
return ans;

}
        
        if(operator == "*"){
        for(int i=0;i<n;i++){
ans*=arr[i];
}
return ans;}

        if(operator == "/"){
for(int i=0;i<n;i++){
ans/=arr[i];
}
return ans;

}
        
        else
        return 0;
    }
}