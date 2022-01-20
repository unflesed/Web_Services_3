import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "CATALOG")
public class Catalog {

    @XmlElement(name = "CD")
    private List<CD> cds = new ArrayList<>();

    public void add(CD cd) {
        cds.add(cd);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(cds.toArray());
    }
}
