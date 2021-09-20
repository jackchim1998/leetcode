package medium;

/**
 * @author Jack
 */
public class ComplexNumberMultiplication {
    public String complexNumberMultiply(String num1, String num2) {
        String[] x = num1.split("[+i]");
        String[] y = num2.split("[+i]");
        int aReal = Integer.parseInt(x[0]);
        int aImg = Integer.parseInt(x[1]);
        int bReal = Integer.parseInt(y[0]);
        int bImg = Integer.parseInt(y[1]);
        return (aReal * bReal - aImg * bImg) + "+" + (aReal * bImg + aImg * bReal) + "i";
    }

}
