package visitor;

// 访问者模式: visitor pattern, 对于一个稳定的(不经常改变)的数据结构类型，需要进行不同的(且无关联性)操作时，
// 可以以这种形式为该数据结构提供不同的操作
public interface Visitor {

    /* 写法一 :
     * 如果将两个甚至多个函数合成一个，则满足了依赖倒置原则，即是依赖接口，
     * 但这种情况下，需要对传入参数(数据结构类型)进行判断，存在“控制耦合”
     * 若要具体操作数据结构，还需要进行转型(扩展性差)
     */
    void getResult(Person person);


    /* 写法二 :
     * 如果将两个甚至多个函数全部拆开，则破坏了依赖倒置原则，依赖的是具体元素，但是满足了单一职责原则，
     * 在这种情况下无需判断传入类型，一个函数只执行一种操作(扩展性好)
     */
//    void getManResult(Person person);
//
//    void getWomanResult(Person person);

}
