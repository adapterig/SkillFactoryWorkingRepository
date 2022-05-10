package module11.addTask1;

import java.util.ArrayList;

public class DivArr {
    public static void main(String[] args) {
        ArrayList<Double> array1 = new ArrayList<>();
        ArrayList<Double> array2 = new ArrayList<>();
        ArrayList<Double> result = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            array1.add(Math.random() * 100);
            array2.add(Math.random() * 100);
        }
        for (int i = 0; i < 100; i++) {
            try {
                result.add(i, array1.get(i) / array2.get(i));
                if (result.get(i) < 1) {
                    throw new DivisionException(array1.get(i), array2.get(i));
                }
            } catch (DivisionException exception) {
                System.out.println("Результат меньше 1");
                ;
            } catch (ArithmeticException exception) {
                System.out.println(exception.getMessage());
            }

        }
    }


}
