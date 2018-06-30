import java.util.ArrayList;
import java.util.Collections;

public class PersonTester {
  public static void main(String[] args) {
    
    ArrayList<Person> p = new ArrayList<>();
    
     p.add ( new Person("Chris", 1972));
    
		 p.add( new Student("Ken", 1979, "CompSci"));
     p.add ( new Instructor("Peter", 1950, 125000));

        for(Person c : p) {
            System.out.println(c);
        }

        System.out.println("*******SORTED BELOW*************");

        Collections.sort(p);

        for (Person c : p) {
          System.out.println(c);
        }
  }
}