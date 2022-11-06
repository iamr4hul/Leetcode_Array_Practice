import java.util.Arrays;
// QUES-1 https://leetcode.com/problems/build-array-from-permutation/

/*


  NAIVE METHOD TO SOLVE THIS QUESTION (Time Complexity = O(n) and Space Complexity = O(n) );

public class arrayQuestion_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildArray(new int[]{0, 2, 1, 5, 3, 4})));

    }
    public static int[] buildArray(int[] nums){
        int[] ans = new int[nums.length];
     for(int i=0;i<nums.length;i++){
              ans[i]=nums[nums[i]];

      }
       return ans;
    }

    // OPTIMIZED METHOD/WAY TO DO THIS QUESTION  (Time complexity: O(n2) & Space complexity : O(1)) ;

    /*
  public static int[] buildArray(int[] arr) {
    int n=arr.length;

    for(int i=0;i<n;i++){
        arr[i]=(arr[arr[i]]%n)*n+arr[i];
    }

    for(int i=0;i<n;i++){
        arr[i]/=n;
    }

    return arr;
}

}
*/