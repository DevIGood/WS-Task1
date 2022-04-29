package lt.viko.eif.amvisnevskij.bookstore.services;

import lt.viko.eif.amvisnevskij.bookstore.model.Hotel;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class Transformation {
    //TODO: We also need to validate XML file.
    private JAXBContext jaxbContext;

    public Transformation(){

        try {
            jaxbContext = JAXBContext.newInstance(Hotel.class);
        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
    }

    public Hotel transformToPojo(String fileName) {  // from XML to objects

        Hotel hotel = null;
        try {
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            Path filePath = Path.of(fileName);
            String actual = Files.readString(filePath); // reading xml string from file
            System.out.print(actual);
            StringReader reader = new StringReader(actual);

            hotel = (Hotel) unmarshaller.unmarshal(reader);
        } catch (JAXBException | IOException e) {
            System.out.println(e.getMessage());
        }

        return hotel;
    }

    public String transformToXML(Hotel hotel) { // from objects to XML

        StringWriter xmlWriter = new StringWriter();

        try {
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(hotel, xmlWriter);

            System.out.println(xmlWriter);

        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
        return xmlWriter.toString();
    }
}
