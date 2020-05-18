import java.util.Date;

/**
 * @author: 周宇洋 201902200
 * @date: 2020/5/18 - 21:49
 * @discription:
 */
public class LandTransport {
    private String ownership;
    private String GPSosition;
    private String price;
    private Date dateOfPurchase;
    private String id;

    public LandTransport(String ownership, String GPSosition, String price, Date dateOfPurchase, String id) {
        this.ownership = ownership;
        this.GPSosition = GPSosition;
        this.price = price;
        this.dateOfPurchase = dateOfPurchase;
        this.id = id;
    }

    public LandTransport() {
    }

    public void drivingMethod() {
        System.out.println("The Person is Driving the LandTransport...");
    }
}
