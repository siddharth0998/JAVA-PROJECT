
// Let arr[] be {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}

// a) Elements are first moved in first set – (See below 
//    diagram for this movement)

//       arr[] after this step --> {4 2 3 7 5 6 10 8 9 1 11 12}

// b)    Then in second set.
//           arr[] after this step --> {4 5 3 7 8 6 10 11 9 1 2 12}

// c)    Finally in third set.
//           arr[] after this step --> {4 5 6 7 8 9 10 11 12 1 2 3}

public class LeftRotationOfArrayByJump {

    public void leftRotate(int arr[], int k, int n) {
        int g_c_d = gcd(n, k);

        for (int i = 0; i < g_c_d; i++) {

            int temp = arr[i];
            int j = i;
            while (true) {
                if ((j + k) >= n) {
                    break;
                }
                arr[j] = arr[j + k];
                j = j + k;
            }
            arr[j] = temp;
        }

    }

    void display(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        LeftRotationOfArrayByJump obj1 = new LeftRotationOfArrayByJump();
        int n = arr.length;
        int k = 2;
        obj1.leftRotate(arr, k, n);
        obj1.display(arr, n);
    }
}
