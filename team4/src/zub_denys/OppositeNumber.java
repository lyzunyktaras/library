package zub_denys;

import java.util.Scanner;

public class OppositeNumber {
    public static int opposite() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Opposite number: ");
        return number *(-1);
    }

    public static void main(String[] args) {
        System.out.println(opposite());
    }
}