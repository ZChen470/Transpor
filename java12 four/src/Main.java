/**
 * @author: 周宇洋 201902200
 * @date: 2020/5/18 - 21:02
 * @discription: 无继承
 */

public class Main {

    public static void main(String[] args) {
        Aircraft ac = new Aircraft();
        Airship as = new Airship();
        Automobile am = new Automobile();
        Bicycle bc = new Bicycle();
        HotAirBalloon hab = new HotAirBalloon();
        Hovercraft hc = new Hovercraft();
        Motorcycle mc = new Motorcycle();
        Ship sp = new Ship();
        Submarine sm = new Submarine();

        Person Tom = new Person();
        Tom.driveTransport(ac);
        Tom.driveTransport(as);
        Tom.driveTransport(am);
        Tom.driveTransport(bc);
        Tom.driveTransport(hab);
        Tom.driveTransport(hc);
        Tom.driveTransport(mc);
        Tom.driveTransport(sp);
        Tom.driveTransport(sm);

    }
}
