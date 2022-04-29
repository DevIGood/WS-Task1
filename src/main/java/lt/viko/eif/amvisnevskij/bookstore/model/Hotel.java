package lt.viko.eif.amvisnevskij.bookstore.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * The root of directory, contains all data about this hotel.
 */

@XmlRootElement
@XmlType(propOrder = {"hotelID", "hotelName", "address", "phoneNumber", "city", "state", "zip", "roomList", "customerList"})
public class Hotel {
    private int hotelID;
    private String hotelName;
    private String address;
    private String phoneNumber;
    private String city;
    private String state;
    private int zip;
    private List<Room> roomList = new ArrayList<>();
    private List<Customer> customerList = new ArrayList<>();

    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @XmlElement(name = "room")
    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    @XmlElement(name = "customer")
    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public String toString() {
        return "\n\tHotel Info\nHotel ID: " + hotelID
                + "\nHotel Name: " + hotelName
                + "\nHotel Address: " + address
                + "\nPhone Number: " + phoneNumber
                + "\nCity: " + city
                + "\nState: " + state
                + "\nZip: " + zip
                + "\nRooms: " + getRoomList()
                + "\nCustomers: " + getCustomerList();
    }
}
