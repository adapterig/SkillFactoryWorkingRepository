package task651;

public class Transformer extends PowerSupply {
    double inputVoltage;
    double frequency;

    public Transformer(double voltage, double outputAmperage, double inputVoltage, double frequency) {
        super(voltage, outputAmperage, "AC");
        this.inputVoltage = inputVoltage;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Transformer, input voltage " + this.inputVoltage + "V, output voltage " + this.outputVoltage +
                "V, amperage " + this.outputAmperage + "A, frequency " + this.frequency + "Hz";
    }
}
