public class Test {
    public static void main(String[] args) {
        String str = "    Welcome      to      this Javascript     ";
        String word = "";
        String reverseByWord = "";

        int i = 0;
        int j = 0;
        while (i < str.length()) {
            while (i < str.length() && str.charAt(i) == ' ') {
                i++;
            }
            j = i + 1;
            while (j < str.length() && str.charAt(j) != ' ') {
                j++;
            }
            if (j < str.length()) {
                String sub = str.substring(i, j);
                for (int k = sub.length() - 1; k >= 0; k--) {
                    word += sub.charAt(k);
                }
                reverseByWord += word + " ";
                word = "";
                i = j + 1;
            }
        }

        System.out.println(reverseByWord);

    }
}
