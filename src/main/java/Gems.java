import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "Gems")
public class Gems {

    @XmlElement(name = "Gem")
    private List<Gem> gems = new ArrayList<>();

    public void add(Gem gem) {
        gems.add(gem);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(gems.toArray());
    }
}
