package com.sda.coding_exrecises.login;

public class ChainAuthenticationElement {
    private final AuthenticationHandler authenticationHandler;
    private final ChainAuthenticationElement next;

    public ChainAuthenticationElement(final AuthenticationHandler authenticationHandler, final ChainAuthenticationElement next) {
        this.authenticationHandler = authenticationHandler;
        this.next = next;
    }

    public ChainAuthenticationElement(final AuthenticationHandler authenticationHandler) {
        this.authenticationHandler = authenticationHandler;
        this.next = null;
    }

    public boolean authenticate(final Credentials credentials) {
        final boolean authenticated = authenticationHandler.authenticate(credentials);
        if (authenticated) {
    //        log.info("Authentication using handler " + authenticationHandler.getClass().getSimpleName());
            return true;
        }

   //     return nonNull(next) && next.authenticate(credentials);
        return false;
    }
}
