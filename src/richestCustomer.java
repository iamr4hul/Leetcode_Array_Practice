import java.util.Arrays;

// QUESTION 4: https://leetcode.com/problems/richest-customer-wealth/submissions/838755939/
public class richestCustomer {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1, 2, 5}, {1, 2, 1}, {7, 7, 7}}));
    }

    // public static int maximumWealth(int[][] accounts) {
    public static int maximumWealth(int[][] accounts) {
        int maxi = 0;
        for (int i = 0; i < accounts.length; i++) {
            int everyRowSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                everyRowSum += accounts[i][j];
            }
           // maxi = Math.max(everyRowSum,maxi);
            // we can also do like this
            if(everyRowSum>maxi)
                maxi = everyRowSum;
        }
        return maxi;
    }
}