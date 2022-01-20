import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
        Catalog catalog = new Catalog();
        CD cd1 = new CD("title1", "artist1", "Russia", "company1", 100.5, 1999);
        CD cd2 = new CD("title2", "artist2", "Belarus", "company2", 200.5, 2000);
        CD cd3 = new CD("title3", "artist3", "Ukraine", "company3", 1200.5, 1989);

        catalog.add(cd1);
        catalog.add(cd2);
        catalog.add(cd3);

        JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);

        File file1 = new File("C:\\Users\\user\\IdeaProjects\\Web_Services_3\\src\\main\\resources\\output.xml");

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(catalog, file1);

        File file = new File("C:\\Users\\user\\IdeaProjects\\Web_Services_3\\src\\main\\resources\\catalog.xml");



        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        catalog = (Catalog) unmarshaller.unmarshal(file);

        System.out.println(catalog);
    }
}
