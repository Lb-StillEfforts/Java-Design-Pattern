package responsibilityChain;

public abstract class Approver {

    // 下一个处理者
    private Approver approver;
    // 可处理金额阈值
    private double threshold;

    public Approver() {
    }


    public abstract void processRequest(PurchaseRequest request);

    public Approver getApprover() {
        return approver;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }
}
