package Day6.Management;

public class Students {
    public String name = "Nick";
    private String subject = "Java";
    protected double amount = 90000;
    String dept = "CSE";

    public void display() {
        System.out.println("Name : "+ name);
        System.out.println("Subject : "+ subject);
        System.out.println("Amount : "+ amount);
        System.out.println("Department : "+ dept);
    }
}
        
