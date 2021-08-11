package com.sda.recap.shopapp.app.starter;

import com.sda.recap.shopapp.app.repository.GroceryProductRepo;
import com.sda.recap.shopapp.app.repository.GroceryProductRepositoryImpl;
//import com.sda.recap.shopapp.app.service.GroceryProductService;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {

/*
    private static final Scanner SCANNER = new Scanner(System.in);

    private static Integer loggedInUser;

    private static final GroceryProductService productService = new GroceryProductService();
*/

    public static void main(String[] args) throws IOException {

        GroceryProductRepo groceryProductRepo = new GroceryProductRepositoryImpl();
        System.out.println(groceryProductRepo.findByName("Snapple - Mango Maddness"));
/*
        System.out.println("Welcome to the online shop !");

        AppCommand command;
        do {
            try {
                AppCommand.printOptions(loggedInUser != null);
                command = AppCommand.valueOf(SCANNER.nextLine());
            } catch (IllegalArgumentException var4) {
                command = AppCommand.OPTION_NOT_DEFINED;
            }

            try {
                switch(command) {
                    case LOGIN_CUSTOMER:
                        System.err.println(command.getCommandText());
                        loggedInUser = SCANNER.nextInt();
                        break;
                    case LOGOUT:
                        System.err.println(command.getCommandText());
                        loggedInUser = null;
                        break;
                    case BUY_PRODUCT:
                        System.err.println(command.getCommandText());
                        break;
                    case SEARCH_PRODUCT:
                        productService.viewAllOrderedByPrice().stream().forEach((product) -> {
                            System.out.println(product);
                        });
                        System.err.println(command.getCommandText());
                        String name = SCANNER.nextLine();
                        System.out.println((String)productService.search(name).map(Objects::toString).orElse("Product was not found"));
                        break;
                    case EXIT:
                    case OPTION_NOT_DEFINED:
                        System.err.println(command.getCommandText());
                }
            } catch (InputMismatchException var3) {
                System.err.println("Wrong data was inserted !");
            }
        } while(!AppCommand.EXIT.equals(command));
*/

    }

}

