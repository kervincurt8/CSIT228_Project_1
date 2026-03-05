 class Manager extends Employee {

    public Manager(String employeeName){
        super(employeeName);
    }

    @Override
    public void work(){
        System.out.println(employeeName + " manages the bank.");
    }
}