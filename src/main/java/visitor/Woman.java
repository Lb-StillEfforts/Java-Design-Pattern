package visitor;

public class Woman extends Person {
    @Override
    void accept(Visitor visitor) {
        visitor.getResult(this);
    }
}
