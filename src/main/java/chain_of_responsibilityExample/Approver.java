package chain_of_responsibilityExample;

public abstract class Approver {

    private Approver nextApprover;

    public void process(ExpenseReport expenseReport) {
        if (nextApprover != null) {
            nextApprover.process(expenseReport);
        }
    }
    
    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

}