import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean mBesideN = false;
        for (int i = 0; i < size - 1; i++) {
            // inspired by: https://hyperskill.org/learn/daily/2130#solutions-597457
            if (arr[i] == n && arr[i + 1] == m || arr[i] == m && arr[i + 1] == n) {
                mBesideN = true;
            }
        }
        System.out.println(!mBesideN);
    }
}