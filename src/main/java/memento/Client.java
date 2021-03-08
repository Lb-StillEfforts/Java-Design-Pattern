package memento;

public class Client {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        GameRole gameRole = new GameRole(100, 100);
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("=====初始状态=====");
        gameRole.display();

        gameRole.setAttack(50);
        gameRole.setDefense(50);
        System.out.println("=====变化后状态=====");
        gameRole.display();

        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        System.out.println("=====恢复后状态=====");
        gameRole.display();
    }
}
