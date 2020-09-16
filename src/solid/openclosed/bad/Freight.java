package solid.openclosed.bad;

public class Freight {

    public double calculatesFreight(String geoRegion) {

        if ("DELHI".equals(geoRegion.toUpperCase())) {
            return 7.5;
        } else if ("MAHARAHSTRA".equals(geoRegion.toUpperCase())) {
            return 12.5;
        } else if ("KARNATAKA".equals(geoRegion.toUpperCase())) {
            return 10.5;
        } else {
            return 10.0;
        }
    }

}
