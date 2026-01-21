package org.example.newtest.CodeRetreat.SpaceStation;

class LivingModule extends Module {
    public LivingModule(String name) {
        super(name);
    }

    @Override
    public void activate() {
        System.out.println("Life support ON: " + name);
    }
}
