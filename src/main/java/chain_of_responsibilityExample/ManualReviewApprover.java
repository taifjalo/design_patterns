package chain_of_responsibilityExample;

public class ManualReviewApprover extends Approver {
    @Override
    public void process(ExpenseReport expenseReport) {
        System.out.println("ManualReviewApprover: Expense report sent for manual review.");
    }
}
