import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        int sumFirst = 0;
        int sumLast = 0;
        for (int i = 0; i < number.length() / 2; i++) {
            sumFirst += number.charAt(i); // this will count the ASCI value of the char, but surprisingly it works!
            sumLast += number.charAt(number.length() - i - 1);
        }
        System.out.println(sumFirst == sumLast ? "Lucky" : "Regular");
    }
}