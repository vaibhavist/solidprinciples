package solid.openclosed.good;

public class Freight implements FreightService {

    @Override
    public double calculatesFreight(String geoRegion) {
        if ("DELHI".equals(geoRegion.toUpperCase())) {
            return 7.5;
        } else if ("MAHARASHTRA".equals(geoRegion.toUpperCase())) {
            return 12.5;
        } else if ("KARNATAKA".equals(geoRegion.toUpperCase())) {
            return 10.5;
        } else {
            return 10.0;
        }
    }
}