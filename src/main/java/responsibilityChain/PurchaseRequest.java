package responsibilityChain;

public class PurchaseRequest {

    // 金额
    private double amount;

    public PurchaseRequest(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

}
