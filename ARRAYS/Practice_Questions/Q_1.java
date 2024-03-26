package Arrays.Practice_Questions;

// Q_1 :  Given an integer array nums, return true if any value appears at least twice in the 
//        array, and return false if every element is distinct. 

public class Q_1 {
    
    public static boolean Check(int nums[]) {
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        int nums1[] = {1, 2, 3, 0, 4};
        int nums2[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(Check(nums));
        System.out.println(Check(nums1));
        System.out.println(Check(nums2));

    }
}

// Output : 

// true
// false
// true