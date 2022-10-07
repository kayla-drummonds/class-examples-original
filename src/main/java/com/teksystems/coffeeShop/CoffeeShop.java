package com.teksystems.coffeeShop;

import java.util.Arrays;

public class CoffeeShop {

    private String name = "Kayla's coffee shop";
    private MenuItem[] menu = new MenuItem[0];
    private String[] orders = new String[0];

    public CoffeeShop() {

    }

    public CoffeeShop(String name, MenuItem[] menu, String[] orders) {
        this.name = name;
        this.menu = menu;
        this.orders = orders;
    }
    
    public MenuItem[] getMenu() {
        menu = new MenuItem[] {
                new MenuItem("orange juice", "drink", 2.13),
                new MenuItem("lemonade", "drink", 0.85),
                new MenuItem("cranberry juice", "drink", 3.36),
                new MenuItem("pineapple juice", "drink", 1.89),
                new MenuItem("lemon iced tea", "drink", 1.28),
                new MenuItem("apple iced tea", "drink", 1.28),
                new MenuItem("vanilla chai latte", "drink", 2.48),
                new MenuItem("hot chocolate", "drink", 0.99),
                new MenuItem("iced coffee", "drink", 1.12),
                new MenuItem("tuna sandwich", "food", 0.95),
                new MenuItem("ham and cheese sandwich", "food", 1.35),
                new MenuItem("bacon and egg", "food", 1.15),
                new MenuItem("steak", "food", 3.28),
                new MenuItem("hamburger", "food", 1.05),
                new MenuItem("cinnamon roll", "food", 1.05) };
        return menu;
    }

    public String addOrder(String name) {
        boolean found = false;

        for (MenuItem menuItem : menu) {
            if (menuItem.getItem().equals(name)) {
                found = true;
                break;
            }
        }

        if (found) {
            orders = Arrays.copyOf(orders, orders.length + 1);
            orders[orders.length - 1] = name;
            return "Order added!";
        } else {
            return "This item is currently unavailable!";
        }
    }
    
    public String removeOrderItem(String removeItemName) {
        int index = 0;
        for( ; index <= orders.length - 1; index++) {
            String orderItemName = orders[index];
            if(orderItemName.equals(removeItemName)) {
                orders[index] = null;
                break;
            }
        }
        for( ; index < orders.length - 2; index++) {
            orders[index] = orders[index + 1];
        }
        orders = Arrays.copyOfRange(orders, 0, orders.length - 1);
        return "";
    }

    public String fulfillOrder() {
        if (orders.length == 0) {
            return "All orders have been fulfilled!";
        } else {
            String item = orders[0];
            orders = Arrays.copyOfRange(orders, 1, orders.length);
            return "The " + item + " is ready!";
        }
    }

    // accessor method
    public String[] listOrders() {
        return orders;
    }

    public void listMenu() {
        String[] result = new String[0];

        for (MenuItem menuItem : menu) {
            result = Arrays.copyOf(result, result.length + 1);
            result[result.length - 1] = menuItem.getItem();
        }
        System.out.println(Arrays.toString(result));

    }

    public double dueAmount() {
        double totalPrice = 0.0;
        for (String itemName : orders) {
            for (MenuItem menuItem : menu) {
                if (menuItem.getItem().equals(itemName)) {
                    totalPrice = totalPrice + menuItem.getPrice();
                }
            }
        }

        return totalPrice;
    }

    public String cheapestItem() {
        if (menu.length == 0) {
            return null;
        }
        double minPrice = menu[0].getPrice();
        String itemName = menu[0].getItem();
        for (MenuItem menuItem : menu) {
            if (menuItem.getPrice() < minPrice) {
                minPrice = menuItem.getPrice();
                itemName = menuItem.getItem();
            }
        }
        return itemName;
    }

    public String[] drinksOnly() {
        return findByType("drink");
    }

    public String[] foodOnly() {
        return findByType("food");
    }

    private String[] findByType(String type) {
        String[] result = new String[0];
        for (MenuItem menuItem : menu) {
            if (menuItem.getType().equalsIgnoreCase(type)) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = menuItem.getItem();
            }
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
