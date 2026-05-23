package Day6.CSE;

import Day6.Management.Students;

public class TestStudent {
    public static void main(String[] args) {
        
    Students s = new Students();
    s.name = "Honey";

    s.display();
    
    System.out.println(s.name);

    //System.out.println(s.subject); //private
    //System.out.println(s.amount); //protected
    //System.out.println(s.dept); //default
    }
}
