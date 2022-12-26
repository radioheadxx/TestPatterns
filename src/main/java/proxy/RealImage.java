package proxy;

public class RealImage implements Image{

    String file;

    public RealImage(String file) {
        this.file = file;
        load();
    }

    public void load() {
        System.out.println("The file is loading " + file);
    }

    @Override
    public void display() {
        System.out.println("showing " + file);
    }
}
