package org.example.newtest.CodeRetreat.Cinema;

class Screening extends Movie {
    private String time;
    private int seats = 100;

    public Screening(String title, int duration, String time) {
        super(title, duration);
        this.time = time;
    }

    public boolean bookSeat() {
        if (seats > 0) {
            seats--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + " @ " + time + " [Seats: " + seats + "]";
    }
}
