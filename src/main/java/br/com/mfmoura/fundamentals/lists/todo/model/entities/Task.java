package br.com.mfmoura.fundamentals.lists.todo.model.entities;

import br.com.mfmoura.fundamentals.lists.todo.model.enums.Status;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Task {
    private static final DateTimeFormatter fmt = DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.SHORT)
            .withLocale(Locale.getDefault())
            .withZone(ZoneId.systemDefault());
    private final Instant moment;
    private String title;
    private String bio;
    private Status status;

    public Task(String title, String bio, Status status) {
        this.moment = Instant.now();
        this.title = title;
        this.bio = bio;
        this.status = status;
    }

    public Instant getMoment() {
        return moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "(" + fmt.format(moment) + ") " + status + ", " + title + ": " + bio;
    }
}
