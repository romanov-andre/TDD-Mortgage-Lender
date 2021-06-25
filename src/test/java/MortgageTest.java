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



}
