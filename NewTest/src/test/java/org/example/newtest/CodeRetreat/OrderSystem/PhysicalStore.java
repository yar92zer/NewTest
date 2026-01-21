package org.example.newtest.CodeRetreat.OrderSystem;

class PhysicalStore extends Store {
    public PhysicalStore() {
        super("Физический магазин");
    }

    @Override
    public void display() {
        System.out.println(">>> " + type + " <<<");
        orders.forEach(o -> System.out.println(" POS: " + o));
    }

    public void add(Order o) {
        orders.add(o);
    }
}