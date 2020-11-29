package prototype;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("aa", 1);
        sheep.friends = new Sheep("bb", 2);
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();

        System.out.println(sheep.friends);
        sheep1.friends.setName("cc");

        System.out.println(sheep.friends);
        System.out.println(sheep1.friends);
        System.out.println(sheep2.friends);

    }
}
