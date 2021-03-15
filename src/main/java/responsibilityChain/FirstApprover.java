package responsibilityChain;

public class FirstApprover extends Approver {

    public FirstApprover() {
        super();
        // 默认的处理阈值
        setThreshold(500);
        // 默认的下一个处理者
        setApprover(new SecondApprover());
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= getThreshold()) {
            System.out.println("FirstApprover 已处理...");
        } else {
            getApprover().processRequest(request);
        }
    }
}
