package prototype;

import java.io.*;

public class DeepCopy implements Serializable,Cloneable {

    private String name;
    // 引用类型
    private DeepCopyInner deepCopyInner;

    public DeepCopy() {

    }
    public DeepCopy(String name, DeepCopyInner deepCopyInner) {
        this.name = name;
        this.deepCopyInner = deepCopyInner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCopyInner getDeepCopyInner() {
        return deepCopyInner;
    }

    public void setDeepCopyInner(DeepCopyInner deepCopyInner) {
        this.deepCopyInner = deepCopyInner;
    }

    @Override
    public String toString() {
        return "DeepCopy{" +
                "name='" + name + '\'' +
                ", deepCopyInner=" + deepCopyInner +
                '}';
    }

    /* 深拷贝实现方式一 : 对引用类型逐个处理 (不推荐使用) */
//    @Override
//    protected Object clone() {
//        DeepCopy deep = null;
//        try {
//            deep = (DeepCopy) super.clone();
//            DeepCopyInner deepCopyInner = (DeepCopyInner) deep.getDeepCopyInner().clone();
//            deep.setDeepCopyInner(deepCopyInner);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return deep;
//    }

    /* 深拷贝实现方式二 : 将整个对象序列化 (推荐使用) */

    @Override
    protected Object clone() {

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); // 将当前对象以对象流的方式输出

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray()); // 将oos的输出读入
            ois = new ObjectInputStream(bis);
            DeepCopy deep = (DeepCopy) ois.readObject();

            return deep;
        } catch (Exception e) {
            e.printStackTrace();
            // 出现异常返回null
            return null;
        } finally {
            close(bos, oos, bis, ois);
        }

    }

    private void close(ByteArrayOutputStream bos, ObjectOutputStream oos, ByteArrayInputStream bis, ObjectInputStream ois){

        try {
            bos.close();
            oos.close();
            bis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
