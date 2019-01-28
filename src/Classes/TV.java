package Classes;

//TV class that use Electrodomestic´s attributes and methods
public class TV extends Electrodomestic {

    //TV´s attributes
    public int channels;
    public double display;

    //Contructor
    public TV(double price, double weight, String color) {
        super(price, weight, color);
    }

    //Methods
    @Override
    void CheckColor(){}

    @Override
    void CheckPrice() {
        price =900;
        System.out.println(price);
    }

    //TV´s method
    public void ChangeChannel(){}

}
