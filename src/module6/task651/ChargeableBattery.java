package module6.task651;

public class ChargeableBattery extends Battery implements Chargeable {
    String chargingMethod;

    public ChargeableBattery(double voltage, double amperage, double capacity, double fullCapacity, String chargingMethod) {
        super(voltage, amperage, capacity, fullCapacity);
        this.chargingMethod = chargingMethod;
    }

    @Override
    public String toString() {
        return "Battery, voltage " + this.outputVoltage + "V, amperage " + this.outputAmperage + "A, charge left " +
                (int) (this.capacity / this.fullCapacity * 100) + "%" + ", charging method " + this.chargingMethod;
    }

    @Override
    public void chargeBattery(double charge) {
        if (charge > 0) {
            this.capacity = Math.min(charge + this.capacity, this.fullCapacity);
        }
    }
}
