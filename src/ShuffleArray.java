import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{4, 5, 6, 1, 2, 3}, 3)));
    }
//    public static int[] shuffle(int[] nums, int n) {
//
//        int[] answer = new int[nums.length];
//
//        //Index variable for result array.
//        int index=0;
//
//        //start i from first index and j from nth index.
//        for(int i=0,j=n;j<nums.length,j++;i++)
//        {
//            answer[index++] = nums[i];
//            answer[index++] = nums[j];
//        }
//        return answer;
//}

    // 2nd method to do this question with while loop

    public static int[] shuffle(int[] nums, int n) {
//        int l = 0;
//        int r = n;
//        int idx = 0;
        int[] res = new int[nums.length];
        int l = 0;
        int r = n;
        int idx = 0;
        while(r<nums.length){
            res[idx++] = nums[l];
            res[idx++] = nums[r];
            l++;r++;
        }
        return res;
    }
}