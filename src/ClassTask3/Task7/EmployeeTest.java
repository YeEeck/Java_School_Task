package ClassTask3.Task7;

public class EmployeeTest {
    static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new SalariedEmployee("张三", 2, 3000);
        employees[1] = new HourlyEmployee("李四", 4, 15, 170);
        employees[2] = new SalesEmployee("王五", 6, 9000, 0.3);
        employees[3] = new BasedPlusSalesEmployee("小六", 1, 8000, 0.3, 1000);

        for (int i = 0; i < 4; i++) {
            Employee t = employees[i];
            print("4月" + t.getName() + "的工资是" + t.getSalary(4) + "元");
        }

    }
}
