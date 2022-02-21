import java.util.Scanner;

public class test{
    public static void main(String[] args){
        int value;
        System.out.println("\tHello World!");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Value : ");
        value = in.nextInt();
        System.out.println("This Value is : " + value);
    }
}