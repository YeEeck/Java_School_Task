package ClassTask3.Task7;

public class SalariedEmployee extends Employee {
    private double monthSalary;

    SalariedEmployee(String name, int month, double monthSalary1) {
        super(name, month);
        monthSalary = monthSalary1;
    }

    @Override
    public double getSalary(int month){
        double res;
        if (month == getMonth()){
            res = monthSalary + 100;
        } else {
            res = monthSalary;
        }
        return res;
    }
}
