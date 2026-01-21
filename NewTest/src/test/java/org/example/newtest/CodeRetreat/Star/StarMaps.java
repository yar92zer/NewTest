package org.example.newtest.CodeRetreat.Star;

class StarMaps extends StarWars {
    public StarMaps(String name) {
        super(name);
    }
    @Override
    public void timeStar() {
        System.out.println(">>> " + name + " — звёздный путь активирован!");
    }
}