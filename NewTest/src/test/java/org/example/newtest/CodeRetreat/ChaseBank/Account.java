package org.example.newtest.CodeRetreat.ChaseBank;

class Account {
    private String name;
    private static int count =0;

    public Account (String name, int id){
        this.name= name;
        count++;
    }
    public String getName(){return name;}
    public static int getCount(){return count;}

}