public class User {

    private String name;
    private int id;

    public User(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void displayUser(){
        System.out.println("User: " + name);
        System.out.println("ID: " + id);
    }
}