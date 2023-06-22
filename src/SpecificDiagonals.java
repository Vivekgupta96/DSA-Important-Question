

import java.util.*;

class SpecificDiagonals {
    public static void specificDiagonals(int r, int c, int[][] mat, int k) {
        int sum = 0;
        int diff = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat[i][j] == k) {
                    sum = i + j;
                    diff = i - j;
                    break;
                }
            }
        }

        String left = "";
        String right = "";
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i - j == diff) {
                    left += mat[i][j] + " ";
                }
                if (i + j == sum) {
                    right += mat[i][j] + " ";
                }
            }
        }

        System.out.println(left);
        System.out.println(right);
    }


    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();

        specificDiagonals(n, m, mat, k);
    }
}
