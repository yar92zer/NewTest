package org.example.newtest.CodeRetreat.OrderSystem;

import java.util.*;

public class OrderSystem {
    public static void main(String []args){
        Map<String, Store> system = new LinkedHashMap<>();
        Set<String> uniqueCustomers = new HashSet<>();

        Order o1 = new Order("Алексей", 89.99);
        Order o2 = new Order ("Мария", 1250.50);

        OnlineStore online = new OnlineStore();
        PhysicalStore physical =new PhysicalStore();

        online.add(o1);
        physical.add(o2);

        o1.pay();
        o2.pay();

        Store s1 = online;
        Store s2 = physical;

        system.put("Онлайн", online);
        system.put("Офлайн", physical);

        uniqueCustomers.add(o1.getCustomer());
        uniqueCustomers.add(o2.getCustomer());

        System.out.println("=== СИСТЕМА ЗАКАЗОВ ===");
        system.values().forEach(Store::display);

        System.out.println("\nУникальные клиенты: "+ uniqueCustomers);
        System.out.println("Всего заказов: "+ Order.getTotal());
    }
}