package medium;

public class AddingSpacesToString {
    public String addSpaces(String s, int[] spaces) {
        char[] org = s.toCharArray();

        char[] sb = new char[s.length() + spaces.length];
        int newIdx=0,  oldIdx= 0;
        for (int space : spaces) {
            while (oldIdx < space ) {
                sb[newIdx] =org[oldIdx];
                oldIdx++;
                newIdx++;
            }
            sb[newIdx] = ' ';
            newIdx++;
        }
        while (oldIdx < org.length) {
            sb[newIdx] = org[oldIdx];
            oldIdx++;
            newIdx++;
        }

        return new String(sb);
    }
}
