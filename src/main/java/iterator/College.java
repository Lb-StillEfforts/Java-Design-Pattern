package iterator;

import java.util.Iterator;

public interface College {

    String getName();

    void addDepartment(String name, String descript);

    Iterator createIterator();
}
