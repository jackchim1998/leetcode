package medium;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int totalSuffixZeroCnt = num1.length() + num2.length() - 2;
        int[] arr = new int[totalSuffixZeroCnt + 1];

        for (int currSuffixZeroCnt = 0; currSuffixZeroCnt <= totalSuffixZeroCnt; currSuffixZeroCnt++) {
            int sum = 0;
            for (int idx1 = 0; idx1 < num1.length(); idx1++) {
                int idx2 = currSuffixZeroCnt - idx1;
                if (idx2 < num2.length() && idx2 >= 0)
                    sum += (num1.charAt(num1.length() - idx1 - 1) - '0') * (num2.charAt(num2.length() - (idx2) - 1) - '0');
            }
            arr[currSuffixZeroCnt] = sum;
        }

        char[] digits = new char[totalSuffixZeroCnt + 1];
        int add = 0;
        for (int currSuffixZeroCnt = 0; currSuffixZeroCnt <= totalSuffixZeroCnt; currSuffixZeroCnt++) {
            int currNum = arr[currSuffixZeroCnt] + add;
            digits[currSuffixZeroCnt] = (char) ((currNum % 10) + '0');
            add = currNum / 10;
        }

        StringBuilder result = new StringBuilder().append(digits);
        if (add != 0) result.append(add);
        return result.reverse().toString();
    }
}
