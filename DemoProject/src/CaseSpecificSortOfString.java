// Code won't work here
// N = 12
// S = defRTSersUXI
// Output: deeIRSfrsTUX
// Explanation: Sorted form of given string
// with the same case of character as that
// in original string is deeIRSfrsTUX

import java.util.Arrays;

public class CaseSpecificSortOfString {

    public static String caseSort(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        int upper = -1;
        int lower = -1;

        if (arr[0] < 97) {
            upper = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 97) {
                lower = i;
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            char ch = str.charAt(i);
            if (ch < 97) {
                sb.append(arr[upper++]);
            } else {
                sb.append(arr[lower++]);
            }
        }
        if (upper == -1 || lower == -1)
            return new String(arr);

        return new String(sb);
    }
}