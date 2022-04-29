package lt.viko.eif.amvisnevskij.bookstore;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import lt.viko.eif.amvisnevskij.bookstore.model.*;
import lt.viko.eif.amvisnevskij.bookstore.services.*;

public class Main {
    public static void main(String[] args) throws JAXBException, IOException {

        Transformation transformer = new Transformation();
        Hotel hotel = transformer.transformToPojo("hotel.xml");

        System.out.println(hotel); // performing transformation to object and outputting result

        Scanner scanner = new Scanner(System.in);
        System.out.println("1)Set room as free\n2)Change customer's name and surname");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("Choose which room to change(enter index of the room)");
                Scanner scan = new Scanner(System.in);
                int num = scan.nextInt();
                scan.close();
                hotel.getRoomList().get(num).setisFree(false);
                break;
            case "2":
                System.out.println("Choose which customer to change(enter index of the customer)");
                Scanner scan1 = new Scanner(System.in);
                int num1 = scan1.nextInt();
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Enter name:");
                String choice1 = scanner.nextLine();
                System.out.println("Enter surname:");
                String choice2 = scanner.nextLine();
                hotel.getCustomerList().get(num1).setFirstName(choice1);
                hotel.getCustomerList().get(num1).setLastName(choice2);
                break;
            default:
                System.out.println("Wrong input");
                break;
        }
        System.out.println();
        transformer.transformToXML(hotel); // performing transformation to XML and outputting result
    }
}
