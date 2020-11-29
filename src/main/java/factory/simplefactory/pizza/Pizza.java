package factory.simplefactory.pizza;

public abstract class Pizza {

    protected String pizzaName;

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public abstract void prepare();

    public void commonFun() {
        System.out.println(this.pizzaName + "正在烘烤中...");
        System.out.println(this.pizzaName + "正在切片中...");
        System.out.println(this.pizzaName + "正在包装中...");
        System.out.println(this.pizzaName + "制作成功~");
    }
}
