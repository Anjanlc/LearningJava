import java.util.Scanner;

public class UserInput {
    public static void main(String args[]){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.print( a+ " and " +b);
    }
}

