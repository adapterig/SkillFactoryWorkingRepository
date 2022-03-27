package task651;

abstract public class PowerSupply {
    double outputVoltage;
    double outputAmperage;
    String outputTypeOfCurrent;

    public PowerSupply(double voltage, double outputAmperage, String outputTypeOfCurrent) {
        this.outputVoltage = voltage;
        this.outputAmperage = outputAmperage;
        this.outputTypeOfCurrent = outputTypeOfCurrent;
    }


}
