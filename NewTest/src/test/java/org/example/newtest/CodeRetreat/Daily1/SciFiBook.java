package org.example.newtest.CodeRetreat.Daily1;

class SciFiBook extends FictionBook {
    private boolean hasAliens;

    public SciFiBook(String title, String author, boolean hasAliens) {
        super(title, author, "Sci-Fi");
        this.hasAliens = hasAliens;
    }

    @Override
    public String toString() {
        return super.toString() + "[Sci-Fi, Aliens: " + (hasAliens ? "Yes" : "No") + "]";
    }
}
