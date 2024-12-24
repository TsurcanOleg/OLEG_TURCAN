package homework_nr_13;

import javax.sql.rowset.Predicate;
import java.util.*;
import java.util.stream.Collectors;

public class ProductMain {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>(
                Arrays.asList(
                        new Product("Phone", 49.7D, Category.ELECTRONICS),
                        new Product("Cheesecake", 25.5D, Category.FOOD),
                        new Product("Underpants", 115.0D, Category.CLOTHING),
                        new Product("TV", 58990.9D, Category.ELECTRONICS),
                        new Product("Tablet", 18900D, Category.ELECTRONICS),
                        new Product("Bread", 12.20D, Category.FOOD),
                        new Product("Cheese", 20.4D, Category.FOOD),
                        new Product("Shoes", 7.9D, Category.CLOTHING),
                        new Product("Shirt", 770.50D, Category.CLOTHING),
                        new Product("Oil", 37D, Category.FOOD),
                        new Product("Headphones", 990D, Category.ELECTRONICS)
                )
        );
        System.out.println("Price up 50");

        List<String> sortedProduct = productList.stream()
                .filter(e -> e.price > 50)
                .map(e -> e.name)
                .toList();
        System.out.println(sortedProduct);

        System.out.println("The most expensive product in the ELECTRONICS category.");

        List<String> expensiveProduct = productList.stream()
                .filter (e -> e.category == Category.ELECTRONICS)
                .max(Comparator.comparingDouble(Product::getPrice))
                .map(e-> e.name)
                .stream().toList();
        System.out.println(expensiveProduct);

        System.out.println("Number of products from the FOOD category : ");
        long nrOfProductsInFood = productList.stream()
                .filter(e-> e.category == Category.FOOD)
                .count();
        System.out.println(nrOfProductsInFood);

        System.out.println("Is there at least one product on the list that is cheaper than 20 : ");
        boolean chapterThanTwenty = productList.stream()
                        .anyMatch(e-> e.price < 20);
        System.out.println(chapterThanTwenty);


        List<Product> p1 = new ArrayList<>(Arrays.asList(
                new Product("TV", 19900D, Category.ELECTRONICS),
                new Product("WashMachine", 23500D, Category.ELECTRONICS),
                new Product("Potato", 17.5D, Category.FOOD),
                new Product("Underpants", 175D, Category.CLOTHING)
        ));

        List<Product> p2 = new ArrayList<>(Arrays.asList(
                new Product("Phone", 36000D, Category.ELECTRONICS),
                new Product("Oven", 5600D, Category.ELECTRONICS),
                new Product("Tomato", 22.75D, Category.FOOD),
                new Product("Socks", 175D, Category.CLOTHING)
        ));
        List<Product> p3 = new ArrayList<>(Arrays.asList(
                new Product("Jacked", 7900D, Category.CLOTHING),
                new Product("Meat", 80D, Category.FOOD),
                new Product("Chicken", 122D, Category.FOOD),
                new Product("Cap", 175D, Category.CLOTHING)
        ));

        List<List<Product>> productList2 = new ArrayList<>(
                Arrays.asList(p1, p2, p3));

        List<String> allProductList = productList2.stream()
                .flatMap(e-> e.stream())
                .map(e-> e.name)
                .collect(Collectors.toList());
        System.out.println(allProductList);




     }
}
