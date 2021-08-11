package com.sda.exercises2021.designpatterns.singleton;


/*
Create a singleton Servers of lazy type. This singleton stores the list of servers (as String). Implement the following functionalities:
        adding a server to the list
        a method adding the server to the list should return boolean (true if the server has been added to the list, false if it's otherwise)
        adding is possible, if its name starts from http or https
        adding a duplicated name is impossible.
        downloading a list of servers, that names start from http.
        downloading a list of servers, that names start from https.
*/

/*import java.awt.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Servers {

    private static Servers instance;

    public Servers getInstance() {
        if (instance == null) {
            instance = new Servers();
        }
        return instance;
    }

    private final List<String> serverList;

    private Servers() {
        serverList = new ArrayList<>();
    }

    public boolean addServer(final String server) {
        if ((server.startsWith("http") || server.startsWith("https"))
                && !serverList.contains(server)) {
            return serverList.add(server);
        }
        return false;
    }

    public List<String> getHttpServers() {
        return serverList.stream()
                .filter(server -> server.startsWith("http"))
                .collect(Collectors.toUnmodifiableList());
    }

    private List<String> getServersStartingWith(final String prefix) {
        return serverList.stream()
                .filter(server -> server.startsWith(prefix))
                .collect(Collectors.toUnmodifiableList());
    }
}*/

