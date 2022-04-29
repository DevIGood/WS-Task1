package lt.viko.eif.amvisnevskij.bookstore.model;

import javax.xml.bind.annotation.XmlType;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

/**
 * Records customer's arrival and departure.
 */

@XmlType(propOrder = {"arrivalTime", "departureTime", "roomNumber"})
public class Reservation {
    private String arrivalTime;
    private String departureTime;
    private int roomNumber;

    public Reservation(String arrivalTime, String departureTime, int roomNumber) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.roomNumber = roomNumber;
    }

    public Reservation() {
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "\n\tCustomer's Reservation Data\nArrivalTime: " + arrivalTime
                + "\nDepartureTime: " + departureTime
                + "\nRoom Number: " + roomNumber;
    }
}
