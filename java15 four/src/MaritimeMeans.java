import java.util.Date;

/**
 * @author: 周宇洋 201902200
 * @date: 2020/5/18 - 21:20
 * @discription:
 */
public class MaritimeMeans extends Transport {
    public MaritimeMeans(String ownership, String GPSosition, String price, Date dateOfPurchase, String id) {
        super(ownership, GPSosition, price, dateOfPurchase, id);
    }

    public MaritimeMeans() {
        super();
    }

    @Override
    public void drivingMethod() {
        System.out.println("Driving the MaritimeMean Transport...");
    }
    @Override
    public void load() {
        System.out.println("Loading...");
    }
    @Override
    public void maintain() {
        System.out.println("Maintain the MaritimeMean Transport...");
    }
    @Override
    public void addGas() {
        System.out.println("Adding Gas...");
    }
}
