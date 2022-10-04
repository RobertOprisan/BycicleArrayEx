public class Bicycle {
    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;
    static int numBikes = 0;

    void changeCadence(int newValue) {
        cadence = newValue;
    }
    void changeGear(int newValue) {
        gear = newValue;
    }
    void speedUp(int increment) {
        speed += increment;
    }
    void applyBrakes(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
    }
    void printStates() {
        System.out.println("Cadence: " + cadence + "\nGear: " + gear + "\nSpeed: " + speed);
    }
}
