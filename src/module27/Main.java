package module27;

// Теперь попробуем, как это работает
public class Main {
    public static void main(String[] args) {
        //Создаем фастфуд с терминалом
        FastFood ckf = new CKF(new NfcTerminal());
        ckf.saleFood(50);
        ckf.setTerminal(new TouchTerminal());// сменим терминал
        ckf.saleFood(570);

        FastFood donald = new DonaldDuck(new TouchTerminal());
        donald.saleFood(300);
    }
}
