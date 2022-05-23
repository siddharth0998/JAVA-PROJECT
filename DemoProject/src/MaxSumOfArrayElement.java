
// Input: arr[] = {8, 3, 1, 2}
// Output: 29
// Explanation: Lets look at all the rotations,
// {8, 3, 1, 2} = 8*0 + 3*1 + 1*2 + 2*3 = 11
// {3, 1, 2, 8} = 3*0 + 1*1 + 2*2 + 8*3 = 29
// {1, 2, 8, 3} = 1*0 + 2*1 + 8*2 + 3*3 = 27
// {2, 8, 3, 1} = 2*0 + 8*1 + 3*2 + 1*3 = 17

public class MaxSumOfArrayElement {

    public static int maxSum(int arr[]) {

        int result = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = 0; j < arr.length; j++) {
                sum += j * arr[(i + j) % arr.length];
            }
            result = Math.max(result, sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 1, 2 };
        System.out.println(maxSum(arr));

    }
}
