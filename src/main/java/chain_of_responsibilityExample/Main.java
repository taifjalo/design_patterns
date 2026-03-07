package chain_of_responsibilityExample;

public class Main {

    public static void main(String[] args) {

        Approver primaryApprover;

        Approver automatic = new AutomaticApprover();
        Approver inspecting = new InspectingApprover();
        Approver manual = new ManualReviewApprover();

        automatic.setNextApprover(inspecting);
        inspecting.setNextApprover(manual);
        
        primaryApprover = automatic;


        //ExpenseReport expenseReport = new ExpenseReport(50.0, false);
        //primaryApprover.process(expenseReport);

        ExpenseReport expenseReport = new ExpenseReport(15000.0, false);
        primaryApprover.process(expenseReport);
    }
}