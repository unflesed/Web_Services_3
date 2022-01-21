import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
        Gems gems = new Gems();

        JAXBContext jaxbContext = JAXBContext.newInstance(Gems.class);

        File file = new File("C:\\Users\\user\\IdeaProjects\\Web_Services_3\\src\\main\\resources\\diamonds.xml");

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        gems = (Gems) unmarshaller.unmarshal(file);

        System.out.println(gems);
    }
}
