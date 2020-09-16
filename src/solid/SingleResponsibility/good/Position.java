package solid.SingleResponsibility.good;

public enum Position {

    SENIOR_DEVELOPER(new TDSDeductionRule()),
    JUNIOR_DEVELOPER(new NoTDSDeductionRule());

    private CalculationRule rule;

    Position(CalculationRule rule){
        this.rule = rule;
    }

    public CalculationRule getRule() {
        return rule;
    }

}
