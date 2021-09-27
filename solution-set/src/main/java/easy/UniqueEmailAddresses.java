package easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            char[] chars = email.toCharArray();
            int emailSignIdx = email.indexOf('@');
            int addSignIdx = email.indexOf('+');
            if (addSignIdx < 0) addSignIdx = emailSignIdx;

            StringBuilder sb = new StringBuilder(email.length());
            for (int i = 0; i < addSignIdx; i++)
                if (chars[i] != '.')
                    sb.append(chars[i]);
            sb.append(chars, emailSignIdx , chars.length - emailSignIdx );
            set.add(sb.toString());
        }
        return set.size();
    }
}
