package Arrays.Trapping_RainWater;

public class trappwater {
    public static int Trappingwater(int height[]){
        int n = height.length;

        // Left Max Array Boundary Calculation
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
       
        // Right Max Array Boundary Calculation
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
       
        // Loop
        int trappwater = 0;
        for (int j = 0; j < n; j++) {
            // waterlevel = min(leftMax , rightMax)
            // trapwater += (waterlevel - barheight) * width
            int waterlevel = Math.min(leftMax[j], rightMax[j]);
            trappwater += waterlevel - height[j];
        }
        
        return trappwater;
    }

    public static void main(String[] args) {
        // int height[] = {4, 10, 0, 6, 3, 12, 7, 8, 2, 5}; example output : 25
        int height[] = {4, 2, 0, 6, 3, 2, 5}; // example output : 11
        System.out.println(Trappingwater(height));
    }
}

/*
 * Output : 11
 */