package org.example.newtest.CodeRetreat.Star;

class StarMap {
    private String name;
    private int age;
    private static int total = 0;

    public StarMap(String name, int age){
        this.name= name;
        this.age= age;
        total++;
    }
    public static int getTotal(){
        return total;
    }
    @Override
    public String toString(){
        return"Map[" +name + ",age: "+ age+"]";
    }
}