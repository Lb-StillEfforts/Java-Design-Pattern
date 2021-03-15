package responsibilityChain;

public class FinalApprover extends Approver {

    public FinalApprover() {
        super();
        // 默认的下一个处理者
        setApprover(null);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("FinalApprover 已处理...");

    }
}
