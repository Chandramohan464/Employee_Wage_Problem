public class EmpWageComputation {

    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int MAX_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int totalEmpWage = 0;
        int totalEmpHours = 0;
        int totalWorkingDays = 0;

        while (totalEmpHours < MAX_WORKING_HOURS && totalWorkingDays < MAX_WORKING_DAYS) {
            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            int empHours = 0;

            if (empCheck == IS_FULL_TIME) {
                empHours = 8;
                System.out.println("Day " + totalWorkingDays + ": Employee is Present (Full-Time)");
            } else if (empCheck == IS_PART_TIME) {
                empHours = 4;
                System.out.println("Day " + totalWorkingDays + ": Employee is Present (Part-Time)");
            } else {
                empHours = 0;
                System.out.println("Day " + totalWorkingDays + ": Employee is Absent");
            }

            totalEmpHours += empHours;

            int empWage = empHours * WAGE_PER_HOUR;
            totalEmpWage += empWage;

            System.out.println("Day " + totalWorkingDays + ": Daily Wage: " + empWage);
            System.out.println("Total Hours Worked till now: " + totalEmpHours);
        }

        System.out.println("Total Employee Wage for the Month: " + totalEmpWage);
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalEmpHours);
    }
}
