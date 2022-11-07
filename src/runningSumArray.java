import java.util.Arrays;

 // QUESTION 3 : https://leetcode.com/problems/running-sum-of-1d-array/description/
public class runningSumArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1,2,3,4,})));
    }
    // METHOD TO SOLVE IN TIME COMPLEXITY  = O(N) AND SPACE COMPLEXITY= O(N);
    public static int[] runningSum(int[] nums) {
    int n = nums.length;
    for(int i=1; i<n; i++){
        nums[i]= nums[i] + nums[i-1];
    }
        return nums;
    }
}
