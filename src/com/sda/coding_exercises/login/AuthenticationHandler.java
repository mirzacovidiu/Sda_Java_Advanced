package com.sda.coding_exercises.login;

public interface AuthenticationHandler {
    boolean authenticate(Credentials credentials);
    boolean supports(Class<?> clazz);
}
