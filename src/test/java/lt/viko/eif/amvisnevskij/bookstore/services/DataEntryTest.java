package lt.viko.eif.amvisnevskij.bookstore.services;

import lt.viko.eif.amvisnevskij.bookstore.model.Hotel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataEntryTest {

    private DataEntry dataEntry;
    @BeforeEach
    void setUp() {dataEntry = new DataEntry();
    }

    @Test
    void DataEntryTesting(){
        Hotel hotel = dataEntry.getHotelData();

        assertNotNull(hotel);

        assertEquals(101,hotel.getRoomList().get(0).getRoomNumber());
        assertEquals(true,hotel.getRoomList().get(0).getisFree());
        assertEquals(102,hotel.getRoomList().get(1).getRoomNumber());
        assertEquals(true,hotel.getRoomList().get(1).getisFree());
        assertEquals(103,hotel.getRoomList().get(2).getRoomNumber());
        assertEquals(true,hotel.getRoomList().get(2).getisFree());
        assertEquals(201,hotel.getRoomList().get(3).getRoomNumber());
        assertEquals(false,hotel.getRoomList().get(3).getisFree());

        assertEquals("Andres",hotel.getCustomerList().get(0).getFirstName());
        assertEquals(101,hotel.getCustomerList().get(0).getBookedRoom().getRoomNumber());
        assertEquals(12.99,hotel.getCustomerList().get(0).getPayment().getBilledAmount());
        assertEquals("Leonard",hotel.getCustomerList().get(1).getFirstName());
        assertEquals(102,hotel.getCustomerList().get(1).getBookedRoom().getRoomNumber());
        assertEquals(12.99,hotel.getCustomerList().get(1).getPayment().getBilledAmount());
        assertEquals("Rosalba",hotel.getCustomerList().get(2).getFirstName());
        assertEquals(103,hotel.getCustomerList().get(2).getBookedRoom().getRoomNumber());
        assertEquals(12.99,hotel.getCustomerList().get(2).getPayment().getBilledAmount());
    }



}