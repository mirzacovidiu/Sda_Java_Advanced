package com.sda.coding_exrecises.login;

import java.util.UUID;

public class AwsSignature implements Credentials {
    @Override
    public String getCredentials(final String userId) {
        return UUID.randomUUID().toString(); // dummy implementation
    }
}
