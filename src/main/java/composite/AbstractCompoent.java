package composite;

public abstract class AbstractCompoent {

    private String name;

    public AbstractCompoent() {}

    public AbstractCompoent(String name) {
        this.name = name;
    }

    /* 以默认方式实现，则子类不需要这些方法时可以不实现 */
    public void add(AbstractCompoent abstractCompoent) {

        throw new UnsupportedOperationException();
    }

    public void remove(AbstractCompoent abstractCompoent) {

        throw new UnsupportedOperationException();
    }

    /* 所有子类需要实现 */
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
