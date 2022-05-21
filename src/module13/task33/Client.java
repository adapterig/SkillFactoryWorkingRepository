package module13.task33;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Client implements Runnable {
    Socket socket;
    Scanner in;
    PrintStream out;
    ChatServer server;
    String name;

    public Client(Socket socket, ChatServer server) {

        this.socket = socket;
        this.server = server;
        new Thread(this).start();
    }

    void receiveMessage(String message, String name) {
        out.println(name + ": " + message + " (" + new GregorianCalendar().getTime() + ")");
    }

    void receiveMessage(String message) {
        out.println(message + " (" + new GregorianCalendar().getTime() + ")");
    }

    public void run() {
        try {
            // получаем потоки ввода и вывода
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            // создаем удобные средства ввода и вывода
            in = new Scanner(is);
            out = new PrintStream(os);

            // читаем из сети и пишем в сеть
            out.println("Input your name");
            String input;
            do {

                input = in.nextLine();
            } while (input.equals(""));
            name = input;
            out.println("Welcome to chat, " + name + "!");
            server.sendMessageToAllClients(name + " joined to chat.");

            input = in.nextLine();
            while (!input.equals("bye")) {
                server.sendMessageToAllClients(input, name);

                input = in.nextLine();
            }
            server.sendMessageToAllClients(name + " leaved to chat.");
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}