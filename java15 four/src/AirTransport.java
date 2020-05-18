import java.util.Date;

/**
 * @author: 周宇洋 201902200
 * @date: 2020/5/18 - 21:17
 * @discription:
 */
public class AirTransport extends Transport {
    public AirTransport(String ownership, String GPSosition, String price, Date dateOfPurchase, String id) {
        super(ownership, GPSosition, price, dateOfPurchase, id);
    }

    public AirTransport() {
        super();
    }

    @Override
    public void drivingMethod() {
        System.out.println("Driving the AirTransport...");
    }
    @Override
    public void load() {
        System.out.println("Loading...");
    }
    @Override
    public void maintain() {
        System.out.println("Maintain the AirTransport...");
    }
    @Override
    public void addGas() {
        System.out.println("Adding Gas...");
    }
}
