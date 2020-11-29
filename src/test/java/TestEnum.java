public class TestEnum {
    enum Signal
    {
        //定义一个枚举类型
        GREEN,YELLOW,RED;
    }
    public static void main(String[] args)
    {
        System.out.println(Signal.values().getClass());
        for(int i=0;i<Signal.values().length;i++)
        {
            System.out.println("索引"+Signal.values()[i].ordinal()+"，值："+Signal.values()[i]);
        }
    }
}