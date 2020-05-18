/**
 * @author: 周宇洋 201902200
 * @date: 2020/5/18 - 20:40
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

    public void driveTransport(Aircraft ac){
        ac.drivingMethod();
    }

    public void driveTransport(Airship as){
        as.drivingMethod();
    }

    public void driveTransport(Automobile am){
        am.drivingMethod();
    }

    public void driveTransport(Bicycle bc){
        bc.drivingMethod();
    }

    public void driveTransport(HotAirBalloon hab){
        hab.drivingMethod();
    }

    public void driveTransport(Hovercraft hc){
        hc.drivingMethod();
    }

    public void driveTransport(Motorcycle mc){
        mc.drivingMethod();
    }

    public void driveTransport(Ship sp){
        sp.drivingMethod();
    }

    public void driveTransport(Submarine sm){
        sm.drivingMethod();
    }

}
