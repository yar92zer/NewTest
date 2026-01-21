package org.example.newtest.CodeRetreat.LordOfTheRings;

class Sauron extends RingBearer {
    public Sauron() {
        super("Саурон");
    }

    @Override
    public void speak() {
        System.out.println("<<ОДНО КОЛЬЦО -МОЁ>>");
    }

    @Override
    public void putOnRing() throws RingTakenException {
        hasRing = true;
        OneRing.take(this);
        System.out.println("САУРОН ВЕРНУЛ КОЛЬЦО! МИР ПОГРУЖАЕТСЯ ВО ТЬМУ!");
    }
}