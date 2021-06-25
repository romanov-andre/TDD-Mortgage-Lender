public class Candidate {

    //state variables
    private int dti;

    private double credit_score;

    private double savings;

    private boolean isQualified;

    public Candidate(int dti, double credit_score, double savings) {
        this.dti = dti;
        this.credit_score = credit_score;
        this.savings = savings;
    }

    public Candidate(){
        this(30, 650, 100000);
    }

    public boolean isQualified(double loanAmount) {
        //Qualifying candidates must have debt-to-income (DTI)
        // less than 36%, credit score above 620 and
        // savings worth 25% of requested loan amount.
        if(credit_score > 620 && savings > loanAmount * .25 && dti < 36 )
        return this.isQualified = true;
        return false;
    }

    public boolean acceptOffer(Loan loan) {

    }
}
