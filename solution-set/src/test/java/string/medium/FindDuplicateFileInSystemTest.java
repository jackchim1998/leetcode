package string.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Jack
 */
class FindDuplicateFileInSystemTest {
    private final FindDuplicateFileInSystem solution = new FindDuplicateFileInSystem();

    @Test
    void example1() {
        List<List<String>> result = solution.findDuplicate(new String[]{"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"});
        // it need to sort to test
    }

}
