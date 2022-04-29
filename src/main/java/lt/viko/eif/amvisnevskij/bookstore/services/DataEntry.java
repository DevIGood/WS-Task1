package lt.viko.eif.amvisnevskij.bookstore.services;

import lt.viko.eif.amvisnevskij.bookstore.model.*;

import java.time.LocalDate;
import java.time.Month;

public class DataEntry {
    //TODO: Change rooms status to occupied.
    public Hotel getHotelData(){
        Hotel hotel = new Hotel();
        hotel.setHotelID(516223);
        hotel.setHotelName("BestHotel");
        hotel.setAddress("7009 NE 138th");
        hotel.setPhoneNumber("+4258225313");
        hotel.setCity("Kirkland");
        hotel.setState("Washington(WA)");
        hotel.setZip(98034);

        Room room = new Room();
        for(int i = 0; i<=200; i+=100){
            for(int j = 0; j<=3; j++){
                room = new Room(100*i+j,"Standard","Standard",false, 12.99);
                hotel.getRoomList().add(room);
            }
        }

        Reservation reservation1 = new Reservation("2022, Month.APRIL, 4", "2022, Month.APRIL, 8",101);
        Reservation reservation2 = new Reservation("2022, Month.MARCH, 14", "2022, Month.APRIL, 18",102);
        Reservation reservation3 = new Reservation("2022, Month.APRIL, 23", "2022, Month.APRIL, 27",103);

        Payment payment1 = new Payment("4556 7210 3879 3866","Andres Sisk","10/2023",12.99);
        Payment payment2 = new Payment("5307 0047 4140 7952","Leonard Shibata","12/2027",12.99);
        Payment payment3 = new Payment("4556 7210 3879 3866","Rosalba Martin","10/2023",12.99);

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();

        customer1.setID("4752709452");
        customer1.setFirstName("Andres");
        customer1.setLastName("Sisk");
        customer1.setPhoneNumber("760-359-8411");
        customer1.setEmail("AndresCSisk@rhyta.com");
        customer1.setBookedRoom(reservation1);
        customer1.setPayment(payment1);

        customer2.setID("4341693703");
        customer2.setFirstName("Leonard");
        customer2.setLastName("Shibata");
        customer2.setPhoneNumber("724-529-9788");
        customer2.setEmail("LeonardTShibata@rhyta.com");
        customer2.setBookedRoom(reservation2);
        customer2.setPayment(payment2);

        customer3.setID("4834230160");
        customer3.setFirstName("Rosalba");
        customer3.setLastName("Martin");
        customer3.setPhoneNumber("406-828-9077");
        customer3.setEmail("RosalbaRMartin@dayrep.com");
        customer3.setBookedRoom(reservation3);
        customer3.setPayment(payment3);

        hotel.getCustomerList().add(customer1);
        hotel.getCustomerList().add(customer2);
        hotel.getCustomerList().add(customer3);

        return hotel;
    }
}
//Most of the data was generated here - https://www.fakenamegenerator.com/gen-random-us-us.php