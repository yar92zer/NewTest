package org.example.newtest.CodeRetreat.LordOfTheRings;

class OneRing {
    private static RingBearer currentBearer = null;

    public static boolean isTaken() {
        return currentBearer != null;
    }

    public static RingBearer getBearer() {
        return currentBearer;
    }

    public static void take(RingBearer bearer) {
        if (currentBearer != null) {
            currentBearer.hasRing = false;
            System.out.println(currentBearer.getName() + " теряет Кольцо...");
        }
        currentBearer = bearer;
    }

    public static void destroy() {
        if (isTaken()) {
            currentBearer.hasRing = false;
            System.out.println(currentBearer.getName() + " теряет Кольцо навсегда...");
            currentBearer = null;
        }
    }
}