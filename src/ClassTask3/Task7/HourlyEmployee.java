package ClassTask3.Task7;

public class HourlyEmployee extends Employee {
    private double perSalary, hours;

    HourlyEmployee(String name, int month, double perSalary1, double hours1) {
        super(name, month);
        perSalary = perSalary1;
        hours = hours1;
    }

    @Override
    public double getSalary(int month) {
        double res;
        if (hours <= 160) {
            res = hours * perSalary;
        } else {
            res = 160 * perSalary + 1.5 * (hours - 160) * perSalary;
        }
        if (month == getMonth()) {
            res += 100;
        }
        return res;
    }
}
