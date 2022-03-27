package task651;

public class Battery extends PowerSupply implements Dischargeable {
    double capacity;
    double fullCapacity;

    public Battery(double voltage, double amperage, double capacity, double fullCapacity) {
        super(voltage, amperage, "DC");
        this.capacity = capacity;
        this.fullCapacity = fullCapacity;
    }

    @Override
    public String toString() {
        return "Battery, voltage " + this.outputVoltage + "V, amperage " + this.outputAmperage + "A, charge left " +
                (int) (this.capacity / this.fullCapacity * 100) + "%";
    }

    @Override
    public double getCapacity() {
        return capacity;
    }

    @Override
    public double getFullCapacity() {
        return fullCapacity;
    }

    @Override
    public void disCharge(double charge) {
        if (charge > 0) {
            this.capacity = charge < this.capacity ? this.capacity - charge : 0;
        }
    }
}
