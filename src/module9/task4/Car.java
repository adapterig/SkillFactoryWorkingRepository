package module9.task4;

public class Car {
    String carModel;
/**/
    public Car(String carModel) {
        this.carModel = carModel;
    }

    public class Engine {
        boolean isWorking;
        int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
            this.isWorking = false;
        }

        public String startStopEngine() {
            if (isWorking) {
                isWorking = false;
                return "engine was stopped";
            } else {
                isWorking = true;
                return "engine was started";
            }
        }
    }
}
