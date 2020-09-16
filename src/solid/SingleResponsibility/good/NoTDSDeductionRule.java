package solid.SingleResponsibility.good;

public class NoTDSDeductionRule implements CalculationRule {

    @Override
    public double calculates(Employee employee) {
        return employee.getSalary();
    }
}
