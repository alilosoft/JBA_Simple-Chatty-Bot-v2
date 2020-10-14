import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seq = scanner.nextLine();
        double ratio = seq.toLowerCase().replaceAll("a|t", "").length() * 100.0 / seq.length();
        System.out.println(ratio);
    }
}