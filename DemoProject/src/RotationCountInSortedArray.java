
// Input: arr[] = {15, 18, 2, 3, 6, 12}
// Output: 2
// Explanation: Initial array must be {2, 3, 6, 12, 15, 18}. We get the given array after rotating the initial array twice.

// Input: arr[] = {7, 9, 11, 12, 5}
// Output: 4

// Input: arr[] = {7, 9, 11, 12, 15};
// Output: 0

public class RotationCountInSortedArray {

    public static int indexOfSmallestNum(int arr[]) {
        int smallestnum = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i] && arr[i + 1] < smallestnum) {
                smallestnum = arr[i + 1];
                index = i + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 15, 18, 2, 3, 6, 12 };
        int arr1[] = { 7, 9, 11, 12, 5 };
        int arr2[] = { 7, 9, 11, 12, 15 };
        System.out.println(indexOfSmallestNum(arr));
        System.out.println(indexOfSmallestNum(arr1));
        System.out.println(indexOfSmallestNum(arr2));
    }

}
