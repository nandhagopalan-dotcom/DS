// Matrix Multiplication

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible.");
            return;
        }
        int[][] Mat1 = new int[r1][c1];
        int[][] Mat2 = new int[r2][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                Mat1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                Mat2[i][j] = sc.nextInt();
            }
        }
        int[][] MultMat = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {  
                    MultMat[i][j] += Mat1[i][k] * Mat2[k][j];       // The value K is Column for Mat1 and row for Mat2
                }
            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(MultMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
