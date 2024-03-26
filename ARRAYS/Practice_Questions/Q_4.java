package Arrays.Practice_Questions;

// Q_4 : Given n non-negative integers representing an elevation map where the width of 
//       each bar is 1, compute how much water it can trap after raining.

public class Q_4 {

    public static int TrapWater(int height[]){
        int n = height.length;

        // left boundary array
        int leftBound[] = new int [n];
        leftBound[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftBound[i] = Math.max(leftBound[i-1], height[i]);
        }

        // right boundary array
        int rightBound[] = new int [n];
        rightBound[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightBound[i] = Math.max(rightBound[i+1],height[i]);
        }

        // loop for waterlevel collection 
        int trappedwater = 0;
        for (int j = 0; j < n; j++) {
            int waterlevel = Math.min(leftBound[j], rightBound[j]);
            trappedwater += waterlevel - height[j];
        }

        return trappedwater;
    }
    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        // int height[] = {4, 2, 0, 3, 2, 5};
        System.out.println(TrapWater(height));
    }
}

// Output : 

// 6

// 9