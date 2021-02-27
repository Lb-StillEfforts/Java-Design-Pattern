package visitor;
// 之所以设置为抽象类而不是接口，是因为代表人的类一般具有各种属性
public abstract class Person {

    abstract void accept(Visitor visitor);
}
