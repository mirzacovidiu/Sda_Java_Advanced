package com.sda.lectia2.interfaces.ex2;

public class Main {
    public static void main(String[] args){

        ClientNotifier[] clients = new ClientNotifier[2];

        clients[0] = new ClientX();
        clients[1] = new ClientX();
        Server server = new Server(clients);

        server.notifyAllClients();
//        server.notifyAllClients();

    }
}
