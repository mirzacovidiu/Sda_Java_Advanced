package com.sda.lectia2.interfaces.ex2;

import java.time.Instant;

public class Server {

    private ClientNotifier[] clients;

    public Server(ClientNotifier[] clients){
        this.clients = clients;
    }
    public void notifyAllClients(){
        for(ClientNotifier client : clients){
            client.notifyClient(Instant.now());
        }
    }
}
