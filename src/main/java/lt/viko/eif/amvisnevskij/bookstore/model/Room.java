package lt.viko.eif.amvisnevskij.bookstore.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Creates an object with room data.
 */

@XmlType(propOrder = {"roomNumber", "roomType", "bedType", "isFree", "cost"})
public class Room {
    private int roomNumber;
    private String roomType;
    private String bedType;
    private boolean isFree;
    private double cost;

    public Room(int roomNumber, String roomType, String bedType, boolean isFree, double cost) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.bedType = bedType;
        this.isFree = isFree;
        this.cost = cost;
    }

    public Room() {
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public boolean getisFree() {
        return isFree;
    }

    public void setisFree(boolean free) {
        isFree = free;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "\n\tRoom data\nRoom Number: " + roomNumber
                + "\nRoom type: " + roomType
                + "\nBed Type: " + bedType
                + "\nIs not occupied: " + isFree
                + "\nRoom price: " + cost;
    }
}
