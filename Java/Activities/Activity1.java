package Activity;

public class Activity1 {
    public static void main(String[] args) {
        car carobj = new car();
        carobj.make = 2014;
        carobj.color = "Black";
        carobj.transmission = "Manual";
        //Using Car class method
        carobj.displayCharacterstics();
        carobj.accelerate();
        carobj.brake();
    }
}











