package iterator;

import java.util.ArrayList;
import java.util.List;

// 迭代器模式
public class Client {

    public static void main(String[] args) {

        List<College> colleges = new ArrayList<>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        colleges.add(computerCollege);
        colleges.add(infoCollege);
        OutputImpl output = new OutputImpl(colleges);

        output.printCollege();
    }
}
