import java.util.Scanner;

public abstract class Appliance {
    public abstract void turnOn();
}

class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("Fan is turning on.");
    }
}

class TV extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("TV is turning on.");
    }
}

