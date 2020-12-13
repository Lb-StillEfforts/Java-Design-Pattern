package composite;

public class Client {

    public static void main(String[] args) {
        // 学校
        AbstractCompoent university = new University("XXX大学");
        // 学院
        AbstractCompoent college_1 = new College("计算机学院");
        AbstractCompoent college_2 = new College("信息工程学院");
        // 系
        college_1.add(new Department("计算机科学与技术"));
        college_1.add(new Department("软件工程"));
        college_1.add(new Department("网络工程"));

        college_2.add(new Department("信息工程"));
        college_2.add(new Department("通信工程"));

        // 将学院加入学校
        university.add(college_1);
        university.add(college_2);

        university.print();

    }
}
