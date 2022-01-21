import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "Value")
@XmlAccessorType(XmlAccessType.FIELD)
public class Value {
    @XmlAttribute(name = "measure")
    private String measure;
    @XmlValue
    private byte value;

    public Value() {
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public byte getValue() {
        return value;
    }

    public void setValue(byte value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Value{" +
                "measure='" + measure + '\'' +
                ", value=" + value +
                '}';
    }
}