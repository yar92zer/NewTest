package org.example.newtest.CodeRetreat.CityTransport;

import java.util.*;

public class CityTransport {
    public static void main(String[] args) {
        Map<String, Route> transport = new LinkedHashMap<>();
        Set<String> uniqueModels = new HashSet<>();
        try {
            Vehicle bus1 = new Vehicle("ЛиАЗ-5292", 90);
            Vehicle tram1 = new Vehicle("Татра Т3", 120);

            BusRoute busRoute =   new BusRoute();
            TramRoute tramRoute = new TramRoute();

            busRoute.addVehicle(bus1);
            tramRoute.addVehicle(tram1);

            Route r1 = busRoute;
            Route r2 = tramRoute;

            transport.put("Автобусы", busRoute);
            transport.put("Трамваи", tramRoute);

            bus1.start();
            tram1.stop();

            uniqueModels.add(bus1.getModel().split(" ")[0]);
            uniqueModels.add(tram1.getModel().split(" ")[0]);

            System.out.println("=== ГОРОДСКОЙ ТРАНСПОРТ ===");
            transport.values().forEach(Route::showStatus);

            System.out.println("\nУникальные модели: " + uniqueModels);
            System.out.println("Всего транспорта: " + Vehicle.getTotal());
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}