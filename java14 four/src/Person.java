/**
 * @author: 周宇洋 201902200
 * @date: 2020/5/18 - 21:35
 * @discription:
 */
public class Person {
    private int p_Age;
    private String p_Sex;
    private String id;
    private String p_Name;

    public Person() {
    }

    public Person(int p_Age, String p_Sex, String id, String p_Name) {
        this.p_Age = p_Age;
        this.p_Sex = p_Sex;
        this.id = id;
        this.p_Name = p_Name;
    }

    public void driveTransport(LandTransport lt) {
        lt.drivingMethod();
    }
    public void driveTransport(AirTransport at) {
        at.drivingMethod();
    }
    public void driveTransport(MaritimeMeans mm) {
        mm.drivingMethod();
    }
}
