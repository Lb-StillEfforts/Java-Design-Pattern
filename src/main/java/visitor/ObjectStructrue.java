package visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructrue {

    private List<Person> persons = new LinkedList<>();

    public void attach(Person p) {
        persons.add(p);
    }

    public void detach(Person p) {
        persons.remove(p);
    }

    public void display(Visitor visitor) {
        for (Person person : persons) {
            person.accept(visitor);
        }
    }
}
