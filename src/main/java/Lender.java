public class Lender {

    private double funds;

    private double pendingfunds;

    public void depositFunds(double funds) {
        this.funds = funds;
    }
    public double getAvailableFunds() {
        return funds;
    }

    public void addFunds(double extraFunds) {
        funds += extraFunds;
    }

    public String isApproved(double loanAmount) {
        if (funds >= loanAmount) {
            return "approved";
        }
        return "denied";
    }

    public void offerSent(Loan loan) {
        if (isApproved(loan.getAmount()).equals("approved")){
            funds -= loan.getAmount();
            pendingfunds = loan.getAmount();
            loan.setPendingStatus(true);
        }
    }
}
