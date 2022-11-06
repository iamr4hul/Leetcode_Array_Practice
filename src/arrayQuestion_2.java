import java.util.Arrays;
 // Question 2 : https://leetcode.com/problems/concatenation-of-array/

public class arrayQuestion_2 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 1})));

    }
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int newSize = 2*n;
        int[] ans = new int[newSize];
            for(int i=0;i<n;i++){
                ans[i] = nums[i];
                ans[i+n] = nums[i];

        }
    return ans;
    }
}