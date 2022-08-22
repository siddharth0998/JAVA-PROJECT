// code won't work here
// Input: 
// n = 5
// A[] = {1, 2, 3, 3, 4}
// [a, b] = [1, 2]
// Output: 1
// Explanation: One possible arrangement is:
// {1, 2, 3, 3, 4}. If you return a valid
// arrangement, output will be 1.

public class ThreeWayPartitioning {
    public static void swap(int array[], int l, int r) {
        int temp = array[l];
        array[l] = array[r];
        array[r] = temp;
    }

    public void threeWayPartition(int array[], int a, int b) {
        int left = 0;
        int right = array.length - 1;

        for (int i = 0; i <= right; i++) {
            if (array[i] < a) {
                swap(array, left, i);
                left++;
            } else if (array[i] > b) {
                swap(array, right, i);
                right--;
                i--;
            }
        }
    }
}