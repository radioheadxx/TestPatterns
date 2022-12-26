package decorator_2;

public class Main {
    public static void main(String[] args) {
        Product product = new DecoratorDiscount(new Milk(25));
        System.out.println(product.getPrice());
    }
}
