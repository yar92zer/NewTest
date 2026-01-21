package org.example.newtest.CodeRetreat.CityTransport;

class BusRoute extends Route {
    public BusRoute() {
        super("Автобусный маршрут");
    }

    @Override
    public void showStatus() {
        System.out.println("=== " + name + " ===");
        oneRoute.forEach(v -> System.out.println(" BUS: " + v));
    }

    public void addVehicle(Vehicle v) {
        oneRoute.add(v);
    }
}