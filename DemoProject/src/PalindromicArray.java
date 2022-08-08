//geeksforgeek
//not run here
// Input:
// 5
// 111 222 333 444 555
// 3
// 121 131 20

// Output:
// 1
// 0

class PalindromicArray {
    public static int palinArray(int[] a, int n) {
        int check = 0;
        for (int i = 0; i < n; i++) {
            int num = a[i];

            int rev_num = 0;
            while (num > 0) {
                rev_num = rev_num * 10 + num % 10;
                num = num / 10;
            }

            if (a[i] == rev_num) {
                check++;
            }
        }
        if (check != n) {
            return 0;
        }
        return 1;
    }
}