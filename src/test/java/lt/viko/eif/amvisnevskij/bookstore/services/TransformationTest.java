package lt.viko.eif.amvisnevskij.bookstore.services;

import lt.viko.eif.amvisnevskij.bookstore.model.Hotel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TransformationTest {
    private Transformation transformation;
    private DataEntry dataEntry;

    @BeforeEach
    void setUp(){
        transformation = new Transformation();
    }

    @Test
    void transformToPojoTest(){

        Hotel hotel = transformation.transformToPojo("hotel.xml");

        assertNotNull(hotel);
        assertEquals(3, hotel.getCustomerList().size());
        assertEquals(6,hotel.getRoomList().size());
    }

    @Test
    void transformtoXMLTest(){

        dataEntry = new DataEntry();
        String hotelXMLcheck = transformation.transformToXML(dataEntry.getHotelData());

        assertNotNull(hotelXMLcheck);
        assertTrue(hotelXMLcheck.contains("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"));
        assertTrue(hotelXMLcheck.contains("<customer>"));
        assertTrue(hotelXMLcheck.contains("<ID>"));
        assertTrue(hotelXMLcheck.contains("<reservation>"));
        assertTrue(hotelXMLcheck.contains("<arrivalTime>"));
        assertTrue(hotelXMLcheck.contains("<departureTime>"));
        assertTrue(hotelXMLcheck.contains("<payment>"));
        assertTrue(hotelXMLcheck.contains("<expirationDate>"));
    }
}