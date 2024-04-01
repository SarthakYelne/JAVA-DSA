package Arrays_2D.Practice_Questions;

// Question : Print out the sum of the numbers inthe second row of the “nums” array.
//             Example :
//             Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
//             Output - 18

public class Q_2 {
        public static int Count_Sum(int matrix[][]) {
            int sum = 0;
  
                for (int j = 0; j < matrix[0].length; j++) {
                    sum += matrix[1][j];
                }
            return sum;
        }
    
        public static void main(String[] args) {
            int matrix[][] =  {{1,4,9},{11,4,3},{2,2,3}};
    
            System.out.println(Count_Sum(matrix));
        }
    
}

// Output : 18
