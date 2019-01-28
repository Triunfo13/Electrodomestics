package Classes;

//Whasher class that use Electrodomestic´s attributes and methods

public class washer extends Electrodomestic {

    //Constructor
    public washer(double price, double weight, String color) {
        super(price, weight, color);
    }

    //methods
    void CheckColor(){}

    void CheckPrice(){
        price=200;
        System.out.println(price);
    }


}
