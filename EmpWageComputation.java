public class EmpWageComputation {
    
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int empHours = 0;
        int empWage = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;

        switch (empCheck) {
            case IS_FULL_TIME:
                empHours = 8;
                System.out.println("Employee is Present (Full-Time)");
                break;
            case IS_PART_TIME:
                empHours = 4;
                System.out.println("Employee is Present (Part-Time)");
                break;
            default:
                empHours = 0;
                System.out.println("Employee is Absent");
        }

        empWage = empHours * WAGE_PER_HOUR;
        System.out.println("Employee Wage: " + empWage);
    }
}
