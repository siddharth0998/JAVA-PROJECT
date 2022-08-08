// program won't work here
//geeksforgeek
// Input:
// n=9, x=5
// arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
// Output:  2 5

import java.util.ArrayList;

public class FirstLastOccuOfX {

    // 1st approach

    ArrayList<Long> find(long arr[], int n, int x) {
        ArrayList<Long> res = new ArrayList<Long>();
        boolean flag = false;
        if (n == 1) {
            if (arr[0] == x) {
                res.add((long) 0);
                res.add((long) 0);
                return res;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                if (arr[i] == x && arr[i - 1] != x) {
                    res.add((long) i);
                    flag = true;
                }
            } else {
                if (arr[i] == x) {
                    res.add((long) i);
                    flag = true;
                }
            }
            if (i != n - 1) {
                if (arr[i] == x && arr[i + 1] != x) {
                    res.add((long) i);

                }
            } else {
                if (arr[i] == x) {
                    res.add((long) i);

                }
            }
        }
        if (flag == false) {
            res.add((long) -1);
            res.add((long) -1);
            return res;
        }
        return res;
    }

    // 2nd approach

    // ArrayList<Long> find(long arr[], int n, int x) {
    // ArrayList<Long> res = new ArrayList<Long>();
    // int start = -1;
    // int end = -1;
    // boolean flag = false;
    // for (int i = 0; i < n; i++) {
    // if (arr[i] == x) {
    // res.add((long) i);
    // flag = true;
    // break;
    // }
    // }
    // for (int i = n - 1; i >= 0; i--) {
    // if (arr[i] == x) {
    // res.add((long) i);
    // break;
    // }
    // }
    // if (flag == false) {
    // res.add((long) -1);
    // res.add((long) -1);
    // return res;
    // }
    // return res;
    // }
}
