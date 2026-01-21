package org.example.newtest.CodeRetreat.CityTransport;

class TramRoute extends Route {
    public TramRoute() {
        super("Трамвайный маршрут");
    }

    @Override
    public void showStatus() {
        System.out.println(">>> " + name + " <<<");
        oneRoute.forEach(v -> System.out.println(" TRAM: " + v));
    }

    public void addVehicle(Vehicle v) {
        oneRoute.add(v);
    }
}