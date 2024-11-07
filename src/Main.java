
import Bank.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(10, "Danah Alhazeem", "Manager", 50000);

        employee.displayEmployeeDetails();

        employee.setBasicSalary(55000);

        employee.addPayment((new paymentHistory(new Date(),500,"withdraw")));
        employee.toString();

        System.out.println("Updated Employee Details:");
        employee.displayEmployeeDetails();


    }
}


