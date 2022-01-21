import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Visual_parameters")
@XmlAccessorType(XmlAccessType.FIELD)
public class VisualParameters {
    @XmlElement
    private String color;
    @XmlElement
    private byte transparency;
    @XmlElement(name = "cutting_methods")
    private byte cuttingMethods;

    public VisualParameters() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getTransparency() {
        return transparency;
    }

    public void setTransparency(byte transparency) {
        this.transparency = transparency;
    }

    public byte getCuttingMethods() {
        return cuttingMethods;
    }

    public void setCuttingMethods(byte cuttingMethods) {
        this.cuttingMethods = cuttingMethods;
    }

    @Override
    public String toString() {
        return "VisualParameters{" +
                "color='" + color + '\'' +
                ", transparency=" + transparency +
                ", cuttingMethods=" + cuttingMethods +
                '}';
    }
}