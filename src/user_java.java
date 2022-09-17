import java.util.Scanner;

public class user_java {

    public static void main(String[] args){
        System.out.println("please enter your num");

        Scanner scanner = new Scanner(System.in);

        int input1 = scanner.nextInt();

        System.out.println("please enter your num");

        int input2=scanner.nextInt();

        int output = input1+input2;

        System.out.println(output);

    }
}
