package abstract_factory_method;

import factory_method_2.Car;

public class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("Toyota drives");
    }
}
