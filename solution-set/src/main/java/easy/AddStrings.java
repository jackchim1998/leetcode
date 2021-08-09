package easy;

/**
 * @author Jack
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int one = 0;
        if (num1.length() < num2.length()) num1 = "0".repeat(num2.length() - num1.length()) + num1;
        else num2 = "0".repeat(num1.length() - num2.length()) + num2;
        for (int i = num1.length() - 1; i >= 0; i--) {
            int sum = num1.charAt(i) + num2.charAt(i) - '0' * 2 + one;
            sb.append(sum % 10);
            one = sum / 10;
        }
        if (one > 0)
            sb.append('1');
        return sb.reverse().toString();
    }
}
