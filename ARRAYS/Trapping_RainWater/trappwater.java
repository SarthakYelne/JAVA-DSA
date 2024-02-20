package ARRAYS.Trapping_RainWater;

public class trappwater {
    public static int Trappingwater(int height[]){
        int n = height.length;

        // Left Max Array Boundary Calculation
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        // Right Max Array Boundary Calculation
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int j = n-2; j >= 0; j--) {
            rightMax[j] = Math.max(rightMax[j+1], height[j]);
        }

        // Loop
        // int waterlevel = 0;
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {

            // Waterlevel min value Calculation
           int waterlevel = Math.min(leftMax[i], rightMax[i]);

            // Trapped water Calculation
            trappedwater += waterlevel - height[i];

        }
        return trappedwater;

    }

    public static void main(String[] args) {
        // int height[] = {4, 10, 0, 6, 3, 12, 7, 8, 2, 5}; exaxmple output : 25
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(Trappingwater(height));
    }
}

/*
 * Output : 11
 */