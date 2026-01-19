package Interfaces.Cinema.model.entities;

import Interfaces.Cinema.model.enums.EntranceType;

public class Entrance {
    private Session session;
    private EntranceType entranceType;

    public Entrance(Session session, EntranceType entranceType) {
        this.session = session;
        this.entranceType = entranceType;
    }

    public Double getBaseValue() {
        return session.getBasePrice();
    }

    public EntranceType getEntranceType() {
        return entranceType;
    }

    public Double getDiscountedValue() {
        return (entranceType == EntranceType.HALF) 
                ? session.getBasePrice() * 0.5 
                : session.getBasePrice();
    }

    @Override
    public String toString() {
        return String.format("Ticket for %s (%s) - %s: $ %.2f", 
                session.getMovieName(), session.getDubbingType(), 
                entranceType, getDiscountedValue());
    }
}
