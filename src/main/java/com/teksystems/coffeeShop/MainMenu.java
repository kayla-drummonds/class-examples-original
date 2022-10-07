package com.teksystems.coffeeShop;

import java.util.Scanner;

public class MainMenu {

    private static Scanner scan = new Scanner(System.in);

    private static MenuItem[] menu = new MenuItem[0];

    private static String[] orders = new String[0];
    private static CoffeeShop tcs = new CoffeeShop("Kayla's Coffee Shop", menu, orders);

    MenuItem menuItem = new MenuItem();

    public static void main(String[] args) {
        try {
            MainMenu m = new MainMenu();
            m.start();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }

    public void start() {

        while (true) {
            int selection = showMenuAndCaptureUserInput();
            switch (selection) {
                case 1:
                    orderMenuItem();
                    break;
                case 2:
                    listOrderDetails();
                    break;
                case 3:
                    for (int i = 0; i < tcs.listOrders().length; i++) {
                        System.out.println(tcs.fulfillOrder());
                    }
                    break;
                case 4:
                    removeOrderItem();
                    break;
                case 5:
                    // show coffee shop menu
                    showCoffeeShopMenu();
                    break;
                case 6:
                    System.out.println("Thanks for coming! Please come again!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid menu selection.");
            }

        }
    }

    private void showCoffeeShopMenu() {
        System.out.println("=========================");
        System.out.println("Coffee Shop Menu");
        MenuItem[] menu = tcs.getMenu();
        for(MenuItem item : menu) {
            System.out.println(item);
        }
    }

    private void removeOrderItem() {
        System.out.println("Enter item to remove: ");
        String itemName = scan.nextLine();

        String success = tcs.removeOrderItem(itemName);
        System.out.println("\n" + success + "\n");
    }

    // fix this function to display a different message if there are no items
    // ordered
    private void listOrderDetails() {
        String[] orderItems = tcs.listOrders();
        System.out.println("==============================");
        System.out.println("\nYour current order contains: ");
        for (String item : orderItems) {
            System.out.println(item);
        }
        System.out.println("\nTotal Amount Due: " + tcs.dueAmount());
    }

    private void orderMenuItem() {
        tcs.listMenu();
        System.out.println("Enter item to order: ");
        String itemName = scan.nextLine();
        String success = tcs.addOrder(itemName);
        System.out.println("\n" + success + "\n");
    }

    private int showMenuAndCaptureUserInput() {
        System.out.println("Welcome to " + tcs.getName() + "!\nSelect an option from the menu.");
        System.out.println("==========================");
        System.out.println("1) Order Item");
        System.out.println("2) List Order");
        System.out.println("3) Fulfill Order");
        System.out.println("4) Delete item from order");
        System.out.println("5) Coffee Shop Menu");
        System.out.println("5) Exit");

        System.out.print("Enter menu option: ");

        int selection = scan.nextInt();
        scan.nextLine();
        return selection;
    }

}
