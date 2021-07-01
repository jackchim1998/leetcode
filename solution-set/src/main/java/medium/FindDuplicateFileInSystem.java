package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Jack
 */
public class FindDuplicateFileInSystem {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] parts = path.split(" ");
            for (int i = 1; i < parts.length; i++) {
                int idx = parts[i].indexOf('(');
                String fileName = parts[i].substring(0, idx);
                String content = parts[i].substring(idx + 1, parts[i].length() - 1);
                String fullPath = parts[0] + "/" + fileName;
                List<String> list = map.getOrDefault(content, new ArrayList<>());
                list.add(fullPath);
                map.put(content, list);
            }
        }
        return filterUnique(map);
    }

    private List<List<String>> filterUnique(Map<String, List<String>> map) {
        List<List<String>> result = new ArrayList<>();
        for (List<String> value : map.values())
            if (value.size() > 1)
                result.add(value);
        return result;
    }

}
