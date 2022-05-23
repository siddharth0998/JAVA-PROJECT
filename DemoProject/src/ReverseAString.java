public class ReverseAString {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        String s = "      My     Name    Is     Siddharth     ";
        String reverse_string = "";
        String reverse_word = "";

        // approach-1

        // int length = s.length();
        // for (int i = s.length() - 1; i >= 0; i--) {
        // reverse_string = reverse_string + s.charAt(i);
        // }
        // System.out.println("Approsch-1 Output:" + reverse_string);

        // approach-2

        /*
         * char a[] = s.toCharArray();
         * for (int i = a.length - 1; i >= 0; i--) {
         * reverse_string = reverse_string + a[i];
         * }
         * System.out.println(reverse_string);
         */

        // approach-3

        /*
         * StringBuffer sb = new StringBuffer(s);
         * 
         * System.out.println(sb.reverse_string());
         */

        // approach-4--------------an approach that skips more than one spacing...

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
                for (int k = sub.length() - 1; k >= 0; k--) {
                    reverse_word = reverse_word + sub.charAt(k);
                }
                reverse_string = reverse_word + " " + reverse_string;
                reverse_word = "";
            }
            i = j + 1;
        }
        System.out.println("Approach-4 Output: " + reverse_string);

    }

}
