package decorator;

public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    /* 递归求总价格
     * getPrice = setPrice() 的值，相当于调料的价格
     * this.drink.cost() 相当于单品咖啡 + 之前就已经加入的调料的价格 */
    public float cost() {
        return getPrice() + this.drink.cost();
    }

    @Override
    public String getDesc() {

        return  this.drink.getDesc() + "加了" + super.getDesc();
    }
}
