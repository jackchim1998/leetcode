package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jack
 */
public class SearchSuggestionSystem {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<String> productList = Arrays.asList(products);
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < searchWord.length(); i++) {
            char targetChar = searchWord.charAt(i);
            List<String> list = new ArrayList<>();
            for (String product : productList)
                if (i < product.length() && targetChar == product.charAt(i))
                    list.add(product);
            result.add(list.subList(0, Math.min(3, list.size())));
            productList = list;
        }
        return result;
    }

}
