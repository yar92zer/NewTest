package org.example.newtest.CodeRetreat.SocialNetwork;

class User {
    protected String username;
    protected int followers;
    private static int totalUsers = 0;

    public User(String username) {
        if (username == null || username.isEmpty()) throw new IllegalArgumentException("Username empty");
        this.username = username;
        this.followers = 0;
        totalUsers++;
    }

    public void gainFollower() {
        followers++;
    }

    public static int getTotal() {
        return totalUsers;
    }

    @Override
    public String toString() {
        return "@" + username + " (" + followers + " followers)";
    }
}