public class Computer {
    String brand;
    int screenSize;
    int coresNum;
    String type;

    public Computer(String brand, int screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "brand: " + brand + " screen size: " + screenSize;
    }
}
