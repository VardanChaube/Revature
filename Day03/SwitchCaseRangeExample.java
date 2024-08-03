import java.util.*;
public class SwitchCaseRangeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks to calculate grade:");

        switch (getRange(score)) {
            case "A":
                System.out.println("Grade: A");
                break;
            case "B":
                System.out.println("Grade: B");
                break;
            case "C":
                System.out.println("Grade: C");
                break;
            case "D":
                System.out.println("Grade: D");
                break;
            default:
                System.out.println("Grade: F");
                break;
        }
    }

    public static String getRange(int score) {
        if (score >= 80 && score <= 100) {
            return "A";
        } else if (score >= 60 && score < 80) {
            return "B";
        } else if (score >= 50 && score < 60) {
            return "C";
        } else if (score >= 45 && score < 50) {
            return "D";
        }else if (score >= 25 && score < 45) {
            return "E";
        } else {
            return "F";
        }
    }
}




