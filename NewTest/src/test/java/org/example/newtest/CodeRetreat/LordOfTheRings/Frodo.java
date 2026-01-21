package org.example.newtest.CodeRetreat.LordOfTheRings;

class Frodo extends RingBearer {
    public Frodo() {
        super("Фродо Бэггинс");
    }

    @Override
    public void speak() {
        System.out.println("<<Я возьму Кольцо...хотя я не знаю пути.>>");
    }

    @Override
    public void putOnRing() throws RingTakenException {
        if (OneRing.isTaken()) throw new RingTakenException("Уже на пальце!");
        hasRing = true;
        OneRing.take(this);
        System.out.println("Фродо надевает Единое Кольцо и исчезает...");
    }
}