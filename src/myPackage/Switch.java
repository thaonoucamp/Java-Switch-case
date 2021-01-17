package myPackage;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the x: ");
        int x = scanner.nextInt();

        switch (x) {
            case 1:
                System.out.println(x + " = 1");
                break;
            case 2:
                System.out.println(x + " = 2");
                break;
            case 3:
                System.out.println(x + " = 3");
                break;
            case 4:
                System.out.println(x + " = 4");
                break;
            default:
                System.out.println(x + " = 0");
        }
    }
}
