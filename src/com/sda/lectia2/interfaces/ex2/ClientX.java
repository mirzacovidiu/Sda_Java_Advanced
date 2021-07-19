package com.sda.lectia2.interfaces.ex2;

import java.time.Instant;

public class ClientX implements ClientNotifier{


    @Override
    public void notifyClient(Instant currentTime) {
        System.out.println("ClientX received date and time: " + currentTime);
    }
}
