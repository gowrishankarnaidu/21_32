abstract class Vehicle {
    abstract void startEngine();
public void stopEngine() {
        System.out.println("Vehicle engine stopped");
    }
}
class Bike extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bike engine started using self-start");
    }
}
class Main21 {
    public static void main(String[] args) {
        Bike a = new Bike();
        a.stopEngine();
        a.startEngine();
    }
}