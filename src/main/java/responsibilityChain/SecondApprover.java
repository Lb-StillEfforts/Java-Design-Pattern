package responsibilityChain;

public class SecondApprover extends Approver {

    public SecondApprover() {
        super();
        setThreshold(10000);
        // 默认的下一个处理者
        setApprover(new FinalApprover());
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= getThreshold()) {
            System.out.println("SecondApprover 已处理...");
        } else {
            getApprover().processRequest(request);
        }
    }
}
