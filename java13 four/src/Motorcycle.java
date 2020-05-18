import java.util.Date;

/**
 * @author: 周宇洋 201902200
 * @date: 2020/5/18 - 21:29
 * @discription:
 */
public class Motorcycle extends LandTransport{
    public Motorcycle(String ownership, String GPSosition, String price, Date dateOfPurchase, String id) {
        super(ownership, GPSosition, price, dateOfPurchase, id);
    }

    public Motorcycle() {
    }
}
