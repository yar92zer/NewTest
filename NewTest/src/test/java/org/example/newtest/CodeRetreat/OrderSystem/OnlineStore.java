package org.example.newtest.CodeRetreat.OrderSystem;

class OnlineStore extends Store {
    public OnlineStore(){super("Онлайн-магазин");}

    @Override
    public void display(){
        System.out.println("=== "+ type + " ===");
        orders.forEach(o ->System.out.println(" WEB: "+ o));
    }
    public void add(Order o){ orders.add(o);}
}