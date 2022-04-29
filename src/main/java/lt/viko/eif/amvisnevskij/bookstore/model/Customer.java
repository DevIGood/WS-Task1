package lt.viko.eif.amvisnevskij.bookstore.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Collection of all customer's data.
 */

@XmlType(propOrder = {"ID", "firstName", "lastName", "phoneNumber", "email", "bookedRoom", "payment"})
public class Customer {
    private String ID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Reservation bookedRoom;
    private Payment payment;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlElement(name = "reservation")
    public Reservation getBookedRoom() {
        return bookedRoom;
    }

    public void setBookedRoom(Reservation bookedRoom) {
        this.bookedRoom = bookedRoom;
    }

    @XmlElement(name = "payment")
    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "\n\tCustomer Info\nCustomer ID: " + ID
                + "\nFirst Name: " + firstName
                + "\nLast Name: " + lastName
                + "\nPhone Number: " + phoneNumber
                + "\nEmail: " + email
                + "\nBooked Room: " + bookedRoom
                + "\nBilled Price: " + payment;
    }
}
