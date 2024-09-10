public class EmpWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int IS_FULL_TIME = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
            int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee Daily Wage: " + dailyWage);
        } else {
            System.out.println("Employee is Absent");
            System.out.println("Employee Daily Wage: 0");
        }
    }
}
