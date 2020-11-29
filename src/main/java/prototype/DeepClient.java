package prototype;

public class DeepClient {

    public static void main(String[] args) {
        DeepCopyInner deepCopyInner = new DeepCopyInner("deepCopyInner");
        DeepCopy deepCopy = new DeepCopy("deepCopy", deepCopyInner);

        DeepCopy deepCopy_1 = (DeepCopy) deepCopy.clone();
        deepCopy.getDeepCopyInner().setCloneName("deepCopyInner_1");
        System.out.println(deepCopy);
        System.out.println(deepCopy_1);

        System.out.println(deepCopy.getDeepCopyInner().hashCode());
        System.out.println(deepCopy_1.getDeepCopyInner().hashCode());
    }
}
