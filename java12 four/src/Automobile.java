import java.util.Date;

/**
 * @author: 周宇洋 201902200
 * @date: 2020/5/18 - 20:57
 * @discription:
 */
public class Automobile {
    private String ownership;
    private String GPSosition;
    private String price;
    private Date dateOfPurchase;
    private String id;

    public Automobile(String ownership, String GPSosition, String price, Date dateOfPurchase, String id) {
        this.ownership = ownership;
        this.GPSosition = GPSosition;
        this.price = price;
        this.dateOfPurchase = dateOfPurchase;
        this.id = id;
    }

    public Automobile() {
    }

    public void drivingMethod() {
        System.out.println("Driving Automobile...");
    }
}
