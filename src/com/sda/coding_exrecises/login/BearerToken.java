package com.sda.coding_exrecises.login;

public class BearerToken implements Credentials {
    @Override
    public String getCredentials(final String userId) {
        return "1/mZ1edKKACtPAb7zGlwSzvs72PvhAbGmB8K1ZrGxpcNM"; // dummy implementation
    }
}
