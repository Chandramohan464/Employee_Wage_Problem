public class EmpWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int IS_FULL_TIME = 1;
        int WAGE_PER_HOUR = 20;
        int IS_PART_TIME = 2;
        int empHours = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;

        if (empCheck == IS_FULL_TIME) {
            empHours = 8;
            System.out.println("Employee is Present (Full-Time)");
        } else if (empCheck == IS_PART_TIME) {
            empHours = 4;
            System.out.println("Employee is Present (Part-Time)");
        } else {
            empHours = 0;
            System.out.println("Employee is Absent");
        }

        int dailyWage = WAGE_PER_HOUR * empHours;
        System.out.println("Employee Daily Wage: " + dailyWage);
    }
}
