package org.example.newtest.CodeRetreat.SpaceStation;

class ScienceModule extends Module {
    public ScienceModule(String name) {
        super(name);
    }

    @Override
    public void activate() {
        System.out.println("Science ON: " + name);
    }
}
