package composite;

import java.util.ArrayList;
import java.util.List;

public class University extends AbstractCompoent {

    List<AbstractCompoent> colleges = new ArrayList<AbstractCompoent>();

    public University(String name) {
        super(name);
    }

    @Override
    public void add(AbstractCompoent college) {
        colleges.add(college);
    }

    @Override
    public void remove(AbstractCompoent college) {
        colleges.remove(college);
    }

    protected void print() {
        // 学校名称
        System.out.println("-------"+ getName() +"-------");

        //  学院名称
        for (AbstractCompoent college : colleges) {
            college.print();
        }
    }
}
