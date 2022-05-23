
// For example, consider array {-10, -3, 5, 6, -2}. The maximum product is the (-10, -3) or (5, 6) pair.

public class MaxProductInArray {

    public static void maxProduct(int arr[]) {

        int maxproduct = Integer.MIN_VALUE;
        int max_i = 0, min_j = 0;

        if (arr.length == 0)
            System.out.println("array is null, can't find product of two number.");

        if (arr.length == 1)
            System.out.println("product is the element itself : " + arr[0]);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (maxproduct < arr[i] * arr[j]) {
                    maxproduct = arr[i] * arr[j];
                    max_i = i;
                    min_j = j;
                }
            }
        }
        if (arr.length >= 2) {
            System.out.println("product is : " + maxproduct);
            System.out.println("max product pair is : " + "{" + arr[max_i] + "," + arr[min_j] + "}");
        }
    }

    public static void main(String[] args) {
        int[] arr = { -10, -3, 4, 5, 6, 1, 0 };
        maxProduct(arr);
    }
}