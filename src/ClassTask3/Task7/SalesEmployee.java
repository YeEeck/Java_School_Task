package ClassTask3.Task7;

public class SalesEmployee extends Employee {
    private double monthSale, cent;

    SalesEmployee(String name1, int month1, double monthSale1, double cent1) {
        super(name1, month1);
        monthSale = monthSale1;
        cent = cent1;
    }

    @Override
    public double getSalary(int month) {
        double res = monthSale * cent;
        if (month == getMonth()) {
            res += 100;
        }
        return res;
    }

    public double getMonthSale() {
        return monthSale;
    }

    public double getCent() {
        return cent;
    }
}
