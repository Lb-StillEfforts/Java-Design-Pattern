package facade;
/* 外观类,
  整合子系统，
  对外提供一个统一的接口 */
public class Facade {

    private SubSystem_1 subSystem_1 = new SubSystem_1();
    private SubSystem_2 subSystem_2 = new SubSystem_2();
    private SubSystem_3 subSystem_3 = new SubSystem_3();

    public void method() {
        subSystem_1.method_1();
        subSystem_2.method_2();
        subSystem_3.method_3();
    }
}
