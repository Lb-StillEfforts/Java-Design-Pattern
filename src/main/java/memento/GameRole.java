package memento;

public class GameRole {

    private int attack;
    private int defense;

    public GameRole(int attack, int defense) {
        this.attack = attack;
        this.defense = defense;
    }

    // 根据当前的状态创建 memento
    public Memento createMemento() {
        return new Memento(attack, defense);
    }

    // 从备忘录对象，恢复GameRole的状态
    public void recoverGameRoleFromMemento(Memento memento) {
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
    }

    // 显示
    public void display() {
        System.out.println("Now, GameRole attack is : " + this.attack);
        System.out.println("Now, GameRole defense is : " + this.defense);
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
