 class Employee extends Person{
    String emp_id;
    Double salary;

    Employee(String name, String dob,String emp_id,double salary){
        super(name,dob);
        this.emp_id=emp_id;
        this.salary=salary;
    }
    void DisplayDetails(){
        System.out.println("Employee ID:"+emp_id);
        System.out.println("Salary:"+salary);
    }
}
public class Demo {
    public static void main(String[] args) {
        Employee e= new Employee("Vaishnavi","06/10/2005","12345ABC",5000);
        e.Display();
        e.DisplayDetails();
    }
}
