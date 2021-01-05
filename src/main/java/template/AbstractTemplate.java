package template;

/* 抽象模板类 */
public abstract class AbstractTemplate {

    /* 模板方法，规定了方法执行顺序(算法骨架) */
    final void template(){
        step_1();
        step_2();
        step_3();
    };

    void step_1() {
        System.out.println("step-1 默认已实现，子类可不实现");
    };

    /* step-2 是'钩子方法' 子类选择实现 */
    void step_2() {

    };

    /* 交由子类实现 */
    abstract void step_3();

}
