import java.util.Date;

/**
 * @author: 周宇洋 201902200
 * @date: 2020/5/18 - 21:42
 * @discription:
 */
public class Submarine extends MaritimeMeans{
    public Submarine(String ownership, String GPSosition, String price, Date dateOfPurchase, String id) {
        super(ownership, GPSosition, price, dateOfPurchase, id);
    }

    public Submarine() {
    }
}
