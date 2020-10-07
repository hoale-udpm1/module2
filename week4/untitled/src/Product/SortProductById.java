package Product;

import java.util.Comparator;

public class SortProductById implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        if (product1.getId() > product2.getId()) {
            return 1;
        }
        return -1;
    }

}

