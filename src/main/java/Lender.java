public class Lender {

    private double funds;

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
}
