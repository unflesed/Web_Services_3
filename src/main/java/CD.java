import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CD")
public class CD {
    private String title;
    private String artist;
    private String country;
    private String company;
    private double price;
    private int year;

    public CD() {
    }

    public CD(String title, String artist, String country, String company, double price, int year) {
        this.title = title;
        this.artist = artist;
        this.country = country;
        this.company = company;
        this.price = price;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }
    @XmlElement(name = "TITLE")
    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }
    @XmlElement(name = "ARTIST")
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getCountry() {
        return country;
    }
    @XmlElement(name = "COUNTRY")
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }
    @XmlElement(name = "COMPANY")
    public void setCompany(String company) {
        this.company = company;
    }

    public double getPrice() {
        return price;
    }
    @XmlElement(name = "PRICE")
    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }
    @XmlElement(name = "YEAR")
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "CD{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", country='" + country + '\'' +
                ", company='" + company + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
