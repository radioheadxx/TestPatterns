package adapter;

public class Main {

    public static void main(String[] args) {
        VectorGraphics vectorGraphics = new VectorAdapterFromRaster();
        vectorGraphics.drawLine();
        vectorGraphics.drawSquare();

    }
}
