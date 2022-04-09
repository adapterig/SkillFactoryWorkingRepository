package module6.task651;

public class Main {
    public static void main(String[] args) {


        PowerSupply transformer = new Transformer(220, 5, 12, 50);
        Battery alkalineBattery = new Battery(1.5, 1, 2000, 2100);
        ChargeableBattery chargeableLiIonBattery = new ChargeableBattery(3.7, 3, 2600, 2600, "CC-CV");
        System.out.println(chargeableLiIonBattery);
        System.out.println(alkalineBattery);
        System.out.println(transformer);
        System.out.println(chargeableLiIonBattery.getCapacity());

        chargeableLiIonBattery.disCharge(1200);
        alkalineBattery.disCharge(1500);

        System.out.println(chargeableLiIonBattery);
        System.out.println(alkalineBattery);

        chargeableLiIonBattery.chargeBattery(5000);
        alkalineBattery.disCharge(1500);

        System.out.println(chargeableLiIonBattery);
        System.out.println(alkalineBattery);


    }
}
