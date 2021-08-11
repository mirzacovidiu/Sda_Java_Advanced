package com.sda.coding_exrecises.login;

public interface AuthenticationHandler {
    boolean authenticate(Credentials credentials);
    boolean supports(Class<?> clazz);
}
