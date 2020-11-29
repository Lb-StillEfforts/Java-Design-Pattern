package prototype;

import java.io.Serializable;

public class DeepCopyInner implements Serializable {

//    private static final long serialVersionUID = 1L;

    private String cloneName;

    public DeepCopyInner() {
    }

    public DeepCopyInner(String cloneName) {
        this.cloneName = cloneName;
    }

    public String getCloneName() {
        return cloneName;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    public String toString() {
        return "DeepCopyInner{" +
                "cloneName='" + cloneName + '\'' +
                '}';
    }
}
