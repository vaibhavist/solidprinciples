package solid.openclosed.good;

import solid.openclosed.Product;

public class PriceCalculator {

    private PriceTable table;
    private FreightService freight;

    public PriceCalculator(PriceTable table, FreightService freight) {
        this.table = table;
        this.freight = freight;
    }

    public double calculates(Product product) {
        double discount = table.calculatesDiscount(product.getValue());
        double freightValue = freight.calculatesFreight(product.getState());
        return product.getValue() * (1 - discount) + freightValue;
    }
}