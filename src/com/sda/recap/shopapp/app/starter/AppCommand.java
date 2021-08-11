package com.sda.recap.shopapp.app.starter;

import java.util.stream.Stream;

public enum AppCommand {
        LOGIN_CUSTOMER("Please insert the account id:", false, true),
        LOGOUT("Customer logged out from the application.", true, false),
        SEARCH_PRODUCT("Please insert the product name:", true, false),
        BUY_PRODUCT("Please insert the product id:", true, false),
        OPTION_NOT_DEFINED("Please insert a valid option!", false, false),
        EXIT("Goodbye !", true, true);

        String commandText;
        boolean activeForLoggedInUser;
        boolean activeForUserNotLoggedIn;

        private AppCommand(String commandText, boolean activeForLoggedInUser, boolean activeForUserNotLoggedIn) {
            this.commandText = commandText;
            this.activeForLoggedInUser = activeForLoggedInUser;
            this.activeForUserNotLoggedIn = activeForUserNotLoggedIn;
        }

        public String getCommandText() {
            return this.commandText;
        }

        public static void printOptions(boolean userIdLoggedIn) {
            System.out.println("-------------------------------------------");
            System.out.println("Online shop possible actions are:");
            System.out.println("============================================");
            if (userIdLoggedIn) {
                Stream.of(values()).filter((appCommand) -> {
                    return appCommand.activeForLoggedInUser;
                }).forEach((appCommand) -> {
                    System.out.println(appCommand.name());
                });
            } else {
                Stream.of(values()).filter((appCommand) -> {
                    return appCommand.activeForUserNotLoggedIn;
                }).forEach((appCommand) -> {
                    System.out.println(appCommand.name());
                });
            }

            System.out.println("-------------------------------------------");
            System.out.println("Please insert an option:");
        }
    }
