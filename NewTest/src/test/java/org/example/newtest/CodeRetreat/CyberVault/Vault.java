package org.example.newtest.CodeRetreat.CyberVault;

class Vault {
    private String owner;
    private String data;
    private boolean locked = true;
    private static int total = 0;

    public Vault(String owner, String data) {
        this.owner = owner;
        this.data = data;
        total++;
    }

    public void hack() {
        locked = false;
    }

    public void lock() {
        locked = true;
    }

    public String getOwner() {
        return owner;
    }

    public String getData() {
        return locked ? "ENCRYPTED" : data;
    }

    public boolean isLocked() {
        return locked;
    }

    public static int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return owner + " | " + (locked ? "[LOCKED]" : "[HACKED]" + data);
    }
}