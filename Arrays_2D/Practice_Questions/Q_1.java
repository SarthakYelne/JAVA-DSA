package Arrays_2D.Practice_Questions;

// Question : Print the number of 7’s that are in the 2d array.
//             Example :
//             Input - int[][] array = { {4,7,8},{8,8,7} };
//             Output - 2

public class Q_1 {
    public static int Numbers(int matrix[][], int num) {
        int sum = 0;
        for (int i=0; i<matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (num == matrix[i][j]) {
                    sum++;
                }
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},{8,8,7}};

        System.out.println(Numbers(matrix, 7));
    }
}

// Output : 2