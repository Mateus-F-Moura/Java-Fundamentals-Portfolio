package br.com.mfmoura.fundamentals.compositions.socialmedia.entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
    private Instant moment;
    private String title;
    private String content;
    private Integer like = 0;
    private final List<Comment> comments = new ArrayList<>();

    public Post(Instant moment, String title, String content) {
        this.moment = moment;
        this.title = title;
        this.content = content;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLike() {
        return like;
    }

    public void addLike(boolean like) {
        if (like) {
            this.like += 1;
        }
    }

    public void removeLike(boolean like) {
        if (!like) {
            this.like -= 1;
        }
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public void removeComment(Comment comment){
        this.comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        sb.append(like);
        sb.append(" Likes - ");
        sb.append(formatter.format(moment)).append("\n");
        sb.append("Comments:\n");
        for (Comment c : comments) {
            sb.append(c.getText()).append("\n");
        }
        return sb.toString();
    }
}
