package module11.addTask1;

class DivisionException extends Exception {
    double num1;
    double num2;

    public DivisionException(double num1, double num2) {

        this.num1 = num1;
        this.num2 = num2;

    }

}