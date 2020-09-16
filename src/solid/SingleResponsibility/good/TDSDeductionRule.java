package solid.SingleResponsibility.good;

public class TDSDeductionRule implements CalculationRule {

    @Override
    public double calculates(Employee employee) {
        return employee.getSalary() - (employee.getSalary() * 0.10);
    }
}
