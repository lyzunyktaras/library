package zub_denys;

import java.util.Scanner;

public class CorrectMistakes {
    public static String correct(String string) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your sentence: ");
//        String string  = sc.nextLine();

        System.out.print("\nCorrect sentence: ");
        return string.replaceAll("5","S")
                .replaceAll("0","O")
                .replaceAll("1","I");
    }
}