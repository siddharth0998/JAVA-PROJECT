// code won't work here
// Input:
// N = 4
// a[] = {4, 2, 1, 8}
// Output: 
// 18
// Explanation: Rearrangement done is {1, 8, 
// 2, 4}. Sum of absolute difference between 
// consecutive elements after rearrangement = 
// |1 - 8| + |8 - 2| + |2 - 4| + |4 - 1| = 
// 7 + 6 + 2 + 3 = 18.

import java.util.Arrays;

class GFG {
    long maxSum(long arr[], int n) {
        Arrays.sort(arr);
        int i = 0;
        int j = n - 1;
        long sum = 0;
        while (i < j) {
            sum += Math.abs(arr[i] - arr[j]);
            sum += Math.abs(arr[i + 1] - arr[j]);
            i++;
            j--;
        }
        sum += Math.abs(arr[0] - arr[i]);
        return sum;
    }
}