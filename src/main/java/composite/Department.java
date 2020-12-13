package composite;

/* 系名称- 叶子节点，不需要再实现 add和 remove */
public class Department extends AbstractCompoent{


    public Department(String name) {
        super(name);
    }

    protected void print() {
        System.out.println(getName());
    }
}
