
// MPTUKGJ
// KUTUMRJ

// YRGGYRG

public class TrafficSignal {

    public static void main(String[] args) {

        String str1 = "MPTUKGJ";
        String str2 = "KUTUMRJ";
        String outPut = "";
        boolean flag;

        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) == str2.charAt(i)) {
                outPut += "G";
            } else {
                int j = 0;
                flag = false;
                while (j < str2.length()) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        outPut += "Y";
                        flag = true;
                        break;
                    }
                    j++;
                }
                if (!flag) {
                    outPut += "R";
                }
            }
        }

        System.out.println(outPut);
    }
}
