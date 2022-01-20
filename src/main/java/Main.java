import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
        Catalog catalog = new Catalog();

        File file = new File("C:\\Users\\user\\IdeaProjects\\Web_Services_3\\src\\main\\resources\\catalog.xml");

        JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        catalog = (Catalog) unmarshaller.unmarshal(file);

        System.out.println(catalog);
    }
}
