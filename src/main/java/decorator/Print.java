package decorator;

public class Print implements PrintInterface{
    @Override
    public void print(String s) {
        System.out.print(s);
    }
}

