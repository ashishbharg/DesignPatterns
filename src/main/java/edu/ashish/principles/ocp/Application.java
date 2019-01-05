package edu.ashish.principles.ocp;

import java.util.ArrayList;
import java.util.List;


public class Application {

    public static void main(String[] args) {

        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product orange = new Product("Orange", Color.GREEN, Size.SMALL);
        Product pear = new Product("Pear", Color.RED, Size.MEDIUM);

        List<Product> products = new ArrayList<>();
        products.add(apple);
        products.add(orange);
        products.add(pear);

        System.out.println("Filtration by old mechanism which is breaking OCP");
        System.out.println("Filter on GREEN color");
        ProductFilter filter = new ProductFilter();
        filter.filterByColor(products, Color.GREEN).forEach(product ->
                System.out.println(product.getName() + " is GREEN"));

        System.out.println("Filter on SMALL size");
        filter.filterBySize(products, Size.SMALL).forEach(product ->
                System.out.println(product.getName() + " is small"));

        System.out.println("Filter on MEDIUM size and RED color");
        filter.filterByColorAndSize(products, Color.RED, Size.MEDIUM).forEach(product ->
                System.out.println(product.getName() + " is small"));

        System.out.println("Filtration by new mechanism supporting OCP");
        System.out.println("Filter on GREEN color");
        ProductFilter_v2 productFilterV2 = new ProductFilter_v2();
        productFilterV2.filter(products, new ColorSpecification(Color.GREEN)).forEach(product ->
                System.out.println(product.getName() + " is GREEN"));

        System.out.println("Filter on SMALL size");
        productFilterV2.filter(products, new SizeSpecification(Size.SMALL)).forEach(product ->
                System.out.println(product.getName() + " is small"));

        System.out.println("Filter on MEDIUM size and RED color");
        productFilterV2.filter(products, new AndSpecification<>(
                new ColorSpecification(Color.RED),
                new SizeSpecification(Size.MEDIUM))).forEach(product ->
                System.out.println(product.getName() + " is RED and medium"));
    }
}
