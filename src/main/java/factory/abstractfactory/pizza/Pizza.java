package factory.abstractfactory.pizza;

public abstract class Pizza {

    protected String location;
    protected String pizzaName;

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public abstract void prepare();

    public void commonFun() {
        System.out.println(this.location+ "的" +this.pizzaName + "正在烘烤中...");
        System.out.println(this.location+ "的" +this.pizzaName + "正在切片中...");
        System.out.println(this.location+ "的" +this.pizzaName + "正在包装中...");
        System.out.println(this.location+ "的" +this.pizzaName + "制作成功~");
    }
}
