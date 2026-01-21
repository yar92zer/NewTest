package org.example.newtest.CodeRetreat.ZooOOP;

class Aviary extends Enclosure {
    public Aviary() {
        super("Вольер для птиц");
    }
    @Override
    public void showInfo() {
        System.out.println("ПТИЦЫ: " + type);
        animals.forEach(a -> System.out.println(" → " + a));
    }

    public void addAnimal(Animal a) {
        animals.add(a);
    }
}