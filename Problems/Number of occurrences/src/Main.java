import java.util.Scanner;

// try this: https://hyperskill.org/learn/step/2288#solutions-584715
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String sub = scanner.nextLine();
        int freq = 0;
        while (str.contains(sub)) {
            freq++;
            str = str.replaceFirst(sub, "");
        }
        System.out.println(freq);
    }
}