package chain_of_responsibilityExample;

public class ExpenseReport {
    private double expenses;
    private boolean planned;

    public ExpenseReport(double expenses, boolean planned) {
        this.expenses = expenses;
        this.planned = planned;
    }

    public double getExpenses() {
        return expenses;
    }

    public boolean isPlanned() {
        return planned;
    }
}