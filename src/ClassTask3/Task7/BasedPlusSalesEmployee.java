package ClassTask3.Task7;

public class BasedPlusSalesEmployee extends SalesEmployee {
    private double base;

    BasedPlusSalesEmployee(String name, int month, double monthSale, double cent, double base1) {
        super(name, month, monthSale, cent);
        base = base1;
    }

    @Override
    public double getSalary(int month) {
        double res = getMonthSale() * getCent() + base;
        if (month == getMonth()) {
            res += 100;
        }
        return res;
    }
}
