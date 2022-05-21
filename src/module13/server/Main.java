package module13.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    static List<Client> clientList = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        // создаем серверный сокет на порту 1234
        ServerSocket server = new ServerSocket(1234);


        while (true) {
            out.println("Waiting...");

            // ждем клиента
            Socket socket = server.accept();
            out.println("Client connected!");
            clientList.add(new Client(socket));
        }
    }
}

class Client implements Runnable {
    Socket socket;

    public Client(Socket socket) {
        this.socket = socket;
        new Thread(this).start();
    }

    void receivingMessage(String message) {
        out.println(message);
    }

    void sendingMessageToEverybody(String message) {
        for (Client client : Main.clientList) {
            client.receivingMessage(message);
        }

    }

    @Override
    public void run() {
        try {
            // получаем потоки ввода и вывода
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            // создаем удобные средства ввода и вывода
            Scanner in = new Scanner(is);
            PrintStream out = new PrintStream(os);

            // читаем из сети и пишем в сеть
            out.println("Welcome to chat!");
            String input = in.nextLine();
            while (!input.equals("bye")) {
                sendingMessageToEverybody(input);
                input = in.nextLine();
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}