package Activities;

public class Activity1 {
    public static void main(String[] args){
        Car baleno = new Car();
        baleno.make = 2015;
        baleno.color = "Grey";
        baleno.transmission = "Manual";

        baleno.displayCharacterstics();
        baleno.accelerate();
        baleno.brake();
    }
}
