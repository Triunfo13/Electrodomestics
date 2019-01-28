package Classes;

//This is my abstract class where I set object´s attributes and methods
public abstract class Electrodomestic {
    //attributes
    public double price = 100;
    private String[] colors = {"white", "black", "blue","grey"};
    public String color = colors[0];
    public double weight = 5;

    // constructors
    public Electrodomestic() {
    }

    public Electrodomestic(double price, double weight, String color) {
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    public Electrodomestic(String[] colors) {
        this.colors = colors;
    }

    //Abstract methods to use them in other classes
    abstract void CheckColor();

    abstract void CheckPrice();


}
