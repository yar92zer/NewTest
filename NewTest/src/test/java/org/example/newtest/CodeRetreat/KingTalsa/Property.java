package org.example.newtest.CodeRetreat.KingTalsa;

class Property extends King {
    public Property(String name) {
        super(name);
    }

    @Override
    public void timeKing() {
        System.out.println(">>> " + name + "-Карали Талсы активированы");
    }
}
