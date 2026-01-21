package org.example.newtest.CodeRetreat.ZooOOP;

class Aquarium extends Enclosure  {
    public Aquarium(){ super("Аквариум");}

    @Override
    public void showInfo(){
        System.out.println("РЫБЫ И МОРСКИЕ: " + type);
        animals.forEach(a -> System.out.println(" ~ "+ a));
    }
    public void addAnimal(Animal a){ animals.add(a);}
}