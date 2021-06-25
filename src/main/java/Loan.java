public class Loan {

   private double loanAmount;

   private String nonPending = "not Pending";
   private String pending = "pending";


   private boolean pendingStatus;

   public Loan(double loanAmount){
       this.loanAmount = loanAmount;
   }

    public double getAmount() {
       return loanAmount;
    }

    public String getPendingStatus() {
       if(pendingStatus){
           return pending;
       } return nonPending;
    }

    public void setPendingStatus(boolean pendingStatus){
       this.pendingStatus = pendingStatus;
    }
}
