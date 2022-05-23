
// Input: arr[] = {1, 2, 3, 4, 5, 
//     6, 7, 8, 9, 10}
// k = 3
// Output: 8 9 10 1 2 3 4 5 6 7

// Input: arr[] = {121, 232, 33, 43 ,5}
// k = 2
// Output: 43 5 121 232 33

public class RightRotationOfArray {

    public static void arrayRotation(int arr[], int k) {

        for (int i = 0; i < k; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        arrayRotation(arr, 3);

        int arr1[] = { 121, 232, 33, 43, 5 };
        arrayRotation(arr1, 2);
    }
}
