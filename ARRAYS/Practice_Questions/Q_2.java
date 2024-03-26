package Arrays.Practice_Questions;

public class Q_2 {

    public static int PivotBinarySearch(int nums[], int key) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = (low+high)/2;

            if (nums[mid] == key) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= key && key <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
                
            } else {
               if (nums[mid] <= key && key <= nums[high]) {
                   low = mid + 1;
                } else {
                   high = mid - 1;
                }
            }
    }
    return -1;

    }

    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int nums1[] = {4, 5, 6, 7, 0, 1, 2};
        int nums2[] = {1};
        System.out.println(PivotBinarySearch(nums, 0));
        System.out.println(PivotBinarySearch(nums1, 3));
        System.out.println(PivotBinarySearch(nums2, 0));
    }
}
