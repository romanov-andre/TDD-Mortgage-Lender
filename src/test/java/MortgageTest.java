import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MortgageTest {

    @Test
    void checkAvailableFunds() {
        Lender lender = new Lender();
        assertEquals(lender.getAvailableFunds(), 0);
    }

    @Test
    void addFunds() {
        Lender lender = new Lender();
        double currentAmount = 100000;
        lender.depositFunds(currentAmount);
        double depositAmount = 50000;
        lender.addFunds(depositAmount);
        assertEquals(lender.getAvailableFunds(), currentAmount + depositAmount);
    }

    @Test
    void applicationApprovalOrDenial() {
        Lender lender = new Lender();
        lender.depositFunds(100000);
        double loanAmount = 125000;
        assertEquals(lender.isApproved(loanAmount), "denied");
        lender.depositFunds(125000);
        loanAmount = 125000;
        assertEquals(lender.isApproved(loanAmount), "approved");

    }

    @Test
    void testQualifiedCandidate(){
        //SEAT
        //SETUP
        int dti = 21;
        double credit_score = 700;
        double savings = 100000;
        double loanRequestAmount = 250000;
        //Execution
        Candidate candidate = new Candidate(dti, credit_score, savings);
        //Assertion
        assertEquals(true,candidate.isQualified(loanRequestAmount));
        //termination
    }

    @Test
    void testLoanStatus(){
        //SEAT
        //SETUP
        Lender lender = new Lender();

        lender.depositFunds(50000);
        double offerSentAmount = 100000;
        Loan loan = new Loan(offerSentAmount);
        String nonLoanStatus = "not Pending";
        String pendingStatus = "pending";
        lender.offerSent(loan);
        assertEquals(nonLoanStatus,loan.getPendingStatus());

    }

    @Test
    public void testUpdatePendingLoanStatus(){

        //SEAT
        //SETUP
        Lender lender = new Lender();
        lender.depositFunds(50000);
        double offerSentAmount = 100000;
        Loan loan = new Loan(offerSentAmount);
        //EXECUTION
        Candidate candidate = new Candidate();
        candidate.isQualified(offerSentAmount);
        boolean accepted = candidate.acceptOffer(loan);
        lender.processOffer(accepted);
        //ASSERTION
        assertEquals("accepted",loan.setStatus());

    }






}
