import java.util.Scanner;

public class HowOldWillIBe {

    public static String CalculateAge(int birth, int yearTo) {
        String response = "";
        if(yearTo > birth) {
            int difference = yearTo - birth;
            response = (difference == 1) ? "You are " + difference + " year old" : "You are " + difference + " years old";
        }
        if(yearTo == birth) {
            response = "You were born this year";
        }
        if(yearTo < birth) {
            int difference = birth - yearTo;
            response = "You will be born in " + difference + ((difference == 1) ? " year" : " years");
        }

        return response;
    }

    public static void main(String[] args) {
        System.out.print("Enter year of birth: ");
        Scanner in = new Scanner(System.in);

        int yearOfBirth = in.nextInt();

        System.out.print("Enter year to: ");
        int yearTo = in.nextInt();

        System.out.println(CalculateAge(yearOfBirth, yearTo));
    }
}
