import java.util.Date;

/**
 * @author: 周宇洋 201902200
 * @date: 2020/5/18 - 21:45
 * @discription:
 */
public class AirTransport {
    private String ownership;
    private String GPSosition;
    private String price;
    private Date dateOfPurchase;
    private String id;

    public AirTransport(String ownership, String GPSosition, String price, Date dateOfPurchase, String id) {
        this.ownership = ownership;
        this.GPSosition = GPSosition;
        this.price = price;
        this.dateOfPurchase = dateOfPurchase;
        this.id = id;
    }

    public AirTransport() {
    }

    public void drivingMethod() {
        System.out.println("The Person is Driving the AirTransport...");
    }
}
