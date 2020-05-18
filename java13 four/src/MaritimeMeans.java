import java.util.Date;

/**
 * @author: 周宇洋 201902200
 * @date: 2020/5/18 - 21:20
 * @discription:
 */
public class MaritimeMeans extends Transport{
    public MaritimeMeans(String ownership, String GPSosition, String price, Date dateOfPurchase, String id) {
        super(ownership, GPSosition, price, dateOfPurchase, id);
    }

    public MaritimeMeans() {
    }
}
