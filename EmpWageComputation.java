public class EmpWageComputation {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int WORKING_DAYS_PER_MONTH = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int totalEmpWage = 0;
        int empHours = 0;

        for (int day = 1; day <= WORKING_DAYS_PER_MONTH; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            if (empCheck == IS_FULL_TIME) {
                empHours = 8;
                System.out.println("Day " + day + ": Employee is Present (Full-Time)");
            } else if (empCheck == IS_PART_TIME) {
                empHours = 4;
                System.out.println("Day " + day + ": Employee is Present (Part-Time)");
            } else {
                empHours = 0;
                System.out.println("Day " + day + ": Employee is Absent");
            }

            int empWage = empHours * WAGE_PER_HOUR;
            totalEmpWage += empWage;

            System.out.println("Day " + day + ": Daily Wage: " + empWage);
        }

        System.out.println("Total Employee Wage for the Month: " + totalEmpWage);
    }
}
