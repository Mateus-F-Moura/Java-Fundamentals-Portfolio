package ExceptionsTreatment.Reservation.model.entities;

import ExceptionsTreatment.Reservation.model.exceptions.DomainException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Reservation {
    public static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout){
        dateRulesTreatment(checkin, checkout);

        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public Integer duration() {
        Period duration = Period.between(checkin, checkout);
        return duration.getDays();
    }

    public void updateDates(LocalDate checkin, LocalDate checkout){
        dateRulesTreatment(checkin, checkout);

        this.checkin = checkin;
        this.checkout = checkout;
    }

    public void dateRulesTreatment(LocalDate checkin, LocalDate checkout){
        LocalDate now = LocalDate.now();

        if (checkin.isBefore(now) || checkout.isBefore(now)) {
            throw new DomainException("Check-in and check-out dates must be future dates");
        }

        if (!checkout.isAfter(checkin))  {
            throw new DomainException("Check-out dates must be after check-in dates");
        }
    }

    @Override
    public String toString() {
        return "Reservation: Room " + roomNumber +
                ", Check-in: " + checkin.format(fmt) +
                ", Check-out: " + checkout.format(fmt) +
                ", " + duration() + " nights.";
    }
}
