package memento;

import java.util.ArrayList;
import java.util.HashMap;

// 保存角色的状态
public class Caretaker {

    // 如果只保存一次状态
    private Memento memento;

    //  对一个角色保存多次状态
//    private ArrayList<Memento> mementos;

    // 保存多个角色的状态
//    private HashMap<String, Memento> mementoHashMap;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
