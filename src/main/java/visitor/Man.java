package visitor;

public class Man extends Person {


    @Override
    void accept(Visitor visitor) {
        visitor.getResult(this);
    }
}
