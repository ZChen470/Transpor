import java.util.Date;

/**
 * @author: 周宇洋 201902200
 * @date: 2020/5/18 - 22:01
 * @discription:
 */
public abstract class Transport {
    private String ownership;
    private String GPSosition;
    private String price;
    private Date dateOfPurchase;
    private String id;

    public Transport(String ownership, String GPSosition, String price, Date dateOfPurchase, String id) {
        this.ownership = ownership;
        this.GPSosition = GPSosition;
        this.price = price;
        this.dateOfPurchase = dateOfPurchase;
        this.id = id;
    }

    public Transport() {
    }

    public abstract void drivingMethod();
    public abstract void load();
    public abstract void maintain();
    public abstract void addGas();
}
