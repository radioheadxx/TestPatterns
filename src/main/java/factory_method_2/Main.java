package factory_method_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactoryImpl();
        Car car = carFactory.createCar("Porsche");
        car.drive();
//        ThreadPoolExecutor
    }
}
