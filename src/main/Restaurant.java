package main;

import menu.MenuService;
import order.Order;

public class Restaurant {

    public static void main(String[] args) {
        MenuService menuService = new MenuService();
        Order order = new Order();

        System.out.println("Restaurant system initialized.");
    }
}
s