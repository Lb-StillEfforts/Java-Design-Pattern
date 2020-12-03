package decorator;

public class OrderCoffee {

    public static void main(String[] args) {
        System.out.println("==== 装饰者模式 ====");

        Drink decaf = new Decaf();
        System.out.println("单品coffee: " + decaf.getDesc());
        System.out.println("价格: " + decaf.cost());
        System.out.println("---------");

        Milk milk_decaf = new Milk(decaf);
        System.out.println(milk_decaf.getDesc());
        System.out.println(milk_decaf.cost());
        milk_decaf.addSweet();
        System.out.println("---------");

        Chocolate chocolate_decaf = new Chocolate(milk_decaf);
        System.out.println(chocolate_decaf.getDesc());
        System.out.println(chocolate_decaf.cost());
        chocolate_decaf.addBitter();
    }
}
