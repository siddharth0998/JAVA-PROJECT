public class ReverseStringByWord {
    public static void main(String[] args) {
        // String str = "My Name Is Siddharth";
        // String[] arr = str.split(" ");
        // for (int i = arr.length - 1; i >= 0; i--) {
        // System.out.print(arr[i] + " ");
        // }

        /*
         * String str = "My Name Is A Siddharth";
         * str = str + " ";
         * String reverse = "", word = "";
         * for (int i = 0; i < str.length(); i++) {
         * char ch = str.charAt(i);
         * if (ch != ' ') {
         * word = word + ch;
         * } else {
         * reverse = word + " " + reverse;
         * word = "";
         * }
         * }
         * System.out.println(reverse);
         */

        String s = "  My   Name  Is  A        Siddharth           ";
        String reverse = " ";
        int i = 0, j = 0;
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            j = i + 1;
            while (j < s.length() && s.charAt(j) != ' ') {
                j++;
            }
            if (i < s.length() && j < s.length()) {
                String sub = s.substring(i, j);
                reverse = sub + " " + reverse;
                sub = "";
            }
            i = j + 1;
        }
        System.out.println(reverse);

    }
}