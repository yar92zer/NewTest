package org.example.newtest.CodeRetreat.SocialNetwork;

class Post {
    private String content;
    private int likes = 0;
    private User author;

    public Post(User author, String content) {
        if (content == null || content.isEmpty()) throw new IllegalArgumentException("Content empty");
        this.author = author;
        this.content = content;
    }

    public void like() {
        likes++;
    }

    @Override
    public String toString() {
        return "\"" + content + "\" - " + author + " [Likes: " + likes + "]";
    }
}