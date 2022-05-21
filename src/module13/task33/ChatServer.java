package module13.task33;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

public class ChatServer {
    List<Client> clientList = new LinkedList<>();
    ServerSocket serverSocket;

    public ChatServer(int port) throws IOException {
        this.serverSocket = new ServerSocket(port);
    }

    void sendMessageToAllClients(String string, String name) {
        for (Client client : clientList) {
            client.receiveMessage(string, name);
        }
    }
    void sendMessageToAllClients(String string) {
        for (Client client : clientList) {
            client.receiveMessage(string);
        }
    }

    void run() {

        while (true) {
            System.out.println("Waiting...");
            // ждем клиента из сети
            Socket socket = null;
            try {
                socket = serverSocket.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Client connected!");
            // создаем клиента на своей стороне
            clientList.add(new Client(socket, this));
            // запускаем поток

        }
    }

    public static void main(String[] args) throws IOException {
        new ChatServer(1234).run();


    }
}
