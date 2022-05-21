package module13.task0;

import java.util.Scanner;

public class Main extends Thread{
    public static void main(String[] args) {
        //заводим счет на бирже
        StockAccount stockAccount = new StockAccount();
        //счет начинает работать
        stockAccount.run();
        //прибыль
        long profit = 0;
        //блок управления
        Scanner in = new Scanner(System.in);
        String command = "";
        while (!command.equals("exit")) {
            command = in.next();
            switch(command){
                case "check":
                    System.out.println(stockAccount.money);
                    break;
                case "fix":
                    //Фиксируем прибыль
                    profit += (long)stockAccount.money - 1000;
                    System.out.println("Profit is " + profit);
                    //На счету остается минимальный остаток
                    stockAccount.money = 1000;
            }
        }
    }
}

class StockAccount extends Thread {
    int money = 1000;
    @Override
    public void run() {
        while(true){
            money++;
        }
    }
}