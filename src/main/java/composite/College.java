package composite;

import java.util.ArrayList;
import java.util.List;

public class College extends AbstractCompoent {

    // 存放 department
    List<AbstractCompoent> departments = new ArrayList<AbstractCompoent>();

    public College(String name) {
        super(name);
    }

    @Override
    public void add(AbstractCompoent college) {
        departments.add(college);
    }

    @Override
    public void remove(AbstractCompoent college) {
        departments.remove(college);
    }

    protected void print() {
        // 学校名称
        System.out.println("-------"+ getName() +"-------");

        //  学院名称
        for (AbstractCompoent college : departments) {
            college.print();
        }
    }
}
