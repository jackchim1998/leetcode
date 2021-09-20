package medium;

/**
 * @author Jack
 */
public class VerifyPreorderSerializationOfABinaryTree {
    public boolean isValidSerialization(String preorder) {
        int offset = 0;
        int len = preorder.length();
        int i = 0;
        while (i < len) {
            offset += preorder.charAt(i) == '#' ? -1 : 1;
            if (offset < 0 && i != len - 1) return false;
            i++;
            while (i < len && preorder.charAt(i - 1) != ',')
                i++;
        }
        return offset == -1;
    }
}
