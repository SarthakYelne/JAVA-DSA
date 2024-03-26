package Arrays_2D.Matrix;

import java.util.Scanner;

public class matirx {

    public static boolean search(int matrix[][], int Key) {
        int n = matrix.length, m = matrix[0].length;

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if(matrix[i][j] == Key) {
                    System.out.println(Key+" Found at ("+i+","+j+")");
                    return true;
                }
            }
        }

        System.out.println("Not present");
        return false;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int matrix[][] = new int[3][3];
            int n = matrix.length, m = matrix[0].length;
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    System.out.print(matrix[i][j]+" "); 
                }
                System.out.println();
            }
            search(matrix, 6);
        }
    }
}

// Output : 

// 1 2 3 4 5 6 7 8 9
// 1 2 3 
// 4 5 6 
// 7 8 9 
// 6 Found at (1,2)