public class BicycleDemo {

    public static void main(String[] args) {
        Bicycle bike1;
        Bicycle bike2;

        bike1 = new Bicycle();
        bike2 = new Bicycle();

        bike1.changeCadence( 50);
        bike1.speedUp(10);
        bike1.speedUp(30);
        bike1.changeGear(3);
        bike1.printStates();

        bike2.changeCadence( 50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.applyBrakes(80);
        bike2.printStates();

        System.out.println("-------Tandem bike---------");

        TandemBike tadem = new TandemBike();
        tadem.speedUp(40);
        tadem.applyBrakes(10, 20);
        tadem.printStates();
    }
}
