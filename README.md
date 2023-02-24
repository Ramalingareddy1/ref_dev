# ref_dev
public class Employee {
    private int id;
    private String name;
    private float salary;
    
    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public float raiseSalary(float percentage) {
        float raise = this.salary * percentage / 100;
        this.salary += raise;
        return this.salary;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Employee ID:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter Employee Name:");
        String name = sc.nextLine();
        System.out.println("Please enter Employee Salary:");
        float salary = sc.nextFloat();
        Employee emp = new Employee(id, name, salary);
        System.out.println("Before raising employee salary: " + emp.salary);
        float raisedSalary = emp.raiseSalary(10); 
        System.out.println("After raising employee salary: " + raisedSalary);
    }
}
