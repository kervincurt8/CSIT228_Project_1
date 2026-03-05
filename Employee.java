public class Employee {

    protected String employeeName;

    public Employee(String employeeName){
        this.employeeName = employeeName;
    }

    public void work(){
        System.out.println(employeeName + " is working.");
    }
}