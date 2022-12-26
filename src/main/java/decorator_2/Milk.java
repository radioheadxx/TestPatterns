package decorator_2;

public class Milk implements Product{
    int price;

    public Milk(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
