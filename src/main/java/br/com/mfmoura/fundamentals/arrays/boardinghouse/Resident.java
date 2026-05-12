package br.com.mfmoura.fundamentals.arrays.boardinghouse;

public class Resident {

    private String name;
    private String email;
    private int room;

    public Resident(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getRoom() {
        return room;
    }
}
