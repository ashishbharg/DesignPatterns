package edu.ashish.principles.ocp;

import java.util.List;
import java.util.stream.Stream;

/**
 * This class is basically used for filters. Now after some time, if requirement comes for another filter
 * sucha s filter by size or color, then we may need to write another filter here. So basically we are modifying this
 * class. This is violating OCP principle. In order to achieve OCP, we can include Specification pattern here.
 *
 * Refer Specification and Filter interfaces which are closed for modification but open for extension.
 */

public class ProductFilter {

    public Stream<Product> filterByColor(List<Product> products, Color color) {

        return products.stream().filter(product -> product.getColor() == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size) {

        return products.stream().filter(product -> product.getSize() == size);
    }

    public Stream<Product> filterByColorAndSize(List<Product> products, Color color, Size size) {

        return products.stream().filter(product -> product.getSize() == size &&
                product.getColor() == color);
    }
}
