package edu.ashish.principles.ocp;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter_v2 implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> specification) {

        return items.stream().filter(product -> specification.isSatisfied(product));
    }
}
