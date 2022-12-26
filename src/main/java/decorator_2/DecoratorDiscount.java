package decorator_2;

public class DecoratorDiscount implements Product{
    private Product product;

    public DecoratorDiscount(Product product) {
        this.product = product;
    }

    @Override
    public int getPrice() {
        return product.getPrice() - 10;
    }
}
