import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "Gem")
@XmlAccessorType(XmlAccessType.FIELD)
public class Gem {
    @XmlElement(name = "Name")
    private String name;
    @XmlElement(name = "Preciousness")
    private String preciousness;
    @XmlElement(name = "Origin")
    private String origin;
    @XmlElement(name = "Visual_parameters")
    private VisualParameters vp;
    @XmlElement(name = "Value")
    private Value value;
    @XmlAttribute(name = "id")
    private int id;

    public Gem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreciousness() {
        return preciousness;
    }

    public void setPreciousness(String preciousness) {
        this.preciousness = preciousness;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public VisualParameters getVp() {
        return vp;
    }

    public void setVp(VisualParameters vp) {
        this.vp = vp;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Gem{" +
                "name='" + name + '\'' +
                ", preciousness='" + preciousness + '\'' +
                ", origin='" + origin + '\'' + " " +
                vp + " " +
                value +
                ", id=" + id +
                '}';
    }
}