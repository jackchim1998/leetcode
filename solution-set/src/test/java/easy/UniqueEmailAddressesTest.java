package easy;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class UniqueEmailAddressesTest {
    private final UniqueEmailAddresses solution = new UniqueEmailAddresses();

    @Test
    void example1() {
        int result = solution.numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"});
        assertEquals(2, result);
    }

    @Test
    void example2() {
        int result = solution.numUniqueEmails(new String[]{"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"});
        assertEquals(3, result);
    }

    @Test
    void example3() {
        int result = solution.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.email.leet+alex@code.com"});
        assertEquals(2, result);
    }
}