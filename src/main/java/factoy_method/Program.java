package factoy_method;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
//        Developer developer = new JavaDeveloper();
//        developer.writeCode();
        DeveloperFactory developerFactory = new JavaDeveloperFactory();
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
        List<Object> list = new ArrayList<>();
    }
}
