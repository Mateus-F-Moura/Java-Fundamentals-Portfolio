package br.com.mfmoura.fundamentals.interfaces.cinema.model.entities;

import br.com.mfmoura.fundamentals.interfaces.cinema.model.enums.DubbingType;

public class Session {
    private String movieName;
    private Double basePrice;
    private DubbingType dubbingType;

    public Session(String movieName, Double basePrice, DubbingType dubbingType) {
        this.movieName = movieName;
        this.basePrice = basePrice;
        this.dubbingType = dubbingType;
    }

    public String getMovieName() { return movieName; }
    public Double getBasePrice() { return basePrice; }
    public DubbingType getDubbingType() { return dubbingType; }
}
