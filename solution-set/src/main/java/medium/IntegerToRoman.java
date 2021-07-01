package medium;

/**
 * @author Jack
 * q.12
 * constraint:
 * 1 <= num <= 3999
 */
public class IntegerToRoman {
    public String intToRoman(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] arr = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            while (num >= nums[i]) {
                num -= nums[i];
                result.append(arr[i]);
            }
        }
        return result.toString();
    }
    /**
     * The below is not optimal
     * I guess too much / and % lower speed
     */
//    public String intToRoman(int num) {
//        String[][] arr = new String[][]{
//                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
//                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
//                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
//                {"", "M", "MM", "MMM"}
//        };
//        StringBuilder sb = new StringBuilder();
//        while (num > 0) {
//            if (num / 1000 > 0) {
//                sb.append(arr[3][num / 1000]);
//                num = num % 1000;
//            } else if (num / 100 > 0) {
//                sb.append(arr[2][num / 100]);
//                num = num % 100;
//            } else if (num / 10 > 0) {
//                sb.append(arr[1][num / 10]);
//                num = num % 10;
//            } else {
//                sb.append(arr[0][num]);
//                num = 0;
//            }
//        }
//        return sb.toString();
//    }

    /**
     * The below is not optimal
     * I guess toCharArray lower the speed
     */
//    public String intToRoman(int num) {
//        String[][] map = new String[][]{
//                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
//                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
//                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
//                {"", "M", "MM", "MMM"}
//        };
//        StringBuilder sb = new StringBuilder();
//        char[] arr = String.valueOf(num).toCharArray();
//        for (int i = 0; i < arr.length; i++)
//            sb.append(map[arr.length - i - 1][arr[i] - '0']);
//        return sb.toString();
//    }
}
