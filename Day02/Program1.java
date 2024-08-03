import java.util.*;

class Program1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2 = sc.nextInt();
        String operator = sc.next();


        int result =calculate(num1, num2, operator);
    }

    public static int calculate(int num1, int num2, String operator){
        if(operator=="+")
        return num1+num2;
        if(operator=="-")
        return num1-num2;
        if(operator == "*")
        return num1*num2;
        if(operator == "/")
        return num1/num2;
        else
        return 0;
    }
}