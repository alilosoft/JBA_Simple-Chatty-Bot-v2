import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // read lines
        String allLines = "";
        String line;
        while (!"end".equals(line = scanner.nextLine())) {
            allLines += line + ";"; // nothing special about ';', it's just a separator
        }
        // build the matrix
        String[] rows = allLines.split(";");
        int n = rows.length;
        int m = rows[0].split(" ").length;
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] row = rows[i].split(" ");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(row[j]);
            }
        }
        // sum
        int[][] sumMatrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            int iTop = (i - 1 + n) % n; // thanks to: https://hyperskill.org/learn/daily/1932#hint-310519
            int iBottom = (i + 1) % n;
            for (int j = 0; j < m; j++) {
                int jLeft = j == 0 ? m - 1 : j - 1; // could be done like that too, and I think it's more intuitive!
                int jRight = (j + 1) % m;
                sumMatrix[i][j] = matrix[iTop][j] + matrix[iBottom][j] + matrix[i][jLeft] + matrix[i][jRight];
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}