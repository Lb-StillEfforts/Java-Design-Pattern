package responsibilityChain;

public class Client {

    public static void main(String[] args) {

        PurchaseRequest request = new PurchaseRequest(60000);
        FirstApprover firstApprover = new FirstApprover();

        firstApprover.processRequest(request);


    }
}
